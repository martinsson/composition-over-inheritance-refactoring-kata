package inheritance.dessert;

import inheritance.Dessert;

import java.util.List;

public class Brownie implements Dessert {

    @Override
    public String dessert() {
        return "brownie";
    }

    @Override
    public List<String> allergens() {
        return List.of("nuts");
    }
}