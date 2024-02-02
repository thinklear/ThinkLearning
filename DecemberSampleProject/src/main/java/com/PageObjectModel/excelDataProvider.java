package com.PageObjectModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDataProvider {
	public void getStringData(String sheetName, int row, int cell ) throws Exception {
		String path="C:\\Users\\gokul.s.dukre\\eclipse-workspace\\DecemberSampleProject\\ExcelData.xml\\ExcelSheet1.xlsx";
		 FileInputStream file =new FileInputStream(path);	
		 XSSFWorkbook wb=new XSSFWorkbook(file);
		String testData= wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		 System.out.println(testData);
		 String testData1=wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		 System.out.println(testData1);
		 
	}
	public static void main (String [] args) throws Exception {
		excelDataProvider excelData=new excelDataProvider();
		excelData.getStringData("Sheet1", 0, 0);
	
	}

}
