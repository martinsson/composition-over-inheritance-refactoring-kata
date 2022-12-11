package inheritance.dessert;

import inheritance.AllergenNotifier;
import inheritance.Dessert;

public class Brownie implements Dessert {

    private final AllergenNotifier allergenNotifier;

    public Brownie(AllergenNotifier allergenNotifier) {
        this.allergenNotifier = allergenNotifier;
    }

    @Override
    public String dessert() {
        allergenNotifier.allergenNotification("brownie", "nuts");
        return "brownie";
    }
}