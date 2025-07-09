package inheritance.mainCourse;

import inheritance.MainCourse;

import java.util.List;

public class FiletMignon implements MainCourse {
    @Override
    public String mainCourse() {
        return "filet mignon";
    }

    @Override
    public List<String> allergens() {
        return List.of();
    }
}
