package inheritance;

public class BestValueMenu {

    private final Dessert dessert;
    private final MainCourse mainCourse;
    private final AllergenNotifier allergenNotifier;

    public BestValueMenu(Dessert dessert, MainCourse mainCourse, AllergenNotifier allergenNotifier) {
        this.dessert = dessert;
        this.mainCourse = mainCourse;
        this.allergenNotifier = allergenNotifier;
    }

    public String serveMenu() {
        allergenNotifier.allergenNotification(mainCourse.mainCourse(), concatAllergens(mainCourse));
        allergenNotifier.allergenNotification(dessert.dessert(), concatAllergens(dessert));
        return starter() + "\n" +
                mainCourse.mainCourse() + "\n" +
                dessert.dessert();
    }

    private String concatAllergens(Dish dish) {
        return String.join(", ", dish.allergens());
    }

    private String starter() {
        return "sallad";
    }

}
