package com.SeleniumMaven.SampleMaven;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Iterator.*;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass {

	public static void main(String[] args) throws IOException {
	
	//	System.setProperty("webdriver.chrome.driver","/Applications/Softwares/chromedriver-mac-arm64/chromedriver");
	/*	WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		driver.manage().window().maximize();

	//	WebElement radio1 = driver.findElement(By.id("sex-0"));
	//	radio1.click();*/
		
		
		
			String Path="/Applications/Softwares/ExcelData.xlsx";
			FileInputStream file=new FileInputStream(Path);
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet= workbook.getSheetAt(0);
			int rows=sheet.getLastRowNum();
			int cols=sheet.getRow(1).getLastCellNum();
		/*	for(int r=0;r<=rows;r++)
			{
				XSSFRow row=sheet.getRow(r);
				for(int c=0;c<cols;c++) {
					XSSFCell cell = row.getCell(c);
					switch(cell.getCellType())
					{
					case STRING:System.out.println(cell.getStringCellValue());break;
					case NUMERIC:System.out.println(cell.getNumericCellValue());break;
					case BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
					default:
						break;
					}
					
					
				}
				System.out.println();
			}*/
			////////////By Using ITERATOr///////////////
			
			Iterator  itertr = sheet.iterator();
			while(itertr.hasNext()) {
				XSSFRow row= (XSSFRow) itertr.next();

				Iterator  Cellitertr = row.cellIterator();
				while(Cellitertr.hasNext())
				{
					XSSFCell cell =(XSSFCell) Cellitertr.next();
					switch(cell.getCellType())
					{
					case STRING:System.out.print(cell.getStringCellValue());break;
					case NUMERIC:System.out.print(cell.getNumericCellValue());break;
					case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
					}
					System.out.print(" | ");
					
				}
				System.out.println();
				
			}
			
		

	}

}
