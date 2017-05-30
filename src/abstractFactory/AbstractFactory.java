package abstractFactory;

/**
 * Created by xcoder on 4/13/2017.
 */
abstract class AbstractFactory {
    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
