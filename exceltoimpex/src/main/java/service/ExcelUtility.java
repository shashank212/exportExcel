package service;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.PrintWriter;
import java.util.Iterator;

public class ExcelUtility {

    public void headerCreation(Sheet sheetZero, PrintWriter printableImpex) {
        int headerCount = 0;
        Iterator<Row> rowIterator = sheetZero.iterator();

        while (rowIterator.hasNext() && headerCount < 20) {
            headerCount++;

            Row row = rowIterator.next();
            Cell cell = row.getCell(0);
            if (null!=cell && StringUtils.isNotEmpty(cell.getStringCellValue())){
                System.out.println("adding--" + cell.getStringCellValue());
                printableImpex.println(null != cell.getStringCellValue() ? cell.getStringCellValue() : "Filler");
            }
        }
    }
}
