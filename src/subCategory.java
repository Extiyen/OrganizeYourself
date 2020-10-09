public class subCategory extends Category {

    Category inheritsFrom;

    public subCategory() {
    }

    public void setInheritsFrom(Category mainCategory) {
        this.inheritsFrom = mainCategory;
    }

    public Category getInheritsFrom() {
        return inheritsFrom;
    }
}
