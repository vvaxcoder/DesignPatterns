package prototype;

/**
 * Created by xcoder on 2/12/2018.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();
        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape " + clonedShape3.getType());
        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape " + clonedShape2.getType());
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape " + clonedShape1.getType());
    }
}