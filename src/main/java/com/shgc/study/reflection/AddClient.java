package com.shgc.study.reflection;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by make on 2/21/16.
 */
public class AddClient
{
    public static void main(String args[])
    {
        String addServerURL = "rmi://" + args[0] + "/AddServer";
        try {
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);

            println("The first number is: " + args[1]);
            double d1 = Double.valueOf(args[1]);

            println("The second number is: " + args[2]);
            double d2 = Double.valueOf(args[2]);

            println("The sum is: " + addServerIntf.add(d1, d2));

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private static void println(String s)
    {
        System.out.println(s);
    }
}
