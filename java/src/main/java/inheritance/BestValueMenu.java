package inheritance;

public class BestValueMenu {


    public String serveMenu(BestValueMenu bestValueMenu) {
        return bestValueMenu.starter() + "\n" +
                bestValueMenu.mainCourse() + "\n" +
                bestValueMenu.dessert();
    }

    private String starter() {
        return "sallad";
    }

    protected String mainCourse() {
        allergenNotification("quiche lorraine", "milk");
        return "quiche lorraine";
    }

    protected String dessert() {
        allergenNotification("brownie", "nuts");
        return "brownie";
    }

    protected void allergenNotification(String plate, String allergenType) {
        System.out.println("[Allergen]: " + plate + " contains " + allergenType);
    }
}
