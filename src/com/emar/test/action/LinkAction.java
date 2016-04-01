package com.emar.test.action;

import org.openqa.selenium.WebElement;

//Link操作类
public class LinkAction {

	//link点击操作
	public void click(WebElement element){
		element.click();
	}
	
	public String getLinkText(WebElement element){
		return element.getText();
	}

}
