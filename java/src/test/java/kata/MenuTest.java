package kata;

import inheritance.*;
import inheritance.dessert.Brownie;
import inheritance.dessert.CremeCaramel;
import inheritance.mainCourse.FiletMignon;
import inheritance.mainCourse.QuicheLorraine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MenuTest {

    private final AllergenNotifier allergenNotifier = new AllergenNotifier();
    private final Brownie brownie = new Brownie(allergenNotifier);
    private final QuicheLorraine quicheLorraine = new QuicheLorraine(allergenNotifier);
    private final CremeCaramel cremeCaramel = new CremeCaramel(allergenNotifier);

    @Test
    void bestValueMenu() throws Exception {
        var bestValueMenu = new BestValueMenu(brownie, quicheLorraine);
        String result = bestValueMenu.serveMenu();
        Assertions.assertEquals("sallad\n" +
                "quiche lorraine\n" +
                "brownie", result);

    }

    @Test
    void GourmetsMenu() throws Exception {
        var gourmetsMenu = new BestValueMenu(cremeCaramel, quicheLorraine);
        String result = gourmetsMenu.serveMenu();
        Assertions.assertEquals("sallad\n" +
                "quiche lorraine\n" +
                "crème caramel", result);
    }

    @Test
    void meatLoversMenu() throws Exception {
        var meatLoversMenu = new BestValueMenu(brownie, new FiletMignon());
        String result = meatLoversMenu.serveMenu();
        Assertions.assertEquals("sallad\n" +
                "filet mignon\n" +
                "brownie", result);

    }

}
