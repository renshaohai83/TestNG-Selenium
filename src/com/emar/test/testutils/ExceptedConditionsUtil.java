package com.emar.test.testutils;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptedConditionsUtil {

	private WebDriver driver;  
	private static WebDriverWait wait;
    
	public ExceptedConditionsUtil(WebDriver driver){  
        this.driver = driver;  
    	this.wait = new WebDriverWait(driver, 10);

    } 
	
	//判断页面的title，进行精确匹配，匹配成功返回true，否则返回false
	//(一般都是抛出timeoutException)
    public static Boolean titleIs(String title){
    	Boolean bool=wait.until(ExpectedConditions.titleIs(title));
    	return bool;
    }
    
    //用法同上，判断参数title是否是页面title的子集，是子集返回true，否则否则返回false
    //(一般都是抛出timeoutException)
    public static Boolean titleContains(String title){
    	return wait.until(ExpectedConditions.titleContains(title));
    }
    
    /*检查当前页面的DOM中是否有这个元素；即使有这个元素并不代表这个元素是可见的或是可操作的
     */
    public static Boolean presenceOfElementLocated(By locator){
    	WebElement myelement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    	if(myelement == null){
    		return false;
    	}else{
    		return true;
    	}
    		
    }
    
    //至少有一个元素在当前页面的DOM中
    public static Boolean presenceOfAllElementsLocated(By locator){
    	List<WebElement> lt = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    	if(lt.isEmpty()){
    		return false;
    	}else{
    		return true;
    	}

    }
    
    //检查当前页面的DOM中是否有这个元素，并且这个元素是可见的，高度和宽度都大于0
    public static Boolean visibilityOfElementLocated(By locator){
    	WebElement webelement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    	if(webelement == null){
    		return false;
    	}else{
    		return true;
    	}
    }
    
   //检查当前页面的DOM中是否有这个元素，并且这个元素是可见的，高度和宽度都大于0；同上 只是参数不一样
    public static Boolean visibilityOf(WebElement webelement){
    	WebElement myelement =  wait.until(ExpectedConditions.visibilityOf(webelement));
    	if(myelement == null){
    		return false;
    	}else{
    		return true;
    	}
    } 
    
    //判断这个元素的的标签值(也就是value)中是否包含text这个字符串
    public static Boolean textToBePresentInElementValue(By locator,String text){
    	 return wait.until(ExpectedConditions.textToBePresentInElementValue(locator, text));  
    }
    
    //判断这个元素的的标签值(也就是value)中是否包含text这个字符串(同上，参数不一样)
    public static Boolean textToBePresentInElementValue(WebElement element,String text){
    	return wait.until(ExpectedConditions.textToBePresentInElementValue(element, text));  
    }
    
    // 判断Frame是否是有效的，如果有效直接切换到这个frame，switchTo中的frame方法只是跳转，并不判断是否有效
    public static void frameToBeAvailableAndSwitchToIt(String element){
    	 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));  
    }
    
    //如果元素不在当前页面的DOM中或不可见，返回true
    public static Boolean invisibilityOfElementLocated(By locator){
    	return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));  
    }
   
    //如果元素不在当前页面的DOM中或不可见，返回true
    public static Boolean invisibilityOfElementWithText(By locator,String text){
    	return wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, text));  
    }   
    
    //判断元素是否是可见的并且是enable 和可以点击的
    public static Boolean elementToBeClickable(WebElement element){
    	WebElement myelement = wait.until(ExpectedConditions.elementToBeClickable(element));  
    	if(myelement == null){
    		return false;
    	}else{
    		return true;
    	}
    }    
    
    //判断element是否被选中了，选中了返回true，否则返回false
    public static Boolean elementToBeSelected(WebElement element){
    	return wait.until(ExpectedConditions.elementToBeSelected(element));  
    }  
    
    
    //判断element是否被选中了，选中了返回true，否则返回false
    public static Boolean elementSelectionStateToBe(WebElement element,boolean selected){
    	return wait.until(ExpectedConditions.elementSelectionStateToBe(element, selected));  
    }  
    
    //判断当前页面的DOM中没有这个元素
    public static Boolean stalenessOf(WebElement element){
    	return wait.until(ExpectedConditions.stalenessOf(element));  
    }      
    
    //判断当前页面的DOM中有这个元素
    public static Boolean stalenessOf(By locator){
    	WebElement myelement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));  
     	if(myelement == null){
    		return false;
    	}else{
    		return true;
    	}
    }  
   
    
    
    //判断是否有alert提示
    public static Boolean alertIsPresent(){
    	Alert alert = wait.until(ExpectedConditions.alertIsPresent());  
     	if(alert == null){
    		return false;
    	}else{
    		return true;
    	}
    }  
    
    
}
