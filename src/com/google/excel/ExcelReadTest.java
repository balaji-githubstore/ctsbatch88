package com.google.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadTest {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("TestUtils/OpenEMRData.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file);

		XSSFSheet sheet = book.getSheet("invalidCredentialTest");
		
		XSSFRow row= sheet.getRow(5);
		


		XSSFCell cell= row.getCell(0);
		
		DataFormatter format=new DataFormatter();
		String cellValue = format.formatCellValue(cell);
		
		System.out.println(cellValue);
		
		
		book.close();
		
		file.close();
		
		
	}

}
