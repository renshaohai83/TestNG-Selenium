package com.emar.test.action;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * 模拟浏览器的操作
 * */
public class WebNavigationAction {
	   
	private WebDriver driver; 
	WebDriverWait wait = new WebDriverWait(driver,15);

	public WebNavigationAction(WebDriver driver){ 
		this.driver = driver;  
	    } 
	/*
	 * 回到当前窗口的前一个页面(向后 <-)
	 */
	public void back() throws InterruptedException{
		driver.navigate().back();
		wait.wait(5);
	}
	
	/*
	 *向前 ->；注意在使用back方法后，需要留足够的等待时间再执行forward，否则forward执行不成功(back后停留1s)
	 */
	public void forward(){
		driver.navigate().forward();
	}
	
	/*
	 * 刷新当前页面
	 */	
	public void refresh(){
		driver.navigate().refresh();
	}
	
	/*
	 * 类似于driver.get()方法，打开链接
	 */	
	public void to(String url){
		driver.navigate().to(url);
	}
	
	/*
	 *同上，参数是URL对象
	 */			
	public void to(URL url){
		driver.navigate().to(url);
	}
}
