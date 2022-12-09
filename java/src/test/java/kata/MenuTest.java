package kata;

import inheritance.BestValueMenu;
import inheritance.GourmetsMenu;
import inheritance.MeatLoversMenu;
import inheritance.Waiter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MenuTest {

    @Test
    void bestValueMenu() throws Exception {
        var bestValueMenu = new BestValueMenu();
        String result = Waiter.serveMenu(bestValueMenu);
        Assertions.assertEquals("sallad\n" +
                "quiche lorraine\n" +
                "brownie", result);

    }

    @Test
    void GourmetsMenu() throws Exception {
        var gourmetsMenu = new GourmetsMenu();
        String result = Waiter.serveMenu(gourmetsMenu);
        Assertions.assertEquals("sallad\n" +
                "quiche lorraine\n" +
                "crème caramel", result);
    }

    @Test
    void meatLoversMenu() throws Exception {
        var meatLoversMenu = new MeatLoversMenu();
        String result = Waiter.serveMenu(meatLoversMenu);
        Assertions.assertEquals("sallad\n" +
                "filet mignon\n" +
                "brownie", result);

    }

}
