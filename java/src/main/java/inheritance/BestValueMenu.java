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
        return "quiche lorraine";
    }

    protected String dessert() {
        return "brownie";
    }
}
