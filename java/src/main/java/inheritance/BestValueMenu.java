package inheritance;

public class BestValueMenu {


    private final Dessert dessert;
    private final MainCourse mainCourse;

    public BestValueMenu(Dessert dessert, MainCourse mainCourse) {
        this.dessert = dessert;
        this.mainCourse = mainCourse;
    }

    public String serveMenu() {
        return this.starter() + "\n" +
                mainCourse.mainCourse() + "\n" +
                dessert.dessert();
    }

    private String starter() {
        return "sallad";
    }

}
