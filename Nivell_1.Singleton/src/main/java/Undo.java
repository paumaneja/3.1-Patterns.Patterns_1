import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance = null;
    private List<String> commands;

    private Undo(){
        commands = new ArrayList<>();
    }

    public static Undo getInstance(){
        if (instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command){
        commands.add(command);
        System.out.println("Command '" + command + " ' added.");
    }

    public void removeLastCommand(){
        if (!commands.isEmpty()){
            System.out.println("Last command -> '" + commands.getLast() + "' removed.");
            String removeCommand = commands.removeLast();
        } else {
            System.out.println("There are no commands to remove.");
        }
    }

    public void showCommands(){
        if (!commands.isEmpty()){
            System.out.println("Commands history:");
            for (int i = 0; i < commands.size(); i++) {
                System.out.println((i+1) + ". -> " + commands.get(i));
            }
        } else {
            System.out.println("There are no commands to show.");
        }
    }

}
