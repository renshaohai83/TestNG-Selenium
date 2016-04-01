package com.emar.test.initviews.yiqifabackend.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OldBackEndLogin {

	
	//用户名：
    public static  WebElement loginUsernameInputText(WebDriver driver) {  
        //return driver.findElement(By.cssSelector("span[textContent=" + menuItem + "]"));  
    	//return driver.findElement(By.xpath("//span[text()='" + menuItem + "']"));
    	return driver.findElement(By.id("userName"));
    }
    
    	//密码
    public static WebElement loginPassowordInputText(WebDriver driver) {  
        //return driver.findElement(By.cssSelector("span[textContent=" + menuItem + "]"));  
    	//return driver.findElement(By.xpath("//span[text()='" + menuItem + "']"));
    	return driver.findElement(By.id("password"));
    }
    
    //登陆按钮
    public static WebElement loginButton(WebDriver driver) {  
       // return driver.findElement(By.cssSelector("#loginbtn"));  
    	//return driver.findElement(By.xpath(".//*[@id='loginbtn']"));
    	return driver.findElement(By.id("loginbtn"));
    }
    
    //注册按钮
    public static WebElement registerButton(WebDriver driver) {  
        //return driver.findElement(By.cssSelector("span[textContent=" + menuItem + "]"));  
    	return driver.findElement(By.xpath(".//*[@id='regbtn']"));
    	//return driver.findElement(By.id("regbtn"));
    }
    
    
}
