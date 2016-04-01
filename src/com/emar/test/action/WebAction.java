package com.emar.test.action;

import org.openqa.selenium.WebDriver;

//对浏览器的操作
public class WebAction {

	private WebDriver driver;  
    public WebAction(WebDriver driver){  
        this.driver = driver;  
    } 	

 	//参数都是URL，在窗口中输入URL并打开网页
 	public void get(String url){
 		driver.get(url);
 	}
 	
 	//得到当前句柄的URL，得到其它窗口的URL，必须切换窗口；如果有跳转链接，可以使用sleep或wait方式等待得到最后的URL
 	public void getCurrentUrl(){
 		driver.getCurrentUrl();
 	}
 	
 	//获得页面的源码
 	public void getPageSource(){
 		driver.getPageSource();
 	}
 	
 	//获得页面的title
 	public void getPageTitle(){
 		driver.getTitle();
 	}
    
}
