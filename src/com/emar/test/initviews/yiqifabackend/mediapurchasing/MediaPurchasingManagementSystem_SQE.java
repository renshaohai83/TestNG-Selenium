package com.emar.test.initviews.yiqifabackend.mediapurchasing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MediaPurchasingManagementSystem_SQE {

	/*供应商管理页面元素定义*/
	
	//供应商输入框
    public static  WebElement SQENameInputText(WebDriver driver) {  
    	return driver.findElement(By.id("supplierId"));
    }
    
	//开始时间
    public static  WebElement beginDateInputText(WebDriver driver) {  
    	return driver.findElement(By.id("beginDate"));
    }
    
	//结束时间
    public static  WebElement endDateInputText(WebDriver driver) {  
    	return driver.findElement(By.id("endDate"));
    }   
    
    //查询按钮
    public static  WebElement searchBtn(WebDriver driver) {  
    	return driver.findElement(By.id("searchBtn"));
    } 
    
    //新建供货商按钮
    public static  WebElement addSQEBtn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='searchForm']/table/tbody/tr/td/table[1]/tbody/tr[2]/td/input[2]"));
    } 
    
    /*新建供应商页面*/
    //供应商名称输入框
    public static  WebElement addPage_SQENameInputText(WebDriver driver) {  
    	return driver.findElement(By.id("supplierName"));
    } 
    
    // 下属网站主账号输入框
    public static WebElement addPage_earnerIdInputText(WebDriver driver) {  
    	return driver.findElement(By.id("earnerId"));
    } 
    //添加按钮
    public static  WebElement addPage_addSQEBtn(WebDriver driver) {  
    	return driver.findElement(By.xpath("html/body/form/center/table/tbody/tr[1]/td/table[1]/tbody/tr[2]/td[2]/input[3]"));
    } 
    
    //提交按钮
    public static  WebElement addPage_submitBtn(WebDriver driver) {  
    	return driver.findElement(By.xpath("html/body/form/center/table/tbody/tr[2]/td[1]/input"));
    } 
    
    //关闭按钮
    public static  WebElement addPage_closeBtn(WebDriver driver) {  
    	return driver.findElement(By.xpath("html/body/form/center/table/tbody/tr[2]/td[2]/input"));
    } 
    
    
    
}
