package service;

import org.apache.poi.ss.usermodel.Sheet;

import java.io.PrintWriter;

public interface CategoriesImpexService {

    public void categoriesCreation(Sheet sheetZero, PrintWriter printableImpex);
}
