package com.emar.test.action;

import org.openqa.selenium.WebElement;


//输入框的操作类
public class InputTextAction {
	
	   
	public InputTextAction(){  
		
	} 	    

	//输入输入框
    public void sendKeys(WebElement element, String text){
    	element.clear();
    	element.sendKeys(text);
    }
    
    //获得输入框的值
    public String getInputTextValue(WebElement element){
    	return element.getText();
    }
    
    //点击数据框
    public void click(WebElement element){
    	element.click();
    }
}
