package com.emar.test.data;

import java.util.ArrayList;
import java.util.List;

//输入框测试数据数据整理
public class StringTestModel {
	public static final String abnormalString = "；<scrīpt></scrīpt>；<br>；<tr>；<td>；< /tr>；</td>；</html>；</body>；</table>"
							+ "！@＃￥%……&*（）"
							+ "!@#$%^&*()"
							+  "<b>Hello</b>，alert(\"hello\")";
	public static final String nullString = "";
	
	public static final String oneStr = "a";
	
	public static final String blankspace = " ";
	
	public static final String number = "1234567890";
	
	public static final String letter = "aqwertyuioplkjhgfdsazxcvbnm";
	
	public static final String normalString = " 文本框输入测试 test !!!!";
	
	public static final String more100 = "android 文本框输入测试 test  大于100字 android 文本框输入测试 test  大于100字 android 文本框输入测试 test  大于100字 android 文本框输入测试 test  大于100字android 文本框输入测试 test  大于100字android 文本框输入测试 test  大于100字android 文本框输入测试 test  大于100字android 文本框输入测试 test  大于100字android 文本框输入测试 test  大于100字android 文本框输入测试 test  大于100字android 文本框输入测试 test  大于100字android 文本框输入测试 test  大于100字android 文本框输入测试 test  大于100字";
	
	public static final String hanzi = "全角汉字、半角汉字";
	
	public static final String includeBlank = " 首尾 和中间 有空格 ";
	
	
	
	
	public static List<String> stringTestList(){
		List<String> list = new ArrayList<String>();
		list.add(abnormalString);
		list.add(nullString);
		list.add(oneStr);
		list.add(blankspace);
		list.add(number);
		list.add(letter);
		list.add(normalString);
		list.add(more100);
		list.add(hanzi);
		list.add(includeBlank);
		return list;
	}
	
	public static List<String> stringTestList_normal(){
		List<String> list = new ArrayList<String>();
		list.add(oneStr);
		list.add(number);
		list.add(letter);
		list.add(normalString);
		list.add(hanzi);
		list.add(includeBlank);
		return list;
	}
	
	public static List<String> stringTestList_error(){
		List<String> list = new ArrayList<String>();
		list.add(abnormalString);
		list.add(nullString);
		list.add(blankspace);
		list.add(more100);
		return list;
	}
	
}
