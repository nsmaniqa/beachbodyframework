import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;





public class ReadExcel {

	public static void main(String[] args) throws BiffException, IOException  {
	Workbook excell=	Workbook.getWorkbook(new File("C:\\Users\\DHAKSHAN\\Desktop\\selenium\\testing.xls"));
	Sheet sh=excell.getSheet("first")	;
for(int i= 0;i<sh.getRows();i++)
{
	for(int j=0;j<sh.getColumns();j++)
	{
		System.out.println(sh.getCell(j,i).getContents());
	}
}
	}

}

