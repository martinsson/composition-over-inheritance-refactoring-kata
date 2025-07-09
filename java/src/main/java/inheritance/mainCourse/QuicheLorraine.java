package inheritance.mainCourse;

import inheritance.MainCourse;

import java.util.List;

public class QuicheLorraine implements MainCourse {

    @Override
    public String mainCourse() {
        return "quiche lorraine";
    }

    @Override
    public List<String> allergens() {
        return List.of("milk");
    }
}