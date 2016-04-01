package com.emar.test.action;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

//对cookie的各种操作
public class WebCookieOptionsAction {
	
    private WebDriver driver;  
    public WebCookieOptionsAction(WebDriver driver){  
        this.driver = driver;  
    } 
	
    
    public void deleteCookieNamed(String name){
    	driver.manage().deleteCookieNamed(name);
    }

    public void deleteCookie(Cookie cookie){
    	driver.manage().deleteCookie(cookie);
    }
    
    public void deleteAllCookies(){
    	driver.manage().deleteAllCookies();
    }
    
    public Cookie getCookieName(String name){
    	return driver.manage().getCookieNamed(name);
    }
    
    public Set getCookiesAsSet(){
    	Set<Cookie> cookies = driver.manage().getCookies();
    	for(Cookie cookie:cookies){
    		System.out.println("作用域："+cookie.getDomain()+", 名称："+cookie.getName()+
                    ", 值："+cookie.getValue()+", 范围："+cookie.getPath()+
                    ", 过期时间"+cookie.getExpiry());
    	}
    	return cookies;
    }
    
    public void addCookie(Cookie cooike){
    	driver.manage().addCookie(cooike);
    }
    
     
}
