/*
 * package FileHandling;
 * 
 * import java.io.File; import java.io.FileInputStream; import
 * java.io.FileOutputStream; import java.io.IOException; import
 * java.util.ArrayList;
 * 
 * import org.apache.poi.xssf.usermodel.XSSFCell; import
 * org.apache.poi.xssf.usermodel.XSSFRow; import
 * org.apache.poi.xssf.usermodel.XSSFSheet; import
 * org.apache.poi.xssf.usermodel.XSSFWorkbook;
 * 
 * public class ExcelReader { static String
 * homepath=System.getProperty("user.dir");
 * 
 * static ArrayList<String> listdata = new ArrayList<String>();
 * 
 * static String homepath = System.getProperty("user.dir");
 * 
 * public static void main(String[] args) throws IOException {
 * 
 * File file = new File(homepath + "\\Resources\\TestData.xlsx");
 * FileInputStream fis = new FileInputStream(file); XSSFWorkbook workbook = new
 * XSSFWorkbook(fis); int noOfSheets = workbook.getNumberOfSheets();
 * 
 * XSSFSheet sheet = workbook.getSheet("Data"); int rowsCount =
 * sheet.getPhysicalNumberOfRows(); int cellCount =
 * sheet.getRow(0).getPhysicalNumberOfCells();
 * 
 * // System.out.println("row count is -"+rowsCount); //
 * System.out.println("cell count is -"+cellCount); String cellvalue = null;
 * 
 * Iterator<Row> rowcollection = sheet.rowIterator(); // collection of rows
 * while (rowcollection.hasNext()) {
 * 
 * Row row = rowcollection.next();
 * 
 * Cell cel = row.getCell(0); String firstCellValue = getCellValue(cel); if
 * (firstCellValue.equals("2")) {
 * 
 * Iterator<Cell> cellcollection = row.cellIterator(); // collection of cell
 * 
 * while (cellcollection.hasNext()) {
 * 
 * Cell cell = cellcollection.next();
 * 
 * cellvalue = getCellValue(cell); listdata.add(cellvalue);
 * 
 * }
 * 
 * }
 * 
 * }
 * 
 * System.out.println("Final data:-" + listdata); }
 * 
 * public static String getCellValue(Cell cell) { String cellvalue = null; if
 * (cell.getCellType() == CellType.STRING) { cellvalue =
 * cell.getStringCellValue(); } else { int i = (int) cell.getNumericCellValue();
 * cellvalue = String.valueOf(i); } System.out.println(cellvalue); return
 * cellvalue; } }
 */