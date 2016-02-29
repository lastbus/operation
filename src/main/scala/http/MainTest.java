package http;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by make on 2/27/16.
 */
public class MainTest {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://cailianpress.com/").get();
        String date = doc.getElementsByClass("topic").first().getElementsByClass("date").text();
        String index = doc.getElementById("entries").getElementsByClass("topic").text();
        println(String.valueOf(index));
    }


    public static void println(String s){
        System.out.println(s);
    }
}
