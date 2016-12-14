package seleniumdays;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Day4ReaddataExcel {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
Workbook excel=Workbook.getWorkbook(new File("C:\\Users\\DHAKSHAN\\Desktop\\selenium\\testing.xls"));
Sheet sh=excel.getSheet("page2");
// for single value
//System.out.println(sh.getCell(1,2).getContents());
//to find entire value
for(int i=0;i<sh.getRows();i++)
{
	for (int j=0;j<sh.getColumns();j++)
	{
		System.out.println(sh.getCell(j,i).getContents());
	}
}
	}

}
