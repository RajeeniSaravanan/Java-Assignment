package day9.homework;

	import java.io.File;
	import java.io.IOException;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class FileReadWrite {
		
		public static void readCellDataFromXLfile() throws InvalidFormatException, IOException {
			File filepath=new File("C:\\Users\\saravanan.somu\\Downloads\\MyStudentsData.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(filepath);
			System.out.println(workbook.getSheetName(0));
			XSSFSheet sheet= workbook.getSheet("student");
			//XSSFRow row= ;
			//XSSFCell cell= row.getCell(0);
			
			System.out.println("data at row 0 and cell 0 ==="+sheet.getRow(0).getCell(0).getStringCellValue());		
			System.out.println("data at row 0 and cell 1 ==="+sheet.getRow(0).getCell(1).getStringCellValue());
			System.out.println("data at row 0 and cell 2 ==="+sheet.getRow(0).getCell(2).getStringCellValue());
			
			System.out.println("data at row 1 and cell 0 ==="+sheet.getRow(1).getCell(0).getStringCellValue());
			System.out.println("data at row 1 and cell 1 ==="+sheet.getRow(1).getCell(1).getStringCellValue());
			System.out.println("data at row 1 and cell 2 ==="+sheet.getRow(1).getCell(2).getStringCellValue());
			
		}

		public static void main(String[] args) throws InvalidFormatException, IOException {
			// TODO Auto-generated method stub
			readCellDataFromXLfile();
			
		}

	}


