package com.emar.test.action;

import org.openqa.selenium.WebElement;

//文本框操作类
public class TextAction {
 	
   
    //获得文本的字符
    public String getText(WebElement element){
    	return element.getText();
    }
    
    //获得文本的大小,返回int类型的长度
    public Integer getSize(WebElement element){
    	return element.getText().length();
    }

}
