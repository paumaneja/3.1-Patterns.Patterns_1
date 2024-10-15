package Classes;

import Interfaces.Address;

public class USAAddress implements Address {

    private String street;
    private int street_num;
    private String postal_code;
    private final String country = "USA";

    public USAAddress(){
        this.street = "Calle Inventada";
        this.street_num = 1;
        this.postal_code = "12345";
    }

    @Override
    public String getFormattedAddress() {
        return street_num + " " + street + ". " + postal_code + "(ZIP) " + country;
    }
}
