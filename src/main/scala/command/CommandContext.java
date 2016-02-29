package command;

/**
 * Created by make on 2/27/16.
 */
public class CommandContext {

    private CommandContext(){}

    public static Object filter(Command command){
        command.operate("trim");
        return null;
    }


}
