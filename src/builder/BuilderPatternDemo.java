package builder;

/**
 * Builder pattern build the complex object using simple objects and using a step by step approach. This
 * type of design patterns comes under creational pattern provides one of the best ways to create an
 * object. A Builder class builds the final object step by step. This builder is independent of other
 * object
 */

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        vegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());


    }
}
