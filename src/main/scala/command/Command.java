package command;

/**
 * Created by make on 2/27/16.
 */
public interface Command<T> {

    public T operate(T t);
}
