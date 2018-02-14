package prototype;

import java.util.Hashtable;

/**
 * Created by xcoder on 2/12/2018.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> ht = new Hashtable<>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cashedShape = ht.get(shapeId);
        return (Shape) cashedShape.clone();
    }

    //    for each shape run database query and create shape
    //    ht.put(shapeKey, shape);
   //    for example, we are adding three shapes
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        ht.put(circle.getId(), circle);
        Square square = new Square();
        square.setId("2");
        ht.put(square.getId(), square);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        ht.put(rectangle.getId(), rectangle);
    }
}
