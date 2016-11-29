package fr.jplc.workshop.rmi;

import java.rmi.Naming;

public class HelloClient {

	public static void main(final String... args) throws Exception {

		final Hello hello = (Hello) Naming.lookup("//192.168.1.15/toto/Hello");

		System.out.println("Hello found in registry");

		System.out.println("Calling remote object Hello...");

		hello.sayHello();

		System.out.println("SUCCESS");
	}
}
