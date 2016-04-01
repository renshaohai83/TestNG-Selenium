package com.emar.test.action;

import org.openqa.selenium.WebElement;

//对checkbox的操作类
public class CheckBoxAction {
	
	//选中checkbox
	public void selected(WebElement element){
		if(!element.isSelected()){
			element.click();
		}
	}

	//取消选中chechbox
	public void cancelSeleted(WebElement element){
		if(element.isSelected()){
			element.click();
		}
	}
	
	//选中，返回true
	public Boolean isSelect(WebElement element){
		return element.isSelected();
	}
}
