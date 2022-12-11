package inheritance;

import java.io.PrintStream;

public class BestValueMenu {


    private final PrintStream out;

    public BestValueMenu(PrintStream out) {
        this.out = out;
    }

    public String serveMenu() {
        return this.starter() + "\n" +
                this.mainCourse() + "\n" +
                this.dessert();
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
        out.println("[Allergen]: " + plate + " contains " + allergenType);
    }
}
