package populators;

import model.Category;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;

public class CategoryPopulator {

    public Category populateCategory(Row row){
        Category category = new Category();
        category.setId(null != row.getCell(0) ? row.getCell(0).getStringCellValue() : StringUtils.EMPTY);
        category.setName(null != row.getCell(1) ? row.getCell(1).getStringCellValue() : StringUtils.EMPTY);
        //;catalogVersionBlank;
        category.setSuperCategoryName(null != row.getCell(3) ? row.getCell(3).getStringCellValue() : StringUtils.EMPTY);
        category.setRank(null != row.getCell(4) ? row.getCell(4).getNumericCellValue() : 1);
        category.setWorkload(null != row.getCell(5) ? row.getCell(5).getBooleanCellValue() : Boolean.FALSE);
        //;mediaBlank;
        category.setGrowthRate(null != row.getCell(9) ? row.getCell(9).getNumericCellValue() : 0);
        category.setSystemTerm(null != row.getCell(7) ? row.getCell(7).getStringCellValue() : StringUtils.EMPTY);
        //:desriptionBlank;pictureBlank;urlBlank;isActive(needed);
        category.setActive(Boolean.TRUE);
        category.setDependency(null != row.getCell(18) ? row.getCell(18).getStringCellValue() : StringUtils.EMPTY);
        category.setRepeatable(null != row.getCell(12) ? row.getCell(12).getBooleanCellValue() : Boolean.FALSE);
        category.setNoOfRepeatableSets(null != row.getCell(13) ? row.getCell(13).getNumericCellValue() : 0);
        category.setSizingCardTitle(null != row.getCell(14) ? row.getCell(14).getStringCellValue() : StringUtils.EMPTY);
        category.setSizingQuestions(null != row.getCell(15) ? row.getCell(15).getStringCellValue() : StringUtils.EMPTY);
        category.setUom1(null != row.getCell(16) ? row.getCell(16).getStringCellValue() : StringUtils.EMPTY);
        category.setUom2(null != row.getCell(17) ? row.getCell(17).getStringCellValue() : StringUtils.EMPTY);
        return category;
    }
}
