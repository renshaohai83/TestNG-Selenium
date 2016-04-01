package com.emar.test.testcases.yiqifabackfront.earnerfront.datastatistics;

import org.databene.benerator.anno.Database;
import org.databene.benerator.anno.Source;
import org.databene.feed4testng.FeedTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.emar.test.action.AlertAction;
import com.emar.test.action.ButtonAction;
import com.emar.test.action.CalanderAction;
import com.emar.test.action.CheckBoxAction;
import com.emar.test.action.InputTextAction;
import com.emar.test.action.LinkAction;
import com.emar.test.action.RadioButtonAction;
import com.emar.test.action.TableAction;
import com.emar.test.action.TextAction;
import com.emar.test.action.WebAction;
import com.emar.test.data.K;
import com.emar.test.initviews.yiqifafront.earnerfront.datastatistics.PerformanceStatisticsInitview;
import com.emar.test.process.yiqifabackend.ProcessUtil;
import com.emar.test.testutils.WebUtil;


/* 业绩统计的测试类：
*/
@Database(id = "db", url = "jdbc:mysql://172.16.17.182:3306/yiqifa_bs_88", 
driver = "com.mysql.jdbc.Driver", user = "yiqifa_bs_88", password = "yiqifa_bs_88")

public class PerformanceStatistics extends FeedTest{


	private static final Logger logger = LoggerFactory.getLogger(PerformanceStatistics.class);
	
	private ProcessUtil mProcessUtil;
	private PerformanceStatisticsInitview minit;

	WebDriver driver = mProcessUtil.driver;
	WebDriverWait wait = new WebDriverWait(driver,15);
	WebUtil  mWebUtil = new WebUtil();
	TableAction table = new TableAction();
	AlertAction alertaction = new AlertAction(driver);
	ButtonAction ButtonAction = new ButtonAction();
	InputTextAction InputTextAction = new InputTextAction();
	RadioButtonAction  RadioButtonAction = new RadioButtonAction();
	WebAction WebAction = new WebAction(driver);
	TextAction TextAction = new TextAction();
	CheckBoxAction CheckBoxAction = new CheckBoxAction();
	LinkAction LinkAction = new LinkAction();
	CalanderAction  CalanderAction = new CalanderAction(driver);
	
	@BeforeTest
	public void beforeTest() {
		  //登录
		  ProcessUtil.yiqifaFrontend_earner_login();
			
	  }
	  @AfterTest
	public void afterTest() {
		 driver.quit();
	  }	 
	  @BeforeMethod
	public void beforeMethod() {
		  //初始页面
		  driver.get(K.yiqifa_FrontendWeb_ProfermanceStatistics);
			
	  }
	@AfterMethod
	public void afterMethod() {
		  //回到初始页面
		  driver.get(K.yiqifa_FrontendWeb_ProfermanceStatistics);
	  }

	
	/**
	 * @author renshaohai
 		yd-4792:默认指标测试
	 * 1.自定义指标选中的系统默认值勾选上的有：（初始值）
		选中项：点击、收订订单数、收订订单额、发生行为、订单预计佣金、行为预计佣金、总预计佣金；
	 * */
	@Test
	public void test_yd_4792(){
		//点击自定义指标
		ButtonAction.click(minit.userDefined_btn(driver));
		
		//点击系统默认指标
		LinkAction.click(minit.userDefined_systemDefined_link(driver));
		
		//选中项：点击、收订订单数、收订订单额、发生行为、订单预计佣金、行为预计佣金、总预计佣金；
		Assert.assertTrue(CheckBoxAction.isSelect(minit.userDefined_click_checkbox(driver)));
		//收订订单数
		Assert.assertTrue(CheckBoxAction.isSelect(minit.userDefined_subscribingOrdersNum_checkbox(driver)));
		//收订订单额
		Assert.assertTrue(CheckBoxAction.isSelect(minit.userDefined_subscribingOrdersMoney_checkbox(driver)));
		//发生行为
		Assert.assertTrue(CheckBoxAction.isSelect(minit.userDefined_allActive_checkbox(driver)));
		//订单预计佣金
		Assert.assertTrue(CheckBoxAction.isSelect(minit.userDefined_orderExpectedCommission_checkbox(driver)));
		//行为预计佣金
		Assert.assertTrue(CheckBoxAction.isSelect(minit.userDefined_activeExpectedCommission_checkbox(driver)));
		//总预计佣金
		Assert.assertTrue(CheckBoxAction.isSelect(minit.userDefined_allExpectedCommission_checkbox(driver)));

		//未选中项
		//自定义指标-订单指标-有效订单数
		Assert.assertFalse(CheckBoxAction.isSelect(minit.userDefined_effectiveOrdersNum_checkbox(driver)));
		///自定义指标-订单指标-有效订单佣金
		Assert.assertFalse(CheckBoxAction.isSelect(minit.userDefined_effectiveOrdersMoney_checkbox(driver)));
	    //自定义指标-行为指标-有效行为
		Assert.assertFalse(CheckBoxAction.isSelect(minit.userDefined_effectiveActive_checkbox(driver)));
	    //佣金指标-订单确认佣金
		Assert.assertFalse(CheckBoxAction.isSelect(minit.userDefined_orderConfirmedCommission_checkbox(driver)));
	    //佣金指标-行为确认佣金
		Assert.assertFalse(CheckBoxAction.isSelect(minit.userDefined_activeConfirmedCommission_checkbox(driver)));
	    //佣金指标-总确认佣金
		Assert.assertFalse(CheckBoxAction.isSelect(minit.userDefined_allConfirmedCommission_checkbox(driver)));
   
	}

