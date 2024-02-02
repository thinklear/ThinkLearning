package testNGPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.PageObjectModel.BaseClass;

public class ExcelDataTest extends BaseClass{
@Test 
public void excelData() throws Exception {
	
	String path="https://intimetecvisionsoft-my.sharepoint.com/:x:/r/personal/gokul_s_dukre_intimetec_com/_layouts/15/Doc.aspx?sourcedoc=%7B14923EA5-CD99-4F6B-855E-FAA8D18A389F%7D&file=Book%207.xlsx&action=editnew&mobileredirect=true&wdNewAndOpenCt=1703009769671&ct=1703009770136&wdOrigin=OFFICECOM-WEB.START.NEW&wdPreviousSessionSrc=HarmonyWeb&wdPreviousSession=889a3fa4-6ca4-43d4-8292-feb559d49de1&login_hint=gokul.s.dukre%40intimetec.com&cid=da0cd96c-26ac-4418-a1be-99d414860cda";
	 FileInputStream file =new FileInputStream(path);	
	 XSSFWorkbook wb=new XSSFWorkbook(file);
	String testData= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	 System.out.println(testData);
	 String testData1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	 System.out.println(testData1);
	 
}
	
	

}
