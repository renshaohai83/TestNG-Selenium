package com.emar.test.data;

import com.emar.test.testutils.MyWebdriver;

public class K{

	//Webdriver的设置
	public static final String FireFoxDriverPath = "E:\\Program Files\\Mozilla Firefox\\firefox.exe";	
	public static final String ChromeDriverPath = "C:\\Users\\renshaohai\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe";	
	public static final String InternetExplorerDriverPath = "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe";
	
	//亿起发前台测试地址：
	public static final String yiqifa_FrontendWeb_address = "http://172.16.17.210:8062/";
	
	public static final String yiqifa_FrontendWeb_ProfermanceStatistics= yiqifa_FrontendWeb_address + "";
	
	//亿起发后台测试站地址：
	//public static final String Website = "http://172.16.17.214:8062/main";
	public static final String Website = "http://172.16.17.210:8062/mgrLoginForm.do";
	
	public static final String Web_address = "http://172.16.17.210:8062/";
	
	//媒体采购管理系统-财务数据统计
	public static final String Web_MediaPurchasingManagementSystem_FinanceDataState = Web_address + "mediaFinancialStat.do";
	//媒体采购管理系统-供应商管理
	public static final String Web_MediaPurchasingManagementSystem_SQE = Web_address + "mediaSupplierList.do";
	
	public static final String Web_MediaPurchasingManagementSystem_SQE_AddPage = Web_address + "createOrUpdateSupplier.do?";
	//媒体采购管理系统-广告位管理
	public static final String Web_MediaPurchasingManagementSystem_ADmanage = Web_address + "mediaAdZoneList.do";
	//媒体采购管理系统-投放数据管理
	public static final String Web_MediaPurchasingManagementSystem_LanuchDataManage = Web_address + "mgrmediaDailyStat.do";

	
	//用户管理-角色管理
	public static final String Web_UserManagement_RoleManage = Web_address + "umRoleBeginList.do";
	//用户管理-角色管理-角色编辑
	public static final String Web_UserManagement_RoleManageEdit = Web_address + "umRoleForm.do?roleId=";
	//用户管理-角色功能编辑
	public static final String Web_UserManagement_RoleAuthorityEdit = Web_address + "mgrPrivilegeForm.do?roleId=";

	//数据管理-CPA原始数
	public static final String DataManagement_CPAOriginalData= Web_address + "mgrImportCpaOriBeginList.do";
}
