package inheritance;

import inheritance.dessert.Brownie;
import inheritance.dessert.CremeCaramel;
import inheritance.mainCourse.FiletMignon;
import inheritance.mainCourse.QuicheLorraine;

public class Main {

    public static void main(String[] args) {
        final var allergenNotifier = new AllergenNotifier();
        var brownie = new Brownie(allergenNotifier);
        var quicheLorraine = new QuicheLorraine(allergenNotifier);
        var cremeCaramel = new CremeCaramel(allergenNotifier);
        var filetMignon = new FiletMignon();

        var bestValueMenu = new BestValueMenu(brownie, quicheLorraine);
        printMenu(bestValueMenu, "best value");
        var meatLoversMenu = new BestValueMenu(brownie, filetMignon);
        printMenu(meatLoversMenu, "meat lovers");
        var gourmetMenu = new BestValueMenu(cremeCaramel, quicheLorraine);
        printMenu(gourmetMenu, "gourmet");
    }

    private static void printMenu(BestValueMenu bestValueMenu, String menuName) {
        System.out.println("serving "+ menuName + " menu:");
        System.out.println(bestValueMenu.serveMenu());
        System.out.println();
    }
}
