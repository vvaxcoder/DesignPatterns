package singleton;

/**
 * Singleton pattern is one of the simplest design patterns.This type of design patterns comes under creational
 * pattern provides one of the best ways to create an object.
 * This pattern involves a single class which is responsible to create an object while making sure that only single
 * object gets created. This class provides a way to access its only object which can be accessed directly without
 * need to instatiate the object of the class
 */

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingletonExample example = SingletonExample.getInstance();
        example.informMessage();
    }
}
