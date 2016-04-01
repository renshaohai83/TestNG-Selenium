package com.emar.test.initviews.yiqifabackend.usermanage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RoleManageEditView {

	//角色名称-输入框
    public static  WebElement roleName_inputText(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
      
	//角色描述-输入框
    public static  WebElement roleDescription_inputText(WebDriver driver) {  
    	return driver.findElement(By.xpath("html/body/form/center/table/tbody/tr/td/table[3]/tbody/tr[2]/td[2]/textarea"));
    } 
          
	//数据权限-是-radiobutton
    public static  WebElement dataAuthority_yes_radioButton(WebDriver driver) {  
  		return driver.findElement(By.xpath("html/body/form/center/table/tbody/tr/td/table[3]/tbody/tr[3]/td[2]/input[1]"));
    }  
  
	//数据权限-否-radiobutton
    public static  WebElement dataAuthority_no_radioButton(WebDriver driver) {  
  		return driver.findElement(By.xpath("html/body/form/center/table/tbody/tr/td/table[3]/tbody/tr[3]/td[2]/input[2]"));
    }  
  
	//保存按钮
    public static  WebElement save_Button(WebDriver driver) {  
	  return driver.findElement(By.xpath("html/body/form/center/table/tbody/tr/td/table[3]/tbody/tr[4]/td/input[1]"));
    } 
  
	//返回按钮
    public static  WebElement back_Button(WebDriver driver) {  
	  return driver.findElement(By.xpath("html/body/form/center/table/tbody/tr/td/table[3]/tbody/tr[4]/td/input[2]"));
    } 
  
	//错误显示
    public static  WebElement roleNameError_Text(WebDriver driver) {  
	  return driver.findElement(By.xpath(".//*[@id='roleNameError']/font"));
    } 
}
