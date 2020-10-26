package singleton;

public class Book {

    private static Book instance;
    private final String name;

    private Book(final String name) {
        this.name = name;
    }

    public static synchronized Book getInstance(final String name) {
        if (instance == null) {
            instance = new Book(name);
        }

        return instance;
    }

    public String getName() {
        return name;
    }

}
