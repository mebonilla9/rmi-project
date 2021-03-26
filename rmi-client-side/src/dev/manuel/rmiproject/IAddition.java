package dev.manuel.rmiproject;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAddition extends Remote {

  int add (int numOne, int numTwo) throws RemoteException;

}
