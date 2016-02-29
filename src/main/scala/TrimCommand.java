/**
 * Created by make on 2/26/16.
 */
public class TrimCommand<T>  implements Command {

    private T t;

    public TrimCommand(T t){
        this.t = t;
    }

    public T execute() {
        if( t instanceof String ) {
            String tt = (String) t;
            String ttt = tt.trim();
            return (T) ttt;
        } else if( t instanceof Integer){
            int tt = (Integer) t;
            return t;
        }
        return null;
    }
}
