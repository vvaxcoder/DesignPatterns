package builder;

/**
 * Created by xcoder on 10/23/2017.
 */
public abstract class CoolDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
