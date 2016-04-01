package com.emar.test.testutils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.emar.test.data.K;
import com.emar.test.process.yiqifabackend.ProcessUtil;

public class WebUtil {
	private ProcessUtil mProcessUtil;

	WebDriver driver = mProcessUtil.driver;
	WebDriverWait wait = new WebDriverWait(driver,15);
	
	
	// 得到最上层的窗口
 	public void getPopupWindows(String MainWindows){
	//得到所有窗口的句柄     
		  Set<String> handles = driver.getWindowHandles();       
		  Iterator<String> it = handles.iterator();     
		  while(it.hasNext()){       
			  String popupHandle = it.next().toString();
			  if (!popupHandle.contains(MainWindows)){
				  driver.switchTo().window(popupHandle);
			  }
		  }
	  }
 	
	/** 
	 * 
	 * @Description: 判断是否跳转到指定的链接
	 * @param previousURL ： 当前的url地址
	 * @param redirectUrl ： 跳转的url地址
	 */ 

 	public boolean isRedirectToUrl(final String previousURL,String redirectUrl){
 		String currentURL = null;
		//判断是否跳转到指定链接
		ExpectedCondition e = new ExpectedCondition<Boolean>() {
	          public Boolean apply(WebDriver d) {
	            return (d.getCurrentUrl() != previousURL);
	          }
	        };
	        
	    wait.until(e);
	    currentURL= driver.getCurrentUrl();
	    return currentURL.contains(redirectUrl);	    
 	}
 	
 
 	
 	
}
