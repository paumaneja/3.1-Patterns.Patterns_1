import moduls.AddressBookManager;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AddressBookManager bookManager = null;

        do {
            switch (menu){

            }
        }
    }

    public static byte menu(){
        Scanner input = new Scanner(System.in);
        byte option;
        final byte MIN = 0;
        final byte MAX = 3;

        do{
            System.out.println("\nPRINCIPAL MENU");
            System.out.println("1. Add new entry (address and phone).");
            System.out.println("2. Remove last command.");
            System.out.println("3. Show all the command.");
            System.out.println("0. Logout.\n");
            option = input.nextByte();
            if(option < MIN || option > MAX){
                System.out.println("Choose a valid option.");
            }
        }while(option < MIN || option > MAX);
        return option;

    }
}
