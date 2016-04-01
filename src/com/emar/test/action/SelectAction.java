package com.emar.test.action;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//对下拉列表的操作
public class SelectAction {

	private WebDriver driver;  
	
	public SelectAction(WebDriver driver){  
		this.driver = driver;  
	} 	

	//通过下来列表中选项的索引选中
	public void selectByIndex(WebElement element,int index){
		Select select = new Select(element);
		select.deselectAll();
		select.selectByIndex(index);
	}
	
	//通过下来列表中选项的value属性
	public void selectByValue(WebElement element,String value){
		Select select = new Select(element);
		select.deselectAll();
		select.selectByValue(value);
	}
	
	//通过下来列表中选项的可见文本选中
	public void selectByVisibleText(WebElement element,String text){
		Select select = new Select(element);
		select.deselectAll();
		select.selectByVisibleText(text);
	}
	
	//遍历一下下拉列表所有选项，用click进行选中选项
	public void selectAll(WebElement element){
		Select select = new Select(element);
		for(WebElement e : select.getOptions()){
			e.click();
		}
	}
	
	//得到下拉列表的默认选项
	public void getFirstSelectedOption(WebElement element){
		Select select = new Select(element);
		select.getFirstSelectedOption();
	}
	
	//返回下拉列表选项的的所有值
	public List<String> getAllSelectVaules(WebElement element){
		Select select = new Select(element);
		List<String> list = new ArrayList<String>();
		for(WebElement e : select.getOptions()){
			list.add(e.getText());
			
		}
		return list;
	}
	
	//取消下拉列表的选择
	public void deselectAll(WebElement element){
		Select select = new Select(element);
		select.deselectAll();
	}
	
	//取消下拉列表的选择by index
	public void deselectByIndex(WebElement element,int index){
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	
	//取消下拉列表的选择by VisibleText
	public void deselectByVisibleText(WebElement element,String text){
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
	
	//取消下拉列表的选择By Value
	public void deselectByValue(WebElement element,String text){
		Select select = new Select(element);
		select.deselectByValue(text);
	}
}
