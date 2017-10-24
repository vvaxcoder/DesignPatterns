package builder;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new FoodWrapper();
    }

    @Override
    public abstract double price();
}
