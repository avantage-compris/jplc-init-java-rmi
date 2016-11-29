package fr.jplc.workshop.rmi;

import java.rmi.Naming;

public class HelloServer {

	public static void main(final String... args) throws Exception {

		final HelloImpl helloServer = new HelloImpl();

		Naming.rebind(// + InetAddress.getLocalHost().getHostName()
				"/toto/Hello", helloServer);

		System.out.println("HelloServer bound in registry");

		final Hello hello = (Hello) Naming.lookup("/toto/Hello");

		System.out.println("Check OK: Hello object found: " + hello);
	}
}