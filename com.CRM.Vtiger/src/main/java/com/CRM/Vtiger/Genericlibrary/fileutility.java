package com.CRM.Vtiger.Genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellReferenceType;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class fileutility {
	/**
	 * this method is generic method which is used to read data from properties file  
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readdatafromproperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream(ipathconstants.propretypath);
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
			
	}
     /**
      * this method is generic method which is used to read string   data from excel file 
      * @param sheet
      * @param row
      * @param cell
      * @return
      * @throws EncryptedDocumentException
      * @throws IOException
      */
	
	public String readdatafromexcelstring(String sheet,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(ipathconstants.Excelpath);
		Workbook wb= WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
			
			
	}
	/**
	 * this method is generic method which is used to read numeric  data from excel file 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double readdatafromexcelnumeric(String sheet,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(ipathconstants.Excelpath);
		Workbook wb= WorkbookFactory.create(fis);
		 double data = wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		return data;
		
			
			
	}
}
