package com.emar.test.action;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

//键盘操作类
public class KeyboardAction {
	private WebDriver driver;  
    public KeyboardAction(WebDriver driver){  
        this.driver = driver;  
    } 	
    

	//普通键盘模拟
	public void sendKeys(String path,String keysToSend){
		 Actions action = new Actions(driver); 
		 //action.sendKeys(Keys.TAB);// 模拟按下并释放 TAB 键
		 //action.sendKeys(Keys.SPACE);// 模拟按下并释放空格键
		/***
		针对某个元素发出某个键盘的按键操作，或者是输入操作，
		比如在 input 框中输入某个字符也可以使用这个方法。这个方法也可以拆分成:
		action.click(element).sendKeys(keysToSend)。
		*/
		 action.sendKeys(driver.findElement(By.xpath(path)),keysToSend);
		 action.release();
	}
	
	//修饰键方法 KeyDown(theKey)、keyUp(theKey)
	public void sendKeyDown(String path,String keysToSend){
		 Actions action = new Actions(driver); 
		 action.keyDown(Keys.CONTROL);// 按下 Ctrl 键
		 action.keyDown(Keys.SHIFT);// 按下 Shift 键
		 action.keyDown(Keys.ALT);// 按下 Alt 键
		 action.keyUp(Keys.CONTROL);// 释放 Ctrl 键
		 action.keyUp(Keys.SHIFT);// 释放 Shift 键
		 action.keyUp(Keys.ALT);// 释放 Alt 键

	}
	
}
