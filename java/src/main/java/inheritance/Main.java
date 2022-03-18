package inheritance;

public class Main {

    public static void main(String[] args) {
        BestValueMenu bestValueMenu = new BestValueMenu();
        printMenu(bestValueMenu);
        BestValueMenu meatLoversMenu = new MeatLoversMenu();
        printMenu(meatLoversMenu);
        BestValueMenu gourmetMenu = new GourmetsMenu();
        printMenu(gourmetMenu);
    }

    private static void printMenu(BestValueMenu bestValueMenu) {
        System.out.println("serving menu: " + bestValueMenu.getClass().getSimpleName());
        System.out.println(bestValueMenu.starter());
        System.out.println(bestValueMenu.mainCourse());
        System.out.println(bestValueMenu.dessert());
        System.out.println();
    }
}
