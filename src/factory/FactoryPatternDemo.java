package factory;

/**
 * Created by xcoder on 4/13/2017.
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
