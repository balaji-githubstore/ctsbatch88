package com.google.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead3_ExceltoObject_Test {

	public static void main(String[] args) throws IOException {

		DataFormatter format=new DataFormatter();
		
		FileInputStream file = new FileInputStream("TestUtils/OpenEMRData.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file);

		XSSFSheet sheet = book.getSheet("AddPatientTest");
		

		int rowCount =sheet.getPhysicalNumberOfRows();
		
		System.out.println(rowCount);
		
		
		XSSFRow rowCheck= sheet.getRow(0);
		
		int cellCount=rowCheck.getPhysicalNumberOfCells();
		
		//2 dim - based on rowcount and cellcount
		String[][] main=new String[rowCount][cellCount];
				
		//row
		for(int i =0 ; i<rowCount; i++)
		{
			System.out.println("---------------------");
			XSSFRow row= sheet.getRow(i);
			//cell
			for(int j=0;j<cellCount;j++)
			{
				XSSFCell cell= row.getCell(j);
				String cellValue = format.formatCellValue(cell);
				System.out.println(cellValue);
				main[i][j]=cellValue;
			}
			System.out.println("----------------------");
		}
		
		
		book.close();
		
		file.close();
		
	}

}
