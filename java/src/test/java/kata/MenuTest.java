package kata;

import inheritance.BestValueMenu;
import inheritance.GourmetsMenu;
import inheritance.MeatLoversMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MenuTest {

    private ByteArrayOutputStream out;
    private PrintStream printStream;

    @BeforeEach
    void setUp() {
        out = new ByteArrayOutputStream();
        printStream = new PrintStream(out);
    }

    @Test
    void bestValueMenu() throws Exception {
        var bestValueMenu = new BestValueMenu(printStream);
        String result = bestValueMenu.serveMenu();
        Assertions.assertEquals("sallad\n" +
                "quiche lorraine\n" +
                "brownie", result);
        Assertions.assertEquals("[Allergen]: quiche lorraine contains milk\n" +
                "[Allergen]: brownie contains nuts\n", out.toString());

    }

    @Test
    void GourmetsMenu() throws Exception {
        var gourmetsMenu = new GourmetsMenu(printStream);
        String result = gourmetsMenu.serveMenu();
        Assertions.assertEquals("sallad\n" +
                "quiche lorraine\n" +
                "crème caramel", result);
        Assertions.assertEquals("[Allergen]: quiche lorraine contains milk\n" +
                "[Allergen]: crème caramel contains milk\n", out.toString());

    }

    @Test
    void meatLoversMenu() throws Exception {
        var meatLoversMenu = new MeatLoversMenu(printStream);
        String result = meatLoversMenu.serveMenu();
        Assertions.assertEquals("sallad\n" +
                "filet mignon\n" +
                "brownie", result);
        Assertions.assertEquals("[Allergen]: brownie contains nuts\n", out.toString());


    }

}
