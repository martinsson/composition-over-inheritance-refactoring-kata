package inheritance.dessert;

import inheritance.AllergenNotifier;
import inheritance.Dessert;

public class CremeCaramel implements Dessert {

    private final AllergenNotifier allergenNotifier;

    public CremeCaramel(AllergenNotifier allergenNotifier) {
        this.allergenNotifier = allergenNotifier;
    }

    @Override
    public String dessert() {
        allergenNotifier.allergenNotification("crème caramel", "milk");
        return "crème caramel";
    }
}