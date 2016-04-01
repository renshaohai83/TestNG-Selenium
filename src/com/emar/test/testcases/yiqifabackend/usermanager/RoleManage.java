package com.emar.test.testcases.yiqifabackend.usermanager;

import java.util.Calendar;

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
import com.emar.test.data.K;
import com.emar.test.initviews.yiqifabackend.usermanage.RoleManageView;
import com.emar.test.process.yiqifabackend.ProcessUtil;
import com.emar.test.testutils.WebUtil;

public class RoleManage {
	private static final Logger logger = LoggerFactory.getLogger(RoleManage.class);
	
	private ProcessUtil mProcessUtil;
	private RoleManageView minit;
	
	WebDriver driver = mProcessUtil.driver;
	//Calendar currentTime = Calendar.getInstance();
	WebDriverWait wait = new WebDriverWait(driver,15);
	WebUtil  mWebUtil = new WebUtil();
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
	public void test_delBtn_1() {
		//点击删除按钮
		minit.delBtn(driver).click();
		
		 //获取alert提示框内容
		alertaction.verifyAlertInfoAndClickOK("请先选择记录");

	}
	
	//新增角色按钮-点击，预期为：跳转到角色编辑页面
	@Test
	public void test_addBtn_1() {
		final String previousURL = driver.getCurrentUrl();
		String currentURL = null;
		
		//点击删除按钮
		minit.addBtn(driver).click();
		
		//判断是否跳转到指定链接
		Boolean result = mWebUtil.isRedirectToUrl(previousURL,K.Web_UserManagement_RoleManageEdit);
		Assert.assertTrue(result);
	}
	

	//编辑按钮-点击，预期为：跳转到角色编辑页面
	@Test
	public void test_editBtn_1() {
		final String previousURL = driver.getCurrentUrl();
		String currentURL = null;
		//抓取和点击第1行的数据
		int i = 2;
		String roleName = minit.rolenameText(driver, i).getText();
		String roleDescript = minit.roleDescriptText(driver, i).getText();
		
		//点击编辑按钮
		minit.editLink(driver, i).click();

		//判断是否跳转到指定链接
		Boolean result = mWebUtil.isRedirectToUrl(previousURL,K.Web_UserManagement_RoleManageEdit);
		Assert.assertTrue(result);

	}
	
	//查看&修改按钮-点击，预期为：跳转到角色编辑页面
	@Test
	public void test_checkBtn_1() {
		final String previousURL = driver.getCurrentUrl();
		String currentURL = null;
		//抓取和点击第1行的数据
		int i = 2;
		String roleName = minit.rolenameText(driver, i).getText();
		String roleDescript = minit.roleDescriptText(driver, i).getText();
		
		//点击编辑按钮
		minit.checkLink(driver, i).click();
		
		//判断是否跳转到指定链接
		Boolean result = mWebUtil.isRedirectToUrl(previousURL,K.Web_UserManagement_RoleAuthorityEdit);
		Assert.assertTrue(result);

	}

}
