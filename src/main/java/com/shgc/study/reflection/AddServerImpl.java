package com.shgc.study.reflection;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by make on 2/21/16.
 */
public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf
{

    protected AddServerImpl() throws RemoteException {}

    @Override
    public double add(double d1, double d2) throws RemoteException {
        return d1 + d2;
    }
}
