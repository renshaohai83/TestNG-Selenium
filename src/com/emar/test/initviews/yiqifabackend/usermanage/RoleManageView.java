package com.emar.test.initviews.yiqifabackend.usermanage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RoleManageView {
	
    //删除选中——按钮
    public static  WebElement delBtn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='searchForm']/table/tbody/tr/td/table[1]/tbody/tr/td/input[1]"));
    } 
        
    //新增角色——按钮
    public static  WebElement addBtn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='searchForm']/table/tbody/tr/td/table[1]/tbody/tr/td/input[2]"));
    } 
    
    //选择checkbox: int i 从2开始  
    public static  WebElement checkBox(WebDriver driver,Integer i) {  
    	return driver.findElement(By.xpath(".//*[@id='searchForm']/table/tbody/tr/td/table[2]/tbody/tr["+i+"]/td[1]/input"));
    } 
   
    //编辑按钮: int i 从2开始    
    public static  WebElement editLink(WebDriver driver,Integer i) {  
    	return driver.findElement(By.xpath(".//*[@id='searchForm']/table/tbody/tr/td/table[2]/tbody/tr["+i+"]/td[4]/a"));
    } 
    
    //查看&修改按钮: int i 从2开始    
    public static  WebElement checkLink(WebDriver driver,Integer i) {  
    	return driver.findElement(By.xpath(".//*[@id='searchForm']/table/tbody/tr/td/table[2]/tbody/tr["+i+"]/td[5]/a"));
    } 
    
    //角色名称text区域： int i 从2开始
    public static  WebElement rolenameText(WebDriver driver,Integer i) {  
    	return driver.findElement(By.xpath(".//*[@id='searchForm']/table/tbody/tr/td/table[2]/tbody/tr["+i+"]/td[2]"));
    } 
    
    //角色名称text区域： int i 从2开始
    public static  WebElement roleDescriptText(WebDriver driver,int i) {  
    	return driver.findElement(By.xpath(".//*[@id='searchForm']/table/tbody/tr/td/table[2]/tbody/tr["+i+"]/td[3]"));
    }     
    
    //table
    public static  WebElement table(WebDriver driver) {  
    	return driver.findElement(By.className("table_list"));
    }        
}


