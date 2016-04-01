package com.emar.test.initviews.yiqifabackend.datamanage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CpaOrginalDataPage {


	//创建时间-开始时间
    public static  WebElement startDate_inputText(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='createTimeStart']"));
    } 
    
	//创建时间-结束时间
    public static  WebElement endDate_inputText(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='createTimeEnd']"));
    } 
    
    //清空时间按钮
    public static  WebElement clearDate_Button(WebDriver driver) {  
    	return driver.findElement(By.xpath("html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[2]/td[4]/input[3]"));
    } 
    
    //
}
