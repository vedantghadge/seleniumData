package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	static String homepath=System.getProperty("user.dir");
	public static void main(String[] args) throws IOException {
		
      XSSFWorkbook workbook=new XSSFWorkbook();
      XSSFSheet sheet=workbook.createSheet();
    
      
		
		  XSSFRow row0=sheet.createRow(0); 
		  XSSFCell cell=row0.createCell(0);
		  XSSFCell cell1=row0.createCell(1);
          XSSFCell cell2=row0.createCell(2);
          cell.setCellValue("Number");
		  cell1.setCellValue("Age");
          cell2.setCellValue("value");
      
      for(int row1=1 ;row1<10; row1++) {
    	  XSSFRow rowadd=sheet.createRow(row1);
      
      for (int col=0;col<3;col++) {
    	  XSSFCell celladd=rowadd.createCell(col);
    	  double value=Math.random()*100;
    	  celladd.setCellValue(value);
      }
      }
      File file=new File(homepath+"\\Resources\\data1.xlsx");
      FileOutputStream fos=new FileOutputStream(file);
      workbook.write(fos);

 
      workbook.close();
      System.out.println("file id created ");
		 
	}

}
