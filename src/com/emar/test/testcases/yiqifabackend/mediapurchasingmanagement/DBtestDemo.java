package com.emar.test.testcases.yiqifabackend.mediapurchasingmanagement;

import org.databene.benerator.anno.Database;
import org.databene.benerator.anno.Source;
import org.databene.feed4testng.FeedTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
//@DataProvider(name = "feeder")
//@Database(id = "db",environment="yiqifa_bs_88")

@Database(id = "db", url = "jdbc:mysql://172.16.17.182:3306/yiqifa_bs_88", 
		driver = "com.mysql.jdbc.Driver", user = "yiqifa_bs_88", password = "yiqifa_bs_88")

public class DBtestDemo extends FeedTest{

	private static final Logger logger = LoggerFactory.getLogger(DBtestDemo.class);

	 //新增成功数据库字段正确
	 @Test(dataProvider = "feeder")
	 @Source(id="db", selector = "SELECT supplier_name FROM media_supplier ORDER BY id DESC LIMIT 1;")
	 public void test_2_addSQE_SQL(String supplier_name) throws InterruptedException{
		 logger.info("supplier_name" + supplier_name);
		 Assert.assertTrue(supplier_name.equals("SeleniumTest"));
	 }

}
