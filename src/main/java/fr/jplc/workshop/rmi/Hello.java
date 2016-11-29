package fr.jplc.workshop.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {

	void sayHello() throws RemoteException;
}