package com.emar.test.testcases.yiqifabackend.mediapurchasingmanagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.databene.benerator.anno.Database;
import org.databene.benerator.anno.Source;
import org.databene.feed4testng.FeedTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.emar.test.data.K;
import com.emar.test.initviews.yiqifabackend.mediapurchasing.MediaPurchasingManagementSystem_SQE;
import com.emar.test.process.yiqifabackend.ProcessUtil;
import com.emar.test.testutils.WebUtil;

//@DataProvider(name = "feeder")
//@Database(id = "db",environment="yiqifa_bs_88")

@Database(id = "db", url = "jdbc:mysql://172.16.17.182:3306/yiqifa_bs_88", 
		driver = "com.mysql.jdbc.Driver", user = "yiqifa_bs_88", password = "yiqifa_bs_88")

public class SQE  extends FeedTest{
	
	private static final Logger logger = LoggerFactory.getLogger(SQE.class);
	
	private ProcessUtil mProcessUtil;
	private MediaPurchasingManagementSystem_SQE minit;
	
	WebDriver driver = mProcessUtil.driver;
	Calendar currentTime = Calendar.getInstance();
	WebDriverWait wait = new WebDriverWait(driver,15);
	WebUtil  mWebUtil = new WebUtil();

	
	  @BeforeTest
	  public void beforeTest() {
	  }

	  @AfterTest
	  public void afterTest() {
		  //ProcessUtil.driver.close();
		  ProcessUtil.driver.quit();
	  }
	  
	  
	  @Test(dataProvider = "feeder")
	  @Source(id="db", selector = "SELECT supplier_name FROM media_supplier WHERE id =6;")
	  public void test(String  supplier_name) throws IOException{
		  //environmentFileName("yiqifa_bs_88");
		  logger.info("supplier_name=" + supplier_name);
	  }
	
	 @DataProvider(name = "addSQE_success")
     public Object[][] addSQE_success_data() {
               return new Object[][] { { "SeleniumTest", "2060" }};
      }
	
/*	 @DataProvider(name = "addSQE_fail")
     public Object[][] addSQE_fail_data() {
         return new list { 
        		 new Object[]{"SeleniumTest", "000" ,"该供货商名称已存在"},
        		 new Object[]{"SeleniumTest","204","改网站主已经绑定"},
        		 new Object[]{"","204","请输入供货商名称"},
        		 new Object[]{"SeleniumTest","",""}
        		 				};
}*/
	 
	 @DataProvider(name = "addSQE_fail")
     public static Object[][] addSQE_fail_data() {  
         List<String> list = new ArrayList<String>();  
        for (int i=1; i<=5; i++) {  
             list.add("data" + i);  
        }  
        String[][] ret = new String[list.size()][];  
        for (int i=0; i<list.size(); i++) {  
             ret[i] = new String[]{list.get(i)};  
        }  
        return ret;  
   }
	 
 
	 //新增供应商
	 @Test(dataProvider="addSQE_success")
	 public void test_1_addSQE_success(String SQENameInputText, String earnerId) throws InterruptedException{
		 //gotoCurrentPage();
		  // logger.info("supplier_name=" + supplier_name);
		 //登录
		 ProcessUtil.yiqifaBackEndLogin();
		  driver.get(K.Web_MediaPurchasingManagementSystem_SQE);
		 //得到主页窗口的句柄     
		  String MainWindow = driver.getWindowHandle();
		 
		 //点击增加供货商按钮
		 MediaPurchasingManagementSystem_SQE.addSQEBtn(driver).click();
		 //wait.until(ExpectedConditions.elementToBeClickable(MediaPurchasingManagementSystem_SQE.addPage_SQENameInputText(driver)));
		 //判断是否弹出新增页面
		 mWebUtil.getPopupWindows(K.Web_MediaPurchasingManagementSystem_SQE);
		 logger.info(driver.getCurrentUrl());
		 
		 Assert.assertTrue(driver.getCurrentUrl().equals(K.Web_MediaPurchasingManagementSystem_SQE_AddPage));
		 wait.until(ExpectedConditions.elementToBeClickable(MediaPurchasingManagementSystem_SQE.addPage_addSQEBtn(driver)));

		 //输入供货商名称
		 MediaPurchasingManagementSystem_SQE.addPage_SQENameInputText(driver).sendKeys(SQENameInputText);
		 
		 //输入网站主账号
		 MediaPurchasingManagementSystem_SQE.addPage_earnerIdInputText(driver).sendKeys(earnerId);
		 MediaPurchasingManagementSystem_SQE.addPage_addSQEBtn(driver).click();

		 Thread.sleep(1000);
		 //点击提交
		 MediaPurchasingManagementSystem_SQE.addPage_submitBtn(driver).click();
		 		 
	 }
	 
	 //新增成功数据库字段正确
	 @Test(dataProvider = "feeder")
	 @Source(id="db", selector = "SELECT supplier_name FROM media_supplier ORDER BY id DESC LIMIT 1;")
	 public void test_2_addSQE_SQL(String supplier_name) throws InterruptedException{
		 logger.info("supplier_name" + supplier_name);
		 Assert.assertTrue(supplier_name.equals("SeleniumTest"));
	 }
	  
	 @Test(dataProvider="addSQE_fail")
	 //新增运营商的错误提示测试
	 public void test_3_addSQE_errorInfo(String SQENameInputText, String earnerId,String errorInfo) throws InterruptedException{
		  
		 logger.info("SQENameInputText" + SQENameInputText);
		 logger.info("earnerId" + earnerId);
		 logger.info("#############");
		 //登录
		 ProcessUtil.yiqifaBackEndLogin();
		 driver.get(K.Web_MediaPurchasingManagementSystem_SQE);
		 //得到主页窗口的句柄     
		 String MainWindow = driver.getWindowHandle();
		 
		 //点击增加供货商按钮
		 MediaPurchasingManagementSystem_SQE.addSQEBtn(driver).click();
		 //wait.until(ExpectedConditions.elementToBeClickable(MediaPurchasingManagementSystem_SQE.addPage_SQENameInputText(driver)));
		 //判断是否弹出新增页面
		 mWebUtil.getPopupWindows(K.Web_MediaPurchasingManagementSystem_SQE);
		 logger.info(driver.getCurrentUrl());
		 
		 Assert.assertTrue(driver.getCurrentUrl().equals(K.Web_MediaPurchasingManagementSystem_SQE_AddPage));
		 wait.until(ExpectedConditions.elementToBeClickable(MediaPurchasingManagementSystem_SQE.addPage_addSQEBtn(driver)));

		 //输入供货商名称
		 MediaPurchasingManagementSystem_SQE.addPage_SQENameInputText(driver).sendKeys(SQENameInputText);
		 
		 //输入网站主账号
		 MediaPurchasingManagementSystem_SQE.addPage_earnerIdInputText(driver).sendKeys(earnerId);
		 MediaPurchasingManagementSystem_SQE.addPage_addSQEBtn(driver).click();
		 
		 Thread.sleep(1000);
		 //点击提交
		 MediaPurchasingManagementSystem_SQE.addPage_submitBtn(driver).click();
		 Thread.sleep(3000);
		 
		 //获取alert提示框内容
		 Alert alert = driver.switchTo().alert();
		 logger.info("#################" + alert.getText());
		 Assert.assertTrue(alert.getText().contains(errorInfo));
		 alert.accept();
	 }

}
