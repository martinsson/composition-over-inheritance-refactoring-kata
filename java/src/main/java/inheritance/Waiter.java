package inheritance;

public class Waiter {
    public static String serveMenu(BestValueMenu bestValueMenu) {
        return bestValueMenu.starter() + "\n" +
                bestValueMenu.mainCourse() + "\n" +
                bestValueMenu.dessert();
    }

}
