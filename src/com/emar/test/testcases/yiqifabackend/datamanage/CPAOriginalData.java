package com.emar.test.testcases.yiqifabackend.datamanage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.emar.test.action.AlertAction;
import com.emar.test.action.CalanderAction;
import com.emar.test.action.InputTextAction;
import com.emar.test.action.TableAction;
import com.emar.test.data.K;
import com.emar.test.initviews.yiqifabackend.datamanage.CpaOrginalDataPage;
import com.emar.test.process.yiqifabackend.ProcessUtil;
import com.emar.test.testutils.WebUtil;

public class CPAOriginalData {
	private static final Logger logger = LoggerFactory.getLogger(CPAOriginalData.class);
	
	private ProcessUtil mProcessUtil;
	
	WebDriver driver = mProcessUtil.driver;
	WebDriverWait wait = new WebDriverWait(driver,15);
	WebUtil  mWebUtil = new WebUtil();
	TableAction table = new TableAction();
	AlertAction alertaction = new AlertAction(driver);
	InputTextAction InputTextAction = new InputTextAction();
	CalanderAction CalanderAction = new CalanderAction(driver);
	
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
		  driver.get(K.DataManagement_CPAOriginalData);
			
	  }
	  @AfterMethod
	public void afterMethod() {

		  //回到初始页面
		  driver.get(K.DataManagement_CPAOriginalData);
	  }

	  @Test
	  public void test_Calander() throws InterruptedException{
		  //输入开始时间
		  CalanderAction.removeReadOnly("createTimeStart");
		  InputTextAction.sendKeys(CpaOrginalDataPage.startDate_inputText(driver), "2013-04-09");
		  Thread.sleep(10000);
	  }


}
