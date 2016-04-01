package com.emar.test.process.yiqifabackend;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.emar.test.data.K;
import com.emar.test.data.yiqifabackend.login.LoginData;
import com.emar.test.initviews.yiqifabackend.login.OldBackEndLogin;
import com.emar.test.initviews.yiqifabackend.menu.OldBackEndMenu;
import com.emar.test.testutils.MyWebdriver;
import com.thoughtworks.selenium.Wait;

public class ProcessUtil {
	
	//IE浏览器
	//static WebDriver driver = MyWebdriver.getInternetExplorerDriver(K.InternetExplorerDriverPath);
	//火狐浏览器
	//static WebDriver driver =MyWebdriver.getFirefoxDriver(K.FireFoxDriverPath);	
	//chrome浏览器
	public static WebDriver driver =MyWebdriver.getChromeDriver(K.ChromeDriverPath);
	
	
	//打开网址站
	public static void openWebsite(WebDriver driver,String address){		
		driver.get(address);		 
	}
	
	//亿起发后台老系统登陆
	public static void yiqifaBackEndLogin(){
		openWebsite(driver,K.Website);
		//输入登陆用户名
		OldBackEndLogin.loginUsernameInputText(driver).clear();
		OldBackEndLogin.loginUsernameInputText(driver).sendKeys(LoginData.backEndLoginUsername);
		
		//输入密码
		OldBackEndLogin.loginPassowordInputText(driver).clear();
		OldBackEndLogin.loginPassowordInputText(driver).sendKeys(LoginData.backEndLoginPassword);
		
		//点击登陆按钮
		//OldBackEndLogin.registerButton(driver).click();
		OldBackEndLogin.loginButton(driver).click();
	}
	
	//亿起发前台网站主登陆
	public static void yiqifaFrontend_earner_login(){
		
	}
	
  
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//openWebsite(driver,K.Website);
		yiqifaBackEndLogin();

	}

}
