package firsttry;

/**
 * Created by make on 2/27/16.
 */
public class StringProessor<T> implements Processor<T> {

    ItemBuilder itemBuilder = null;

    private StringProessor(){}

    public StringProessor(ItemBuilder itemBuilder){
        this.itemBuilder = itemBuilder;
    }



    @Override
    public T execute(String s) {
        return (T)s;
    }
}
