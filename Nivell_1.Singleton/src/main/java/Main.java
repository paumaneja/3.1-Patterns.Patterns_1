import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Undo undo = Undo.getInstance();
        boolean logout = false;

        do{
            switch(menu()){
                case 1:
                    System.out.println("Write your command:");
                    String command = input.nextLine();
                    undo.addCommand(command);
                    break;
                case 2:
                    undo.removeLastCommand();
                    break;
                case 3:
                    undo.showCommands();
                    break;
                case 0:
                    System.out.println("Thank you. Bye bye.");
                    logout = true;
                    break;
            }
        }while(!logout);
        input.close();
    }

    public static byte menu(){
        Scanner input = new Scanner(System.in);
        byte option;
        final byte MIN = 0;
        final byte MAX = 3;

        do{
            System.out.println("\nPRINCIPAL MENU");
            System.out.println("1. Add a command.");
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
