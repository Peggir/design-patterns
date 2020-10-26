package singleton;

public class Person {

    private final static Person instance = new Person();
    private final String name = "Frodo Baggings";

    private Person() {
    }

    public static Person getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

}
