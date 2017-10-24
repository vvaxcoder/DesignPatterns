package singleton;

public class SingletonExample {
    // create an instance of SingletonExample
    public static SingletonExample instance = new SingletonExample();
// make the constructor with private modificator so that this class can't be instantiated
    private SingletonExample() {
    }
    // get only one instance of an object
    public static SingletonExample getInstance() {
        return instance;
    }
    public void informMessage(){
        System.out.println("Singleton example");
    }
}
