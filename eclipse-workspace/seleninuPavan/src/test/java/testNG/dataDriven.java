package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	public static FileInputStream fi ;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow wr;
	public static XSSFCell wc;
	
	public static int getLastrow(String File, String sheet) throws IOException {
		fi = new FileInputStream(File);
	   wb= new XSSFWorkbook(fi);
	   ws = wb.getSheet(sheet);
	   int RowCount =ws.getLastRowNum();
	 wb.close();
	 fi.close();
	 return RowCount;
	}
	
	public static int geltcellcount(String File,String sheet , int rownum) throws IOException {
		fi = new FileInputStream(File);
		   wb= new XSSFWorkbook(fi);
		   ws = wb.getSheet(sheet);
		   wr= ws.getRow(rownum);
		    int CellCount= wr.getLastCellNum();
		    wb.close();
			 fi.close();
	return CellCount;}
	
	public static String getCellData(String File,String sheet , int rownum, int colnum) throws IOException {
		
		fi = new FileInputStream(File);
		   wb= new XSSFWorkbook(fi);
		   ws = wb.getSheet(sheet);
		   wr= ws.getRow(rownum);
		  wc = wr.getCell(colnum);
		  
		  String data;
		  try {
			  DataFormatter formatter = new DataFormatter(); 
				data = formatter.formatCellValue(wc);
		  }
		  catch(Exception e){
				data = " ";
		  }
		  wb.close();
			fi.close();
			return data;
	}
	

	

}
