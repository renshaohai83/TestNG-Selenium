package com.emar.test.action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

//对alert弹出框的操作类
public class AlertAction {
   
	private  WebDriver driver;  
    public AlertAction(WebDriver driver){  
        this.driver = driver;  
    } 	
    
	/** 
	 * 
	 * @Description: 获取并判断alert提示信息，并点击确定按钮
	 * @param info ：预期的提示信息
	 */ 

	public void verifyAlertInfoAndClickOK(String info){
		//获取alert提示框内容
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains(info));	
		alert.accept();
	}

	//点击alert的确认按钮
	public void pressOK(){
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	//点击alert的取消按钮
	public void pressCancel(){
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	//返回alert上的文本
	public String getText(){
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
	
	//向alert输入值
	public void sendKeys(String key){
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(key);
	}
}
