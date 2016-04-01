package com.emar.test.testcases.yiqifabackend.usermanager;

import junit.framework.Assert;

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
import com.emar.test.action.ButtonAction;
import com.emar.test.action.InputTextAction;
import com.emar.test.action.RadioButtonAction;
import com.emar.test.action.TableAction;
import com.emar.test.action.TextAction;
import com.emar.test.action.WebAction;
import com.emar.test.data.K;
import com.emar.test.data.StringTestModel;
import com.emar.test.initviews.yiqifabackend.usermanage.RoleManageEditView;
import com.emar.test.initviews.yiqifabackend.usermanage.RoleManageView;
import com.emar.test.process.yiqifabackend.ProcessUtil;
import com.emar.test.testutils.WebUtil;

public class RoleAdd {

	private static final Logger logger = LoggerFactory.getLogger(RoleAdd.class);
	
	private ProcessUtil mProcessUtil;
	private RoleManageEditView minit;
	private RoleManageView mRoleManageView;

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
		  driver.get(K.Web_UserManagement_RoleManageEdit);
			
	  }
	@AfterMethod
	public void afterMethod() {
		  //回到初始页面
		  driver.get(K.Web_UserManagement_RoleManageEdit);
	  }
	  

	//测试输入正常值，预期：正常加入角色
	@Test
	public void test_input_normal() throws InterruptedException{
		
		InputTextAction.sendKeys(minit.roleName_inputText(driver), "测试角色");
		InputTextAction.sendKeys(minit.roleDescription_inputText(driver), "测试角色的描述");
		RadioButtonAction.selected(minit.dataAuthority_yes_radioButton(driver));
		ButtonAction.click(RoleManageEditView.save_Button(driver));
		
		alertaction.verifyAlertInfoAndClickOK("用户角色创建成功");
		//回到管理页,查看是否添加成功
		
		WebAction.get(K.Web_UserManagement_RoleManage);
		
		Integer lt = table.firstRowNumOfContainCellText(mRoleManageView.table(driver),"测试角色",2,2);
		Assert.assertTrue(lt!=0);
	}
	
	//角色名称输入重复值：预期：不会增加同样的角色
	@Test(dependsOnMethods = {"test_input_normal"})
	public void test_input_repeatValue(){
		
		InputTextAction.sendKeys(minit.roleName_inputText(driver), "测试角色");
		InputTextAction.sendKeys(minit.roleDescription_inputText(driver), "测试角色的描述");
		RadioButtonAction.selected(minit.dataAuthority_yes_radioButton(driver));
		ButtonAction.click(RoleManageEditView.save_Button(driver));
		alertaction.verifyAlertInfoAndClickOK("不能重复创建");
	}
	
	//角色名称：常规测试，预期：弹出预期提示框
	@Test
	public void test_input_routine(){
		
		for(int i=0;i<StringTestModel.stringTestList_normal().size();i++){
			InputTextAction.sendKeys(minit.roleName_inputText(driver),StringTestModel.stringTestList_normal().get(i));
			ButtonAction.click(RoleManageEditView.save_Button(driver));
			String errorInfo = TextAction.getText(minit.roleNameError_Text(driver));
			//Assert.assertTrue(errorInfo.contains(""));
			alertaction.verifyAlertInfoAndClickOK("用户角色创建成功");
		}
		
		for(int m=0;m<StringTestModel.stringTestList_error().size();m++){
			InputTextAction.sendKeys(minit.roleName_inputText(driver),StringTestModel.stringTestList_normal().get(m));
			ButtonAction.click(RoleManageEditView.save_Button(driver));
			String errorInfo = TextAction.getText(minit.roleNameError_Text(driver));
			Assert.assertTrue(errorInfo.contains("请输入“角色名称” !×"));
		}

	}
	
	//角色描述：常规测试，预期：弹出提示框
	@Test
	public void test_input_roleDescription_routine(){
		for(int i=1;i<StringTestModel.stringTestList().size();i++){
			InputTextAction.sendKeys(minit.roleName_inputText(driver),"roleDescription" + i);
			InputTextAction.sendKeys(minit.roleDescription_inputText(driver),StringTestModel.stringTestList().get(i));
			ButtonAction.click(RoleManageEditView.save_Button(driver));
		}
	}
	
	//点击返回按钮：预期跳转页面
	@Test
	public void test_clickBackBtn(){
		ButtonAction.click(minit.back_Button(driver));
		Assert.assertTrue(driver.getCurrentUrl().contains(K.Web_UserManagement_RoleManage));
	}
}
