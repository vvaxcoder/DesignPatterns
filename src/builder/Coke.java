package builder;

public class Coke extends CoolDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 0.98;
    }
}
