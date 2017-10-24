package builder;

public class MealBuilder {
    public Meal prepareVegMeal() {
Meal meal = new Meal();
meal.addiIem(new VegBurger());
meal.addiIem(new Coke());
        return meal;
    }
    public Meal prepareNonVegMeal() {
Meal meal = new Meal();
meal.addiIem(new ChickenBurger());
meal.addiIem(new Pepsi());
        return meal;
    }
}
