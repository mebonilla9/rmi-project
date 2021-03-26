package dev.manuel.rmiproject;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Addition extends UnicastRemoteObject implements IAddition {

  public Addition() throws RemoteException {
    super();
  }

  @Override
  public int add(int numOne, int numTwo) throws RemoteException {
    return numOne + numTwo;
  }

}
