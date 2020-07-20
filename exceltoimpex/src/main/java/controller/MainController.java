package controller;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import service.ExcelUtility;
import service.impl.CategoriesImpexServiceImpl;
import service.impl.MainServiceImpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class MainController {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        MainServiceImpl mainService = new MainServiceImpl();
        // Main Impex - merge all other impexes
        mainService.createMainImpex();
    }
}
