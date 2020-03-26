package com.google.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadTest2 {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("TestUtils/OpenEMRData.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file);

		XSSFSheet sheet = book.getSheet("validCredentialTest");
		

		int rowCount =sheet.getPhysicalNumberOfRows();
		
		System.out.println(rowCount);
		
		DataFormatter format=new DataFormatter();
		
				
		//row
		for(int i =0 ; i<rowCount; i++ )
		{
			System.out.println("---------------------");
			XSSFRow row= sheet.getRow(i);
			int cellCount = row.getPhysicalNumberOfCells();
			//System.out.println(cellCount);
			//cell
			for(int j=0;j<cellCount;j++)
			{
				XSSFCell cell= row.getCell(j);
				String cellValue = format.formatCellValue(cell);
				System.out.println(cellValue);
			}
			System.out.println("----------------------");
		}
		
		
		book.close();
		
		file.close();
		
	}

}
