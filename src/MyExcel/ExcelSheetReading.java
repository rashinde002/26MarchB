package MyExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
   FileInputStream myfile= new FileInputStream("C:\\Users\\admin\\Documents\\prac14June.xlsx");
	
   Workbook book= WorkbookFactory.create(myfile);
  Sheet mySheet= book.getSheet("Sheet1");
   Row myRow= mySheet.getRow(0);
   Cell myCell=myRow.getCell(1);	
	System.out.println(myCell.getCellType());
	System.out.println("========================================================");
	
	//Code for reading whole data from Excelsheet
	Sheet mySheet2= book.getSheet("Sheet2");
	
	for(int i=0;i<=1; i++)//outer loop
	{
		for(int j=0; j<=1; j++)//inner loop
		{
		String value= mySheet2.getRow(0).getCell(0).getStringCellValue();
		System.out.print(value+ " ");
		}
		System.out.println();
	}
	System.out.println("=============================================================");
	}

}
