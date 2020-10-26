package singleton;

public class App {

    public static void main(final String[] args) {
        // Eager initialization
        final Person person1 = Person.getInstance();
        final Person person2 = Person.getInstance();

        // Person 1 and 2 both have the same hash code:
        System.out.println("Hash code person1: " + person1.hashCode());
        System.out.println("Hash code person2: " + person2.hashCode());

        // Lazy initialization
        final Book book1 = Book.getInstance("Name 1");
        final Book book2 = Book.getInstance("Name 2");
        System.out.println("Name book1: " + book1.getName()); // Out: Name 1
        System.out.println("Name book2: " + book2.getName()); // Out: Name 1
    }

}
