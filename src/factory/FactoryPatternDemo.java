package factory;

/**
 * Factory pattern is one of the most used design patterns. This type of design patterns comes under creational
 * pattern provides one of the best ways to create an object.
 * In Factory pattern, we create object without the creation logic to the client and refer to newly created object
 * using a common interface
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        Shape oval = shapeFactory.getShape("Oval");
        oval.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();
    }
}
