package kata;

import inheritance.BestValueMenu;
import inheritance.GourmetsMenu;
import inheritance.MeatLoversMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuTest {

    @Test
    void bestValueMenu() throws Exception {
        BestValueMenu bestValueMenu = new BestValueMenu();
        String result = serveMenu(bestValueMenu);
        Assertions.assertEquals("sallad\n" +
                "quiche lorraine\n" +
                "brownie", result);

    }

    @Test
    void GourmetsMenu() throws Exception {
        GourmetsMenu gourmetsMenu = new GourmetsMenu();
        String result = serveMenu(gourmetsMenu);
        Assertions.assertEquals("sallad\n" +
                "quiche lorraine\n" +
                "crème caramel", result);
    }

    @Test
    void meatLoversMenu() throws Exception {
        MeatLoversMenu meatLoversMenu = new MeatLoversMenu();
        String result = serveMenu(meatLoversMenu);
        Assertions.assertEquals("sallad\n" +
                "filet mignon\n" +
                "brownie", result);

    }

    private String serveMenu(BestValueMenu bestValueMenu) {
        return bestValueMenu.starter() + "\n" +
                bestValueMenu.mainCourse() +  "\n" +
                bestValueMenu.dessert();
    }
}
