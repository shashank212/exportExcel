package service.impl;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import service.ExcelUtility;
import service.MainService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServiceImpl implements MainService {

    public void createMainImpex() {
        PropertyServiceImpl propertyService = new PropertyServiceImpl();
        ExcelUtility excelUtility = new ExcelUtility();

        XSSFWorkbook document = getMainExcel(propertyService);

        createCategoriesImpex(document, propertyService, excelUtility);
    }

    public void createCategoriesImpex(XSSFWorkbook document, PropertyServiceImpl propertyService, ExcelUtility excelUtility) {
        PrintWriter printCategoriesImpex = null;
        try {
            printCategoriesImpex = new PrintWriter(
                    propertyService.fetchStringProperty("gl.impex.generate.location"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int sheetNumber = 0;
        try {
            sheetNumber = Integer.parseInt(propertyService.fetchProperty("gl.excel.categories.sheet"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        CategoriesImpexServiceImpl categoriesImpexService = new CategoriesImpexServiceImpl();
        categoriesImpexService.categoriesCreation(document.getSheetAt(sheetNumber), printCategoriesImpex);

        printCategoriesImpex.close();
    }

    public XSSFWorkbook getMainExcel(PropertyServiceImpl propertyService) {
        XSSFWorkbook document = null;
        try {
            document = new XSSFWorkbook(
                    new FileInputStream(propertyService.fetchStringProperty("gl.excel.main.location")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }
}
