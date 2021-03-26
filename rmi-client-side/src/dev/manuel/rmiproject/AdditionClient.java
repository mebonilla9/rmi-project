package dev.manuel.rmiproject;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class AdditionClient {

  public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
    IAddition addition = (IAddition) Naming.lookup("rmi://localhost:5099/add");
    System.out.println("--- "+ addition.add(123, 987)+" --- ");
  }
}
