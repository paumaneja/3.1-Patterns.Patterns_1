package Classes;

import Interfaces.AbstractFactory;
import Interfaces.Address;
import Interfaces.PhoneNumber;

public class USAFactory implements AbstractFactory {

    @Override
    public Address createAddress() {
        return new USAAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new USAPhoneNumber();
    }

}
