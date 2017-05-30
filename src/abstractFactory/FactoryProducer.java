package abstractFactory;

/**
 * Created by xcoder on 4/13/2017.
 */
class FactoryProducer {
    static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}
