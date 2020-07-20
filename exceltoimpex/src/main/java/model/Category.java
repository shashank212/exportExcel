package model;

public class Category {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperCategoryName() {
        return superCategoryName;
    }

    public void setSuperCategoryName(String superCategoryName) {
        this.superCategoryName = superCategoryName;
    }

    public Boolean getWorkload() {
        return isWorkload;
    }

    public void setWorkload(Boolean workload) {
        isWorkload = workload;
    }

    public String getSystemTerm() {
        return systemTerm;
    }

    public void setSystemTerm(String systemTerm) {
        this.systemTerm = systemTerm;
    }

    public Double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(Double growthRate) {
        this.growthRate = growthRate;
    }

    public Boolean getMultiSetQuestion() {
        return multiSetQuestion;
    }

    public void setMultiSetQuestion(Boolean multiSetQuestion) {
        this.multiSetQuestion = multiSetQuestion;
    }

    public Double getNoOfSets() {
        return noOfSets;
    }

    public void setNoOfSets(Double noOfSets) {
        this.noOfSets = noOfSets;
    }

    public Boolean getRepeatable() {
        return isRepeatable;
    }

    public void setRepeatable(Boolean repeatable) {
        isRepeatable = repeatable;
    }

    public Double getNoOfRepeatableSets() {
        return noOfRepeatableSets;
    }

    public void setNoOfRepeatableSets(Double noOfRepeatableSets) {
        this.noOfRepeatableSets = noOfRepeatableSets;
    }

    public String getSizingCardTitle() {
        return sizingCardTitle;
    }

    public void setSizingCardTitle(String sizingCardTitle) {
        this.sizingCardTitle = sizingCardTitle;
    }

    public String getSizingQuestions() {
        return sizingQuestions;
    }

    public void setSizingQuestions(String sizingQuestions) {
        this.sizingQuestions = sizingQuestions;
    }

    public String getUom1() {
        return uom1;
    }

    public void setUom1(String uom1) {
        this.uom1 = uom1;
    }

    public String getUom2() {
        return uom2;
    }

    public void setUom2(String uom2) {
        this.uom2 = uom2;
    }

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency;
    }


    public void setRank(Double rank) {
        this.rank = rank;
    }

    public Double getRank() {
        return rank;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    String id;
    String name;
    String superCategoryName;
    Double rank;
    Boolean isWorkload;
    String systemTerm;
    Double growthRate;
    Boolean multiSetQuestion;
    Double noOfSets;
    Boolean isRepeatable;
    Double noOfRepeatableSets;
    String sizingCardTitle;
    String sizingQuestions;
    String uom1;
    String uom2;
    String dependency;
    Boolean isActive;

}
