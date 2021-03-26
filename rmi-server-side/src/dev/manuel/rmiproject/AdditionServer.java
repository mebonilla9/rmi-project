package dev.manuel.rmiproject;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AdditionServer {

  public static void main(String[] args) throws RemoteException {
    Registry registry = LocateRegistry.createRegistry(5099);
    registry.rebind("add", new Addition());
    System.out.println("Remote addition server online!");
  }

}
