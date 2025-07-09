package inheritance;

import inheritance.dessert.Brownie;
import inheritance.dessert.CremeCaramel;
import inheritance.mainCourse.FiletMignon;
import inheritance.mainCourse.QuicheLorraine;

public class Main {

    public static void main(String[] args) {
        final var allergenNotifier = new AllergenNotifier();
        var brownie = new Brownie();
        var quicheLorraine = new QuicheLorraine();
        var cremeCaramel = new CremeCaramel();
        var filetMignon = new FiletMignon();

        var bestValueMenu = new BestValueMenu(brownie, quicheLorraine, allergenNotifier);
        printMenu(bestValueMenu, "best value");
        var meatLoversMenu = new BestValueMenu(brownie, filetMignon, allergenNotifier);
        printMenu(meatLoversMenu, "meat lovers");
        var gourmetMenu = new BestValueMenu(cremeCaramel, quicheLorraine, allergenNotifier);
        printMenu(gourmetMenu, "gourmet");
    }

    private static void printMenu(BestValueMenu bestValueMenu, String menuName) {
        System.out.println("serving "+ menuName + " menu:");
        System.out.println(bestValueMenu.serveMenu());
        System.out.println();
    }
}
