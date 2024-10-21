package moduls;

import interfaces.AbstractFactory;
import interfaces.Address;
import interfaces.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private List<Address> addresses;
    private List<PhoneNumber> phoneNumbers;

    public Book(){
        this.addresses = new ArrayList<>();
        this.phoneNumbers = new ArrayList<>();
    }

    public void addEntry(AbstractFactory factory){
        addresses.add(factory.createAddress());
        phoneNumbers.add(factory.createPhoneNumber());
    }

    public void showEntries(){
        System.out.println("Book: ");
        for (int i = 0; i < addresses.size(); i++){
            System.out.println("Address: " + addresses.get(i).getFormattedAddress());
            System.out.println("PhoneNumber: " + phoneNumbers.get(i).getFormattedPhoneNumber());
            System.out.println();
        }
    }

}
