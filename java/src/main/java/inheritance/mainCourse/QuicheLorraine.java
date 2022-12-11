package inheritance.mainCourse;

import inheritance.AllergenNotifier;
import inheritance.MainCourse;

public class QuicheLorraine implements MainCourse {

    private final AllergenNotifier allergenNotifier;

    public QuicheLorraine(AllergenNotifier allergenNotifier) {
        this.allergenNotifier = allergenNotifier;
    }

    @Override
    public String mainCourse() {
        allergenNotifier.allergenNotification("quiche lorraine", "milk");
        return "quiche lorraine";
    }
}