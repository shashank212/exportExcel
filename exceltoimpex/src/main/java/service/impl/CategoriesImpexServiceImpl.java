package service.impl;

import model.Category;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import populators.CategoryPopulator;
import service.CategoriesImpexService;
import service.PropertyService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CategoriesImpexServiceImpl implements CategoriesImpexService {
    public void categoriesCreation(Sheet sheetZero, PrintWriter printableImpex) {
        List<Category> categoryList = new ArrayList<Category>();
        CategoryPopulator categoryPopulator = new CategoryPopulator();
        PropertyServiceImpl propertyService = new PropertyServiceImpl();
        int startRow = 0; //make this configurable
        try {
            startRow = Integer.parseInt(propertyService.fetchProperty("gl.excel.categories.startRow"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            printableImpex.println(propertyService.fetchStringProperty("gl.impex.category.header"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = startRow; i < sheetZero.getLastRowNum() + 1; i++) {
            Row row = sheetZero.getRow(i);
            Cell cell = row.getCell(0);
            Category category = categoryPopulator.populateCategory(row);
            categoryList.add(category);
        }
        printingCategoriesImpex(printableImpex, categoryList);
    }

    public void printingCategoriesImpex(PrintWriter printableImpex, List<Category> categoryList) {
        for (Category category : categoryList) {
            printableImpex.println(";" + category.getId() + ";" + category.getName() + ";;" + category.getSuperCategoryName() + ";" + category.getRank() + ";" +
                    category.getWorkload() + ";" + category.getSystemTerm() + ";;;;" + category.getActive() + ";" + category.getDependency() + ";" +
                    category.getRepeatable() + ";" + category.getNoOfRepeatableSets() + ";" + category.getSizingCardTitle() + ";" +
                    category.getSizingQuestions() + ";" + category.getUom1() + ";" + category.getUom2());

        }
    }
}
