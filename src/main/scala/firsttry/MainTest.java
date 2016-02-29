package firsttry;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by make on 2/27/16.
 */
public class MainTest {

    private static boolean one = true;
    private static boolean xpath = false;
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("").get();
        Elements elements = document.select("");
        if(one) elements(); else element();




    }

    public static void elements(){
        element();
    }

    public static void element(){
        if(!xpath);
        String txt = "";

    }
}
