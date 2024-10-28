import interfaces.InternacionalFactory;
import moduls.AddressBookManager;
import moduls.SpainFactory;
import moduls.USAFactory;

public class Main {

    public static void main(String[] args) {

        //Pedir el pais
        AddressBookManager addressBookManager = new AddressBookManager(new SpainFactory());
        addressBookManager.addEntry();
        addressBookManager.showEntries();

        //Pedir pais
        addressBookManager = AddressBookManager(new USAFactory());
        addressBookManager.addEntry();
        addressBookManager.showEntries();

    }
}
