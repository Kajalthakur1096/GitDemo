package test.ExcelDemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {
	BufferedReader reader;
	FileInputStream fis;
	XSSFWorkbook workbook;

	public void setExcelHeader() throws IOException {
		fis = new FileInputStream("C:\\Users\\kajal.thakur\\Desktop\\ExcelTesttt.xlsx"); //change the path where your excel file is located
		workbook = new XSSFWorkbook(fis);
		String[] header = { "NAME", "ID", "DESIGNATION" };
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.createRow(0);
		for (int i = 0; i < header.length; i++) {
			Cell cell = row.createCell(i);
			cell.setCellValue(header[i]);
		}
		writeExcel(fis, workbook, sheet);
	}

	public void writeExcel(FileInputStream fis, XSSFWorkbook workbook, XSSFSheet sheet)
			throws NumberFormatException, IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no. of worker you would like to enter");
		int userSize = Integer.parseInt(reader.readLine());
		for (int i = 0; i < userSize; i++) {
			Row newRow = sheet.createRow((i + 1));
			System.out.println("Enter input for worker" + (i + 1));
			for (int j = 0; j < 3; j++) {
				Cell newCell = newRow.createCell(j);
				newCell.setCellValue(reader.readLine());
			}

		}
		copyExcel(workbook, sheet);
		fis.close();
		FileOutputStream fos = new FileOutputStream("C:\\Users\\kajal.thakur\\Desktop\\ExcelTesttt.xlsx"); //change the path where your excel file is located
		workbook.write(fos);
		fos.close();
		workbook.close();
	}

	public void copyExcel(XSSFWorkbook workbook, XSSFSheet sheet) {
		workbook.cloneSheet(0);

	}
}
