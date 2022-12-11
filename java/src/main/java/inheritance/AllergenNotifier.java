package inheritance;

public class AllergenNotifier {
    public AllergenNotifier() {
    }

    public void allergenNotification(String plate, String allergenType) {
        System.out.println("[Allergen]: " + plate + " contains " + allergenType);
    }
}