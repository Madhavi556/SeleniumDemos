package demoselenium;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelWriteRead {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
				
		File fexcel=new File("D:\\Seleniumlp10software\\data.xls");//create excel sheet
		WritableWorkbook writebook=Workbook.createWorkbook(fexcel);//create workbook in the excel
		writebook.createSheet("Logincredentials",0);//create work sheet Name,first sheet

		WritableSheet writesheet=writebook.getSheet(0);
		Label data1=new Label(0,0,"admin");//write in first row first column
		writesheet.addCell(data1);
		
		Label data2=new Label(1,0,"admin123");//write in first row first column
		writesheet.addCell(data2);
		
		writebook.write();
		writebook.close();

		
		Workbook workbook=Workbook.getWorkbook(new File("D:\\Seleniumlp10software\\data.xls"));
		Sheet sheet=null;
		int totalsheets=workbook.getNumberOfSheets();
		Cell cell2=null;
		for(int s=0;s<totalsheets;s++)
			sheet=workbook.getSheet(s);
		
		
			int totalrows=sheet.getRows();
			int totalcolumns=sheet.getColumns();
			System.out.println(sheet.getRows()+ "\t" +sheet.getColumns());
			System.out.println("data from sheet");
			
			for(int i=0;i<totalrows;i++)
				for(int j=0;j<totalcolumns;j++){
					cell2=sheet.getCell(j, i);
					if(cell2.getContents().length()>0)
						System.out.println(cell2.getContents());
				}
			
		
		


}
}
