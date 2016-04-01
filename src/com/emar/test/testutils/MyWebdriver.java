package com.emar.test.testutils;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
/**
 * 实例化各种浏览器的综合方法，火狐、IE、chrome
 * @author Administrator
 *
 */
public class MyWebdriver
{
	private static WebDriver driver;
	
	//启动火狐实例
	public static WebDriver getFirefoxDriver(String path)
	{
		//设置火狐路径为自定义路径
		//System.setProperty("webdriver.firefox.bin", "D:\\firefox\\firefox.exe");
		System.setProperty("webdriver.firefox.bin", path);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return driver;
	}
	//启动IE实例
	public static WebDriver getInternetExplorerDriver(String path)
	{
		//System.setProperty("webdriver.ie.driver", path);
		System.setProperty("webdriver.ie.driver", "driver\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.bin",path);
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return driver;
	}
	//启动谷歌浏览器实例
	public static WebDriver getChromeDriver(String path)
	{
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		//设置谷歌浏览器路径
		//System.setProperty("webdriver.chrome.bin","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.bin",path);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 6.1; WOW64; rv:32.0) Gecko/20100101 Firefox/32.0");
		driver = new ChromeDriver(options);
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return driver;
	}
	//获取htmlunitdriver
	public static WebDriver getHtmlunit()
	{
		driver = new HtmlUnitDriver();
		return driver;
	}
	//退出浏览器实例
	public static void stopDrivers(){
		driver.quit();
	}
	
	//得到当前的浏览器标签(浏览器句柄)，如果不切换新窗口，句柄不会发生改变；因此每次切换新窗口，有必要记录当前浏览器句柄

	
	
	
//测试类，无用
	public static void main(String[] args)
	{
		
		
		//MyWebdriver.getInternetExplorerDriver("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
		//MyWebdriver.getChromeDriver("C:\\Users\\renshaohai\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		MyWebdriver.getFirefoxDriver("E:\\Program Files\\Mozilla Firefox\\firefox.exe");
		try
		{
			Thread.sleep(4000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyWebdriver.stopDrivers();
	}
}
