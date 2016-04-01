package com.emar.test.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

//鼠标动作模拟
public class MouseAction {
	
	private WebDriver driver;  
    public MouseAction(WebDriver driver){  
        this.driver = driver;  
    } 	
	// 鼠标左键点击
	public void leftClick(String path){
		 Actions action = new Actions(driver);
		// action.click();// 鼠标左键在当前停留的位置做单击操作 
		 action.click(driver.findElement(By.xpath(path)));// 鼠标左键点击指定的元素
		 action.release();
	}
	//. 鼠标右键点击
	public void rightClick(String path){
		 Actions action = new Actions(driver);
		 action.contextClick(driver.findElement(By.xpath(path)));
		 action.release();

	}
	
	//鼠标双击操作
	public void doubleClick(String path){
		 Actions action = new Actions(driver);
		 action.doubleClick(driver.findElement(By.xpath(path)));
		 action.release();

	}
	
	//鼠标拖拽动作
	public void dragAndDrop(String source,String target){
		 Actions action = new Actions(driver); 
		 // 鼠标拖拽动作，将 source 元素拖放到 target 元素的位置。
		 action.dragAndDrop(driver.findElement(By.xpath(source)),driver.findElement(By.xpath(target)));
		// 鼠标拖拽动作，将 source 元素拖放到 (xOffset, yOffset) 位置，其中 xOffset 为横坐标，yOffset 为纵坐标。
		//action.dragAndDrop(source,xOffset,yOffset);
		 action.release();

	}
	
	// 鼠标悬停操作
	public void clickAndHold(String path){
		 Actions action = new Actions(driver); 
		 action.clickAndHold(driver.findElement(By.xpath(path)));
		 action.release();
		
	}
	
	//鼠标移动操作
	public void moveToElement(String path){
		 Actions action = new Actions(driver); 
		 action.moveToElement(driver.findElement(By.xpath(path)));// 将鼠标移到 toElement 元素中点
		// 将鼠标移到元素 toElement 的 (xOffset, yOffset) 位置，
		//这里的 (xOffset, yOffset) 是以元素 toElement 的左上角为 (0,0) 开始的 (x, y) 坐标轴。
		// action.moveToElement(toElement,xOffset,yOffset)
		// 以鼠标当前位置或者 (0,0) 为中心开始移动到 (xOffset, yOffset) 坐标轴
		// action.moveByOffset(xOffset,yOffset);
		 action.release();
	}
}
