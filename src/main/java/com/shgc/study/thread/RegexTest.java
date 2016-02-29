package com.shgc.study.thread;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by make on 2/20/16.
 */
public class RegexTest
{

    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("make");
        // matches 方法要求整合字符序列必须和模式匹配，而不是子序列和模式相匹配
        println(String.valueOf(pattern.matcher("make").matches()));
        // find 方法 子序列和模式相匹配也可以
        println(String.valueOf(pattern.matcher("make123").find()));
        println(String.valueOf(pattern.matcher("make1234").replaceAll("pengyan")));

        Pattern pattern1 = Pattern.compile(".*");
        String s = "abc\ndef";
        Matcher matcher = pattern1.matcher(s);
        if(matcher.find())println(matcher.group());


//        String s2 = "a,b,c/d e";
//        String[] array = s2.split("[,/ ]");
//        for(String a : array)println(a);
        println(String.valueOf(Pattern.matches("make", "maked")));
        println(String.valueOf("make".matches("make")));
    }

    public static void println(String s)
    {
        System.out.println(s);
    }
}
