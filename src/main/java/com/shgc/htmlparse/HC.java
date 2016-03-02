package com.shgc.htmlparse;

import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;
import org.jsoup.parser.Tag;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by make on 2016/3/2.
 */
public class HC {
    public static void main(String[] args) throws IOException, XPatherException {
        HtmlCleaner htmlCleaner = new HtmlCleaner();
        CleanerProperties cleanerProperties = htmlCleaner.getProperties();
        TagNode tagNode = htmlCleaner.clean(new URL("http://www.cfi.net.cn/"));
        println(tagNode.toString());
        println(htmlCleaner.getInnerHtml(tagNode));
        Object[] myNodes =  tagNode.evaluateXPath("(//h2/a)[1]");

        println(String.valueOf(myNodes.length));
//        System.out.println(myNodes[0]);
//        println(myNodes[0].getClass().getName());

        for (Object  node : myNodes){
            if(node instanceof TagNode){
                TagNode t = (TagNode) node;
                println(t.getText().toString());
                println(t.getAttributeByName("href"));
            }


        }




    }

    public static void println(String s){
        System.out.println(s);
    }
}
