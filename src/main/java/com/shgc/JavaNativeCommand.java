package com.shgc;

import java.io.*;
import java.util.Scanner;

/**
 * Created by make on 2/28/16.
 */
public class JavaNativeCommand {

    public static void main(String[] args) throws IOException {

        Process process = Runtime.getRuntime().exec("java -version");


        OutputStream outputStream = process.getOutputStream();
        PrintWriter writer = new PrintWriter(outputStream);
        Scanner scanner = new Scanner(System.in);
        String str = null;
        while ((str = scanner.nextLine()) != null){
            writer.println(str);
            writer.flush();
        }


    }
}
