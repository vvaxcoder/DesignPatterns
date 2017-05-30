package abstractFactory;

/**
 * Created by xcoder on 4/13/2017.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        }
        else if (shape.equalsIgnoreCase("Oval")) {
            return new Oval();
        }
        else if (shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
