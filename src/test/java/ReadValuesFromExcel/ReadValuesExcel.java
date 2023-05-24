package ReadValuesFromExcel;

import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadValuesExcel {
	@Test
	public void dataReadTest() throws Exception {
		// location of the excel file
		String excelFilePath = ".//ExcelTestData//ReadValues.xlsx";
		// open the excel file using FileInputstream
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		// get the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		// get the sheet with index
		XSSFSheet sheet = workbook.getSheetAt(0);

		// get row and column values from sheet
		/*
		 * String result = sheet.getRow(2).getCell(0).getStringCellValue();
		 * System.out.println("The readed values from excel..."+result);
		 */

		// using Iterator
		Iterator iterate = sheet.iterator();//it will return all row which can be iterated
		while (iterate.hasNext()) // verify for next record, if it is der it will pass
		{
			XSSFRow row = (XSSFRow) iterate.next(); // it will written the first row data from excel sheet, it capture all the row data
			Iterator cellIterator = row.cellIterator();//from row, all the cell data is retrived and stored in cellIetrator
			while (cellIterator.hasNext()) {
				XSSFCell cell = (XSSFCell) cellIterator.next();
				System.out.println(cell);
			}
			System.out.println();
		}
	}
}
