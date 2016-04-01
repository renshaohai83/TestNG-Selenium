package com.emar.test.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//按钮操作类
public class ButtonAction {

    
    //单击按钮
    public void click(WebElement element){
    	element.click();
    }
    
    //双击按钮
    public void doubleClick(WebElement element){
    	element.click();
    	element.click();

    }
    
    //获得按钮的文字
    public String getText(WebElement element){
    	return element.getText();
    }
    
    

}
