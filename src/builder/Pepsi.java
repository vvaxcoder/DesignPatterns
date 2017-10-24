package builder;

public class Pepsi extends CoolDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 1.03;
    }
}
