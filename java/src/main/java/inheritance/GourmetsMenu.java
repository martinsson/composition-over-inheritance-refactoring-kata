package inheritance;


public class GourmetsMenu extends BestValueMenu {
    @Override
    protected String dessert() {
        allergenNotification("crème caramel", "milk");
        return "crème caramel";
    }
}
