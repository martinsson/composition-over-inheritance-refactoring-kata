package inheritance;


import java.io.PrintStream;

public class GourmetsMenu extends BestValueMenu {
    public GourmetsMenu(PrintStream out) {
        super(out);
    }

    @Override
    protected String dessert() {
        allergenNotification("crème caramel", "milk");
        return "crème caramel";
    }
}
