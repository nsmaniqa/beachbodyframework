package tools;

import java.io.File;
import java.io.FileInputStream;
import java.util.Dictionary;
import java.util.Hashtable;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.HSSF.usermodel.HSSFSheet;
//import org.apache.poi.HSSF.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class Excel {
	
	
	
	public static Dictionary<String, String> readfromExcelinDict(String sSheet) 
	{
		try
		{
		
		String sDataFile=	System.getProperty("user.dir") +"\\Resources\\" +"Test_data.xls";
		 System.out.println(sDataFile);
		//test file is located in your project path         
	    FileInputStream fileIn = new FileInputStream(sDataFile);
	    //read file 
	   
	    POIFSFileSystem fs = new POIFSFileSystem(fileIn);
	   
	    HSSFWorkbook filename = new HSSFWorkbook(fs);
	    System.out.println("helow");
	    //open sheet 0 which is first sheet of your worksheet
	    HSSFSheet sheet = filename.getSheet(sSheet);
	   
	    
	    System.out.println(sSheet);
	 // create a new hashtable
	    Dictionary<String, String> dict = new Hashtable();
	    int iCheck;
	    System.out.println("bfore loop");
	    for ( iCheck=0;iCheck<50;iCheck++)
	    {
	    	if(sheet.getRow(0).getCell(iCheck).getStringCellValue().equals("end") )
	    	{
	    		break;
	    	}
	    	
	    }
	    
	    System.out.println("totla column is" +iCheck);
	    // add elements in the hashtable
	    int icount;
	    
		for (icount=0 ; icount<iCheck;icount++)
	    {
	    dict.put(sheet.getRow(0).getCell(icount).getStringCellValue(), sheet.getRow(1).getCell(icount).getStringCellValue());
	    
	     
	    }
	  System.out.println(dict.get("username"));
	    
	    
	    return dict;
		}
		catch(Exception e)
		{
			return null;
		
		}
		
		
	}
	}
	

	