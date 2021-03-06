package com.web.test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet 
{

	public static void main(String[] args)
	{
		
		readExcelSheet();

	}
	
	static void readExcelSheet()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		int numRows=0;
		int numCells=0;
		String strData=null;
		
		try
		{
			fin=new FileInputStream("H:\\Simple.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("TestData");
			numRows=sh.getPhysicalNumberOfRows();
			for(int i=0;i<numRows;i++)
			{
				row=sh.getRow(i);
				numCells=row.getPhysicalNumberOfCells();
				for(int c=0;c<numCells;c++)
				{
					cell=row.getCell(c);
					strData=cell.getStringCellValue();
					System.out.print(strData+"\t");
				}
				System.out.println();
			
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
