package abstractFactory;

/**
 * Created by xcoder on 4/13/2017.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("Blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("Cyan")) {
            return new Cyan();
        } else if (color.equalsIgnoreCase("Red")) {
            return new Red();
        }
        return null;
    }
}
