import command.StringCommand;
import org.apache.commons.lang3.time.DateUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 *
 * Created by make on 2/27/16.
 */
public class Main
{

    public static boolean list = false;
    public static boolean hasXPath = false;
    public static String[] filter = {"trim0"};


    public static void main(String[] args) throws IOException
    {

        Document document = Jsoup.connect("http://cailianpress.com/").get();

        Elements elements = document.select(".topic:eq(0) .date");
        Element element = null;
        if(!list)
        {
            dealWithOne(elements.first());
        }
        else
        {

        }



    }

    public static String dealWithList(Elements elements)
    {


        return null;

    }

    public static void dealWithOne(Element element)
    {

        if(!hasXPath)
        {
            commandFilter(element.text());
        }

    }

    public static void commandFilter(String s)
    {
        String tmp = null;
        StringCommand<String> strCmd = new StringCommand<String>(s);

        for(String command : filter)
        {
            println(strCmd.operate(command));
        }
    }


    public static void println(String s){
        System.out.println(s);
    }

}