	/**
	 * @author renshaohai
	 *  yd-5408:报表字段：点击数 按日
	 *   网站主首页--》数据报表--》勾选所有的指标并确定
	 *   每日点击数查询：
		SELECT SUM(click_amount) FROM `datasum_1504` WHERE DAY ='2015-04-01' AND earner_id='102'
	 * */
	 @Test(dataProvider = "feeder")
	 @Source(id="db", selector = "SELECT SUM(click_amount) FROM `datasum_1504` WHERE DAY ='2015-04-01' AND earner_id='102';")
	public void test_yd_5408(String click_amount){
		//开始时间设为2015-04-01
		CalanderAction.removeReadOnly(minit.startTime_inputText(driver));
		InputTextAction.sendKeys(minit.startTime_inputText(driver),"2015-04-01");
		//结束时间设为2015-04-01
		CalanderAction.removeReadOnly(minit.endTime_inputText(driver));
		InputTextAction.sendKeys(minit.endTime_inputText(driver),"2015-04-01");
		
		//按日
		ButtonAction.click(minit.byDay_btn(driver));
		
		//选择所有的条件
		//选中项：点击
		CheckBoxAction.selected(minit.userDefined_click_checkbox(driver));
		//收订订单数
		CheckBoxAction.selected(minit.userDefined_subscribingOrdersNum_checkbox(driver));
		//收订订单额
		CheckBoxAction.selected(minit.userDefined_subscribingOrdersMoney_checkbox(driver));
		//发生行为
		CheckBoxAction.selected(minit.userDefined_allActive_checkbox(driver));
		//订单预计佣金
		CheckBoxAction.selected(minit.userDefined_orderExpectedCommission_checkbox(driver));
		//行为预计佣金
		CheckBoxAction.selected(minit.userDefined_activeExpectedCommission_checkbox(driver));
		//总预计佣金
		CheckBoxAction.selected(minit.userDefined_allExpectedCommission_checkbox(driver));
		//自定义指标-订单指标-有效订单数
		CheckBoxAction.selected(minit.userDefined_effectiveOrdersNum_checkbox(driver));
		///自定义指标-订单指标-有效订单佣金
		CheckBoxAction.selected(minit.userDefined_effectiveOrdersMoney_checkbox(driver));
		//自定义指标-行为指标-有效行为
		CheckBoxAction.selected(minit.userDefined_effectiveActive_checkbox(driver));
		//佣金指标-订单确认佣金
		CheckBoxAction.selected(minit.userDefined_orderConfirmedCommission_checkbox(driver));
		//佣金指标-行为确认佣金
		CheckBoxAction.selected(minit.userDefined_activeConfirmedCommission_checkbox(driver));
		//佣金指标-总确认佣金
		CheckBoxAction.selected(minit.userDefined_allConfirmedCommission_checkbox(driver));

		//点击确定
		ButtonAction.click(minit.userDefined_ok_btn(driver));
		//点击查询按钮
		ButtonAction.click(minit.query_btn(driver));
		
		
	}
}
