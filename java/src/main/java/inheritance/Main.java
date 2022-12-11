package inheritance;

public class Main {

    public static void main(String[] args) {
        var bestValueMenu = new BestValueMenu(System.out);
        printMenu(bestValueMenu, "best value");
        var meatLoversMenu = new MeatLoversMenu(System.out);
        printMenu(meatLoversMenu, "meat lovers");
        var gourmetMenu = new GourmetsMenu(System.out);
        printMenu(gourmetMenu, "gourmet");
    }

    private static void printMenu(BestValueMenu bestValueMenu, String menuName) {
        System.out.println("serving "+ menuName + " menu:");
        System.out.println(bestValueMenu.serveMenu());
        System.out.println();
    }
}
