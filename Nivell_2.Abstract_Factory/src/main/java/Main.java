import Classes.Book;
import Classes.SpainFactory;
import Classes.USAFactory;
import Interfaces.AbstractFactory;

public class Main {

    public static void main(String[] args) {

        Book book = new Book();

        AbstractFactory spainFactory = new SpainFactory();
        book.addEntry(spainFactory);

        AbstractFactory usaFactory = new USAFactory();
        book.addEntry(usaFactory);

        book.showEntries();

    }
}
