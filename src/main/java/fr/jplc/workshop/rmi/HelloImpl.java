package fr.jplc.workshop.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {

	private static final long serialVersionUID = -5757182639638206218L;

	protected HelloImpl() throws RemoteException {

		super();
	}

	@Override
	public void sayHello() throws RemoteException {

		System.out.println("HELLO !");
	}
}
