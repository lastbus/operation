package cailianshe;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by make on 2/27/16.
 */
public class Parser {

    private static String rootPath = "http://cailianpress.com";
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHH:mm");

    public static void main(String arg[]) throws IOException, ParseException {
        Document document = Jsoup.connect("http://cailianpress.com/").get();

        Elements dates = document.select("span.date, ul.fix");
        String date = dates.get(0).select(".date").text();
        for (Element element : dates){
            if(element.select(".date").size() > 0) {
                date = element.select(".date").text();
                continue;
            }
            String time = element.select(".time").text().trim();
            String content = element.select("li.content").text().trim();
            String url = element.select("li:eq(2) a.space").attr("href").trim();

            println(date + " " + time + "\t" + sdf.parse(date + time).getTime() + "\n" + content + "\n" + rootPath + url);
        }

    }

    public static void println(String s){
        System.out.println(s);
    }
}
