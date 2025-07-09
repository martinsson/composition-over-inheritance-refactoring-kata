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
    private String newLine = System.lineSeparator();

    @BeforeEach
    void setUp() {
        out = new ByteArrayOutputStream();
        printStream = new PrintStream(out);
    }

    @Test
    void bestValueMenu() throws Exception {
        var bestValueMenu = new BestValueMenu(printStream);
        String result = bestValueMenu.serveMenu();
        Assertions.assertEquals("sallad" + newLine +
                "quiche lorraine" + newLine +
                "brownie", result);
        Assertions.assertEquals("[Allergen]: quiche lorraine contains milk" + newLine +
                "[Allergen]: brownie contains nuts" + newLine, out.toString());

    }

    @Test
    void GourmetsMenu() throws Exception {
        var gourmetsMenu = new GourmetsMenu(printStream);
        String result = gourmetsMenu.serveMenu();
        Assertions.assertEquals("sallad" + newLine +
                "quiche lorraine" + newLine +
                "crème caramel", result);
        Assertions.assertEquals("[Allergen]: quiche lorraine contains milk" + newLine +
                "[Allergen]: crème caramel contains milk" + newLine, out.toString());

    }

    @Test
    void meatLoversMenu() throws Exception {
        var meatLoversMenu = new MeatLoversMenu(printStream);
        String result = meatLoversMenu.serveMenu();
        Assertions.assertEquals("sallad" + newLine +
                "filet mignon" + newLine +
                "brownie", result);
        Assertions.assertEquals("[Allergen]: brownie contains nuts" + newLine, out.toString());


    }

}
