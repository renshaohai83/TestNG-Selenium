package com.emar.test.initviews.yiqifafront.earnerfront.datastatistics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PerformanceStatisticsInitview {


	//下单开始时间
    public  WebElement startTime_inputText(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //下单结束时间
    public  WebElement endTime_inputText(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //显示方式 -按日
    public   WebElement byDay_btn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //显示方式 -按月
    public   WebElement byMonth_btn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    //显示方式 -按活动
    public   WebElement byCampaign_btn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //显示方式 -按网站
    public   WebElement byWebsite_btn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //显示方式 -按推广产品
    public   WebElement byProduct_btn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //显示方式 -查询按钮
    public   WebElement query_btn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //显示方式 -导出按钮
    public  WebElement export_btn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    
    //自定义指标按钮
    public  WebElement userDefined_btn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //自定义指标-系统默认指标
    public   WebElement userDefined_systemDefined_link(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    }   
    
    //自定义指标-流量指标-点击
    public   WebElement userDefined_click_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    }  
    
    //自定义指标-订单指标-收订订单数
    public   WebElement userDefined_subscribingOrdersNum_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //自定义指标-订单指标-有效订单数
    public   WebElement userDefined_effectiveOrdersNum_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //自定义指标-订单指标-收订订单额
    public   WebElement userDefined_subscribingOrdersMoney_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    }   
    
    //自定义指标-订单指标-有效订单数
    public   WebElement userDefined_effectiveOrdersMoney_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    
    //自定义指标-行为指标-发生行为
    public   WebElement userDefined_allActive_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //自定义指标-行为指标-有效行为
    public   WebElement userDefined_effectiveActive_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
     
    //佣金指标-订单预计佣金
    public   WebElement userDefined_orderExpectedCommission_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    }    

    //佣金指标-订单确认佣金
    public   WebElement userDefined_orderConfirmedCommission_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    }     
    
    //佣金指标-行为预计佣金
    public   WebElement userDefined_activeExpectedCommission_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //佣金指标-行为确认佣金
    public   WebElement userDefined_activeConfirmedCommission_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //佣金指标-总预计佣金
    public   WebElement userDefined_allExpectedCommission_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //佣金指标-总确认佣金
    public   WebElement userDefined_allConfirmedCommission_checkbox(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //自定义指标-确认按钮
    public   WebElement userDefined_ok_btn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //自定义指标-取消按钮
    public   WebElement userDefined_cancel_link(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //高级筛选-活动信息输入框
    public   WebElement advancedFilter_campaign_inputText(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    }     
    
    //高级筛选-网站信息
    public   WebElement advancedFilter_applicationType_select(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    }   
  
    //高级筛选-网站id
    public   WebElement advancedFilter_websiteId_select(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //高级筛选-确定按钮
    public  WebElement advancedFilter_ok_btn(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
   
    //高级筛选-取消按钮
    public   WebElement advancedFilter_cancel_link(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    } 
    
    //table
    public   WebElement table(WebDriver driver) {  
    	return driver.findElement(By.className("table_list"));
    }  
    
    //CPS 查看明细
    public   WebElement cps_detail_link(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    }  
    
    //CPA 查看明细
    public   WebElement cpa_detail_link(WebDriver driver) {  
    	return driver.findElement(By.xpath(".//*[@id='roleName']"));
    }  
}
