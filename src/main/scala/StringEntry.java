/**
 * Created by make on 2/26/16.
 */
public class StringEntry<String> implements Entry {

    String s = null;

    private StringEntry(){}

    public StringEntry(String s){
        this.s = s;
    }

    @Override
    public Object get() {
        return null;
    }
}
