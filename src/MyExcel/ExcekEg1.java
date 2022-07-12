package MyExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcekEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	//create excel sheet and pass the path along with name and extension
		
	File myfile= new File("C:\\Users\\admin\\Documents\\prac14June.xlsx");	
	//Using WorkbookFactory class read the excel sheet
	//How to read string value
	
	String name= WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(name);
	}

}
