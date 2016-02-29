package com.shgc.study.reflection;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by make on 2/21/16.
 */
public interface AddServerIntf extends Remote
{
    double add(double d1, double d2) throws RemoteException;
}
