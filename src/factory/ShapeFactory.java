package factory;

/**
 * Created by xcoder on 4/13/2017.
 */
class ShapeFactory {
    //use getShape method to get object of type Shape
    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        else if (shapeType.equalsIgnoreCase("Oval")) {
            return new Oval();
        }
        else if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null;
    }
}
