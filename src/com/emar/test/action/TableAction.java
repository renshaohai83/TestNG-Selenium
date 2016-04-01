package com.emar.test.action;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * 页面table表格的操作类
 * 
 * */
public class TableAction {

    
    /** 从一个table的单元格中得到文 值. 参数tableCellAddress的格式为 
    row.column, 行列从0开始. 
    @param by  用于得到table对象 
    @param tableCellAddress 一个单元格地址, 如. "1.4" 
    @return 从一个table的单元格中得到文本值 
    */  
    public String getCellText(WebElement table,String tableCellAddress) {  
        //得到table元素对象  
        //WebElement table = webElement;  
        //对所要查找的单元格位置字符串进行分解，得到其对应行、列。  
        int index = tableCellAddress.trim().indexOf('.');  
        int row =  Integer.parseInt(tableCellAddress.substring(0, index));  
        int cell = Integer.parseInt(tableCellAddress.substring(index+1));  
        //得到table表中所有行对象，并得到所要查询的行对象。  
         List<WebElement> rows = table.findElements(By.tagName("tr"));  
         WebElement theRow = rows.get(row);  
         //调用getCell方法得到对应的列对象，然后得到要查询的文本。  
         String text = getCell(theRow, cell).getText();  
         return text;  
    }  
    private WebElement getCell(WebElement Row,int cell){  
         List<WebElement> cells;  
         WebElement target = null;  
         //列里面有"<th>"、"<td>"两种标签，所以分开处理。  
         if(Row.findElements(By.tagName("th")).size()>0){  
            cells = Row.findElements(By.tagName("th"));  
            target = cells.get(cell);  
         }  
         if(Row.findElements(By.tagName("td")).size()>0){  
            cells = Row.findElements(By.tagName("td"));  
            target = cells.get(cell);  
         }  
        return target;  
           
    }  
    
    /** 从一个table的单元格中遍历文本值. 
    row.column, 行列从1开始. 
    @param table  table对象 
    @param text 要查找的文本
    @param startcell，endcell 从startcell列开始查找，找到第endcell列。如：2,4 即是搜索第2至第4列
    row.column, 行列从1开始. 
    @return 从一个table的单元格中找到含有文本值的所有行的行数的list 
    */  
    public List<Integer> rowNumOfContainCellText(WebElement table,String text,int startcell,int endcell){
    	
        //得到table表中所有行对象，并得到所要查询的行对象。  
         List<WebElement> rows = table.findElements(By.tagName("tr"));           
        //得到table表的行数
         int rowsSize = rows.size();
         //遍历每一个cell是否包含text字符，如果包含返回inculeRows
         List<Integer> inculeRows = new ArrayList<Integer>();
         
         for(int i=1;i<rowsSize;i++){
        	 List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
             WebElement theRow = rows.get(i);  

        	 for(int n=startcell-1;n<=endcell-1;n++){
        		String textString = getCell(theRow,n).getText();
        		//System.out.println("text=" + textString);
        		if (textString.equals(text)){
        			inculeRows.add(i);
        			}
        	 }     	 

         } 
         //返回包含字符的行数
         return inculeRows;

      
    }
    
    /** 从一个table的单元格中遍历文本值. 
    row.column, 行列从1开始. 
    @param table  table对象 
    @param text 要查找的文本
    @param startcell，endcell 从startcell列开始查找，找到第endcell列。如：2,4 即是搜索第2至第4列
    row.column, 行列从1开始. 
    @return 从一个table的单元格中找到含有文本值的第一行的行数
    */    
    public Integer firstRowNumOfContainCellText(WebElement table,String text,int startcell,int endcell){
    	
        //得到table表中所有行对象，并得到所要查询的行对象。  
         List<WebElement> rows = table.findElements(By.tagName("tr"));           
        //得到table表的行数
         int rowsSize = rows.size();
         //遍历每一个cell是否包含text字符，如果包含返回inculeRows
         int inculdeRow = 0;
         
         for(int i=1;i<rowsSize;i++){
        	 List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
             WebElement theRow = rows.get(i);  
             
        	 for(int n=startcell-1;n<=endcell-1;n++){
        		String textString = getCell(theRow,n).getText();
        		System.out.println("text=" + textString);
        		if (textString.equals(text)){
        			inculdeRow=i;   
        			break;
        			}
        	 } 
        	 
        	 if (inculdeRow!=0){
        		 break;
        	 }

         } 
         //返回包含字符的行数
		return inculdeRow;
      
    }
}
