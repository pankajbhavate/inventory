package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	
	
	public FileInputStream fi;             
    XSSFWorkbook workbook;               
                                                   
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;
    String path;
    
    
    public excel(String path) {
   	 this.path= path;
//		// TODO Auto-generated constructor stub
	}
	public int getrowcount(String sheetname) throws IOException {
   	 fi= new FileInputStream(path);
   	workbook=new XSSFWorkbook(fi);
   	sheet =  workbook.getSheet(sheetname);
   	 
   	int row=   sheet.getLastRowNum();
   	System.out.println(row);
   	workbook.close();
   	fi.close();
   	return row;
    }
    public int cellcount(String sheetname,int rownum) throws IOException  {
   	 fi =new FileInputStream(path);
   	 workbook = new XSSFWorkbook(fi);
   sheet =	 workbook.getSheet(sheetname);
   	row=   sheet.getRow(rownum);
   	   int cell=     row.getLastCellNum();
   	   System.out.println(cell);
   	   workbook.close();
   	   fi.close();
   	   return cell;}
    
    public String getceldata(String sheetname,int rownum,int colnum) throws IOException {
   	 fi =new FileInputStream(path);
   	 workbook = new XSSFWorkbook(fi);
   	sheet= workbook.getSheet(sheetname);
   	row=   sheet.getRow(rownum);
   	 cell=  row.getCell(colnum);
   	DataFormatter format= new DataFormatter();
   	   
   	
   		String data = format.formatCellValue(cell);
			
		
			
			// TODO: handle exception
		
   	 workbook.close();
   	 fi.close();
   	 
    return data;
    
    }
    
   
   	   
   	   
   	 
 


}
