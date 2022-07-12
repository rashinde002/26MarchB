package MyExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Excel1 
{
  public static void main(String args) throws EncryptedDocumentException, IOException
  {
	FileInputStream myfile= new FileInputStream("C:\\Users\\admin\\Documents\\prac14June.xlsx");
	 
	//File myfile= new File("C:\\Users\\admin\\Documents\\prac14June.xlsx");
     String name= WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
     System.out.println(name);
    
      //how to read the numeric value
     
     double number = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
       System.out.println(number);
  
  }
}
