package inheritance;


import java.io.PrintStream;

public class MeatLoversMenu extends BestValueMenu {

    public MeatLoversMenu(PrintStream printStream) {
        super(printStream);
    }

    @Override
    protected String mainCourse() {
        return "filet mignon";
    }
}
