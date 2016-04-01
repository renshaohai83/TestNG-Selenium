package com.emar.test.initviews.yiqifabackend.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuInitVeiw {
	

	//一级菜单
    public final static String Menu = ".//*[@id='treeview-1015-record-8']/tbody/tr/td/div/span";
    
    //二级菜单_数据统计
    public final static String SecondMenu_shujutongji=".//*[@id='ext-element-6']/div/span";
    		
    public final static String SecondMenu_shujutongji2 =".//*[@id='ext-element-6']";
    //点击数据统计
    public static void doubleclick_xpath(WebDriver driver,String id) {  
        //return driver.findElement(By.cssSelector("span[textContent=" + menuItem + "]"));  
    	//return driver.findElement(By.xpath("//span[text()='" + menuItem + "']"));
    	//return driver.findElement(By.id(id));
    	Actions action = new Actions(driver);
    	//action.doubleClick(driver.findElement(By.xpath(".//*[@id='treepanel-1012-body']").findElement(context)));
    	//action.doubleClick(driver.findElement(By.xpath("//*[normalize-space()='数据统计']")));
    	action.doubleClick(driver.findElement(By.xpath(".//*[@id='ext-element-5']/div/img[3]")));
    	action.release();
    }

    //

}
