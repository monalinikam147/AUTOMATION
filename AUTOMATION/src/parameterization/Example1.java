package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	//FileInputStream obtains input bytes from a file in a file system.
	FileInputStream file = new FileInputStream("E:\\monali\\Exceel1.xlsx");
	 
	
	//getStringCellValues function is use to String or char data type
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
     String data1 = sh.getRow(0).getCell(0).getStringCellValue();
     System.out.println(data1);
       
    String data2 = sh.getRow(1).getCell(0).getStringCellValue();
    System.out.println(data2);
    
    
    //getNumericCellValue function is use to integer data type
    double data3 = sh.getRow(0).getCell(1).getNumericCellValue();
    System.out.println(data3);
    
    
    //Explicit casting
    int d3 = (int)data3;
    System.out.println(d3);
    
    // getBooleanCellValue is used to boolean data type
     boolean data4 = sh.getRow(0).getCell(2).getBooleanCellValue();
     System.out.println(data4);
    
     String data5 = sh.getRow(1).getCell(1).getStringCellValue();
     System.out.println(data5);
     
     //string and int combination use  getStringCellValue
     String data6 = sh.getRow(1).getCell(2).getStringCellValue();
     System.out.println(data6);
     
     
     //getLastRowNum() is use to identify row size
     int rowSize = sh.getLastRowNum();//count row from 0th index
	 System.out.println(rowSize);//actual row size = rowsize(getLastRowNum())+1
	 System.out.println(rowSize+1);//actual row size so we use rowsize +1
	 
	
	
	//getLastCellNum() is use to identify cell size
	 short cellSize = sh.getRow(0).getLastCellNum();//cell size depend on number of value present in row
	 System.out.println(cellSize);
	 
	 
	 
	 
	 
	 
     
     
     
		
			
	}
}
