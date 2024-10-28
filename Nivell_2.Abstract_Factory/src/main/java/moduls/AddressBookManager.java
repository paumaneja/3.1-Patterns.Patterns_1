package moduls;

import interfaces.InternacionalFactory;
import interfaces.Address;
import interfaces.PhoneNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookManager {

    private InternacionalFactory factory;
    private List<Address> addresses = new ArrayList<>();
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();

    public AddressBookManager(InternacionalFactory factory){
        this.factory = factory;
    }

    public void addEntry() {
        Scanner input = new Scanner(System.in);

        Address address = factory.createAddress();
        System.out.println("Enter address: ");
        String inputAddress = input.nextLine();
        address.setAddress(inputAddress);
        addresses.add(address);

        PhoneNumber phoneNumber = factory.createPhoneNumber();
        System.out.println("Enter phone number: ");
        String inputPhone = input.nextLine();
        phoneNumber.setPhoneNumber(inputPhone);
        phoneNumbers.add((phoneNumber));

        if(validateAddress(inputAddress) && validatePhoneNumber(inputPhone)) {
            System.out.println("Entry added: " + address.getAddress() + ", " + phoneNumber.getPhoneNumber());
        } else {
            System.out.println("Invalid entry. Please try again.");
        }
    }

    private boolean validateAddress(String address) {
        return address.length() > 5; // Aquí podemos controlar el formato de la dirección
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d+"); // Aquí podemos controlar el formato del telf
    }

    public void showEntries(){
        for (Address a : addresses) {
            System.out.println(a.getAddress());
        }
        for (PhoneNumber p : phoneNumbers){
            System.out.println(p.getPhoneNumber());
        }
    }

}
