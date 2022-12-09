package composition;

public class Waiter {

    public static String serveMenu(Menu menu) {
        return menu.starter() + "\n" +
                menu.mainCourse() + "\n" +
                menu.dessert();
    }
}
