package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2_print1row {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("E:\\monali\\Exceel1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
        short cellSize = sh.getRow(3).getLastCellNum();
		
		for(int i=0;  i<=cellSize-1; i++)
		{
			String data = sh.getRow(3).getCell(i).getStringCellValue();
			System.out.println(data);
		}
	}

}
