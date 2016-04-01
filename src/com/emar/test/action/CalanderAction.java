package com.emar.test.action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//日历控件的操作
public class CalanderAction {
	
	private WebDriver driver;  
    public CalanderAction(WebDriver driver){  
        this.driver = driver;  
    } 	
	//去掉readonly的属性,参数为element id
	public void removeReadOnly(String id){
		  JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
		  removeAttribute.executeScript("var setDate=document.getElementById(\"" +id+ "\"); setDate.removeAttribute('readonly');") ;

	}
	
	//去掉readonly的属性,参数为element
	public void removeReadOnly(WebElement element){
		  JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
		  removeAttribute.executeScript("element.removeAttribute('readonly');") ;

	}

}
