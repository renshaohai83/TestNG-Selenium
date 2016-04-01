package com.emar.test.initviews.yiqifabackend.menu;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OldBackEndMenu {

	//媒体采购管理系统
	//public static final String Media_purchase_managesystem = "";

	
	public static WebElement Media_purchase_managesystem(WebDriver driver) {  
		//return driver.switchTo().frame(driver.findElement(By.id("leftFrame"))).findElement(By.xpath(".//*[@id='Root1000609']"));
		return driver.switchTo().frame(driver.findElement(By.id("leftFrame"))).findElement(By.linkText("媒体采购管理系统"));
		
	}
	//媒体采购管理系统-财务数据统计
	public static WebElement gonghuoshang_managesystem(WebDriver driver) {  
		//return driver.switchTo().frame(driver.findElement(By.id("leftFrame"))).findElement(By.cssSelector("a[href*='/mediaFinancialStat.do']"));
		//return driver.switchTo().frame(driver.findElement(By.id("leftFrame"))).findElement(By.xpath("//a[@href='/mediaFinancialStat.do']"));
		System.out.printf(driver.switchTo().defaultContent().getClass().getName());
		//return driver.switchTo().frame(driver.findElement(By.id("leftFrame"))).findElement(By.linkText("供货商管理"));
		return driver.switchTo().frame(driver.findElement(By.id("leftFrame"))).findElement(By.linkText("供货商管理"));

		//return driver.switchTo().frame(driver.findElement(By.id("leftFrame"))).findElement(By.xpath(".//*[@id='Child1000614']"));
		//return driver.switchTo().frame(driver.findElement(By.id("leftFrame"))).findElement(By.linkText("媒体采购管理系统"));
		

	

	}
	
	

}
