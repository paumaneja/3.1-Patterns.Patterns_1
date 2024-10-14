import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean logout = false;

        do{
            switch(menu()){
                case 1: metode1();
                    break;
                case 2: metode2();
                    break;
                case 3: metode3();
                    break;
                case 0: System.out.println("Thank you. Bye bye.");
                    logout = true;
                    break;
            }
        }while(!logout);
    }

    public static byte menu(){
        Scanner input = new Scanner(System.in);
        byte option;
        final byte MIN = 0;
        final byte MAX = 3;

        do{
            System.out.println("\nPRINCIPAL MENU");
            System.out.println("1. Option 1.");
            System.out.println("2. Option 2.");
            System.out.println("3. Option 3.");
            System.out.println("0. Logout.\n");
            option = input.nextByte();
            if(option < MIN || option > MAX){
                System.out.println("Choose a valid option.");
            }
        }while(option < MIN || option > MAX);
        return option;
    }

}
