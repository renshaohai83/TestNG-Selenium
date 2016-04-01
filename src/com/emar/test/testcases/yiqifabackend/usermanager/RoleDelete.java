package com.emar.test.testcases.yiqifabackend.usermanager;

import java.util.List;

import org.openqa.selenium.Alert;
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
import com.emar.test.action.TableAction;
import com.emar.test.data.K;
import com.emar.test.initviews.yiqifabackend.usermanage.RoleManageView;
import com.emar.test.process.yiqifabackend.ProcessUtil;
import com.emar.test.testutils.WebUtil;

public class RoleDelete {
	private static final Logger logger = LoggerFactory.getLogger(RoleDelete.class);
	
	private ProcessUtil mProcessUtil;
	private RoleManageView minit;
	 
	
	WebDriver driver = mProcessUtil.driver;
	WebDriverWait wait = new WebDriverWait(driver,15);
	WebUtil  mWebUtil = new WebUtil();
	TableAction table = new TableAction();
	AlertAction alertaction = new AlertAction(driver);

	 @BeforeTest
	  public void beforeTest() {
		  //登录
		  ProcessUtil.yiqifaBackEndLogin();
			
	  }
	  @AfterTest
	  public void afterTest() {
		 driver.quit();
	  }	 
	  @BeforeMethod
	  public void beforeMethod() {
		  //初始页面
		  driver.get(K.Web_UserManagement_RoleManage);
			
	  }
	  @AfterMethod
	  public void afterMethod() {

		  //回到初始页面
		  driver.get(K.Web_UserManagement_RoleManage);
	  }
	  
	//测试删除按钮-未选择项-预期为：弹出提示	
	@Test
	public void test_delBtn_nullSelect() {
			//点击删除按钮
			minit.delBtn(driver).click();
			
			 //判断alert提示框内容
			alertaction.verifyAlertInfoAndClickOK("请先选择记录");

		}
	  
	//单个删除，预期：成功删除  
	@Test
	public void test_delete_single() {
		//logger.info(table.getCellText(minit.table(driver),"3.3"));
		//Assert.assertEquals(table.getCellText(minit.table(driver),"2.2"), "公司大佬们");
		Integer lt = table.firstRowNumOfContainCellText(minit.table(driver),"亿起发运营部负责人",2,2);	
		minit.checkBox(driver,lt+1).click();
		minit.delBtn(driver).click();
		alertaction.verifyAlertInfoAndClickOK("是否删除？");
		alertaction.verifyAlertInfoAndClickOK("所选角色已分配，无法删除");

	}
	
	//多个删除，预期：成功删除  
	@Test
	public void test_delete_mutli() {
		//logger.info(table.getCellText(minit.table(driver),"3.3"));
		//Assert.assertEquals(table.getCellText(minit.table(driver),"2.2"), "公司大佬们");
		Integer lt = table.firstRowNumOfContainCellText(minit.table(driver),"亿起发运营部负责人",2,2);	
		//选中checkbox
		minit.checkBox(driver,lt+1).click();
		minit.checkBox(driver,lt+2).click();
		minit.checkBox(driver,lt+3).click();


		//点击删除按钮
		minit.delBtn(driver).click();
		alertaction.verifyAlertInfoAndClickOK("是否删除？");
		alertaction.verifyAlertInfoAndClickOK("所选角色已分配，无法删除");

	}


}
