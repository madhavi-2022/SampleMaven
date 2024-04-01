package com.SeleniumMaven.SampleMaven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleXlsx {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook Excelwb=new XSSFWorkbook();
		XSSFSheet sheet1=  Excelwb.createSheet("XLSXFile");
		
		
		XSSFRow row1=sheet1.createRow(0);
		row1.createCell(0).setCellValue("FirstName");
		row1.createCell(1).setCellValue("LatName");
		row1.createCell(2).setCellValue("Email");
		row1.createCell(3).setCellValue("Password");
		row1.createCell(4).setCellValue("State");
		
		XSSFRow row2=sheet1.createRow(1);
		row2.createCell(0).setCellValue("Madhavi");
		row2.createCell(1).setCellValue("Chennupati");
		row2.createCell(2).setCellValue("Madhavi.chennupati4@gmail.com");
		row2.createCell(3).setCellValue("Madhavi");
		row2.createCell(4).setCellValue("AP");
		
		XSSFRow row3=sheet1.createRow(2);
		row3.createCell(0).setCellValue("Pulivarthi");
		row3.createCell(1).setCellValue("Madhavi");
		row3.createCell(2).setCellValue("Madhavi.Pulivarthi@gmail.com");
		row3.createCell(3).setCellValue("Madhavi");
		row3.createCell(4).setCellValue("AP");
		
		String path = "/Users/geethikaadithrichennupati/eclipse-workspace/Automation/ExcelFiles/Data.xlsx";
		FileOutputStream myfile=new FileOutputStream(path);
		
		Excelwb.write(myfile);
		Excelwb.close();
		
		
		
		
		

	}

}
