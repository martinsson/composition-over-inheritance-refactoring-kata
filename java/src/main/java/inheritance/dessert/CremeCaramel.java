package inheritance.dessert;

import inheritance.Dessert;

import java.util.List;

public class CremeCaramel implements Dessert {

    @Override
    public String dessert() {
        return "crème caramel";
    }

    @Override
    public List<String> allergens() {
        return List.of("milk");
    }
}