package command;

/**
 * Created by make on 2/27/16.
 */
public class StringCommand<T> implements Command<T> {
    String s = null;
    public StringCommand(T t){
        s = (String) t;
    }

    public T operate(T t) {

        if(t.equals("trim")) {
            return (T) s.trim();
        } else {
            return (T) "Error";
        }
    }

}
