package inheritance;

public class Main {

    public static void main(String[] args) {
        var bestValueMenu = new BestValueMenu();
        printMenu(bestValueMenu, "best value");
        var meatLoversMenu = new MeatLoversMenu();
        printMenu(meatLoversMenu, "meat lovers");
        var gourmetMenu = new GourmetsMenu();
        printMenu(gourmetMenu, "gourmet");
    }

    private static void printMenu(BestValueMenu bestValueMenu, String menuName) {
        System.out.println("serving "+ menuName + " menu:");
        System.out.println(Waiter.serveMenu(bestValueMenu));
        System.out.println();
    }
}
