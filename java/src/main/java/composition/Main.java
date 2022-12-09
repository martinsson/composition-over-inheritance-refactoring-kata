package composition;

public class Main {

    public static void main(String[] args) {
        Brownie brownie = new Brownie();
        QuicheLorraine quicheLorraine = new QuicheLorraine();
        CremeCaramel cremeCaramel = new CremeCaramel();
        FiletMignon filetMignon = new FiletMignon();

        Menu menu = new Menu(brownie, quicheLorraine);
        printMenu(menu);
        Menu meatLoversMenu = new Menu(brownie, filetMignon);
        printMenu(meatLoversMenu);
        Menu gourmetMenu = new Menu(cremeCaramel, quicheLorraine);
        printMenu(gourmetMenu);

        // new feature!!!
        Menu noGlutenMenu = new Menu(cremeCaramel, filetMignon);
        printMenu(noGlutenMenu);
    }

    private static void printMenu(Menu menu) {
        System.out.println("serving menu: " + menu.getClass().getSimpleName());
        System.out.println(Waiter.serveMenu(menu));
        System.out.println();
    }
}
