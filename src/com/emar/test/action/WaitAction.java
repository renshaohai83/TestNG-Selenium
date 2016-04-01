package com.emar.test.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//处理等待的类
/* 等待分为 显式等待(Explicit Wait) & 隐式等待(Implicit Wait).
 * 显式等待,就是明确的要等到某个元素的出现或者是某个元素的可点击等条件,
 * 等不到,就一直等,除非在规定的时间之内都没找到,那么就跳出Exception.
 * */
public class WaitAction {

	private WebDriver driver;  
    public WaitAction(WebDriver driver){  
        this.driver = driver;  
    } 	
    
 
    
    //如果需要得到某个WebElement,如果没有满足until()方法中的条件,就会始终在这里wait 10秒,依然找不到,就抛出异常.
    public void waitUnitFindElement( final String webelementXpath){
    	WebElement e = (new WebDriverWait(driver,10)).until(
    			new ExpectedCondition<WebElement>(){
    				@Override
    				public WebElement apply(WebDriver d){
    					return d.findElement(By.xpath(webelementXpath));
    				}
    			}
    			
    			);
    	}
    

}
