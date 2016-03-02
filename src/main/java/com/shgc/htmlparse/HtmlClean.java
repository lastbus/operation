package com.shgc.htmlparse;

import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
//import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.tidy.Tidy;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2016/3/1.
 */
public class HtmlClean {

    public static void main(String[] args) throws IOException, ParserConfigurationException, XPathExpressionException {

        // create an instance of HtmlCleaner
        HtmlCleaner cleaner = new HtmlCleaner();

// take default cleaner properties
        CleanerProperties props = cleaner.getProperties();

// customize cleaner's behaviour with property setters
//        props.setXXX(...);

// Clean HTML taken from simple string, file, URL, input stream,
// input source or reader. Result is root node of created
// tree-like structure. Single cleaner instance may be safely used
// multiple times.
        TagNode node = cleaner.clean(Jsoup.connect("http://industry.cfi.cn/").get().html());

// optionally find parts of the DOM or modify some nodes
        String myNodes = node.getAttributeByName("body");
        System.out.println(myNodes);
// and/or
//        Object[] myNodes = node.evaluateXPath(xPathExpression);
// and/or
//        aNode.removeFromTree();
// and/or
//        aNode.addAttribute(attName, attValue);
// and/or
//        aNode.removeAttribute(attName, attValue);
// and/or
//        cleaner.setInnerHtml(aNode, htmlContent);
// and/or do some other tree manipulation/traversal

// serialize a node to a file, output stream, DOM, JDom...
//        new XXXSerializer(props).writeXmlXXX(aNode, ...);
//        myJDom = new JDomSerializer(props, true).createJDom(aNode);
//        myDom = new DomSerializer(props, true).createDOM(aNode);
//        System.out.println(myNodes);
//
//        TagNode tagNode = new HtmlCleaner().clean(new URL("http://industry.cfi.cn/"));
//        org.w3c.dom.Document doc = new DomSerializer(
//                new CleanerProperties()).createDOM(tagNode);
//
//        XPath xpath = XPathFactory.newInstance().newXPath();
//        String str = (String) xpath.evaluate("//body",
//                doc, XPathConstants.STRING);
//        System.out.println(str);

        String url = "http://www.cfi.net.com";
        TagNode tagNode = new HtmlCleaner().clean(new URL("http://www.cfi.cn/"));
        org.w3c.dom.Document document = new DomSerializer(new CleanerProperties()).createDOM(tagNode);
//        Document document = (Document) new Tidy().parseDOM(new URL(url).openStream(), null);
        XPath xpath = XPathFactory.newInstance().newXPath();

        xpath.compile("0");
        Node question = (Node) xpath.compile("//head").evaluate(document, XPathConstants.NODE);
        System.out.println("Question: " + question.getTextContent());

        NodeList answerers = (NodeList) xpath.compile("//body").evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < answerers.getLength(); i++) {
            System.out.println("Answerer: " + answerers.item(i).getTextContent().trim());
        }
    }
}
