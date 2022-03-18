package composition;

public class Menu {


    private final MainCourse mainCourse;
    private final Dessert dessert;

    public Menu(Dessert dessert, MainCourse mainCourse) {
        this.dessert = dessert;
        this.mainCourse = mainCourse;
    }

    public String starter() {
        return "sallad";
    }

    public String mainCourse() {
        return mainCourse.mainCourse();
    }

    public String dessert() {
        return dessert.dessert();
    }
}
