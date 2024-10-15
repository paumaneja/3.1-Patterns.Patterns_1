package Classes;

import Interfaces.Address;

public class SpainAddress implements Address {

    private String street;
    private int street_num;
    private int floor;
    private int door;
    private String postal_code;
    private final String country = "SPAIN";

    public SpainAddress(){
        this.street = "Calle Inventada";
        this.street_num = 1;
        this.floor = 1;
        this.door = 1;
        this.postal_code = "12345";
    }

    @Override
    public String getFormattedAddress() {
        return street + ", " + street_num + ", " + floor + " - " + door + ". " + postal_code + "(ZIP) " + country;
    }
}
