package fr.jplc.workshop.rmi;

import java.rmi.Naming;

public class HelloServer {

	public static void main(final String... args) throws Exception {

		final HelloImpl helloServer = new HelloImpl();

		Naming.rebind(// "//" + InetAddress.getLocalHost().getHostName()
				// +
				"/toto/Hello", helloServer);

		System.out.println("HelloServer bound in registry");

		final Hello helloClient = (Hello) Naming.lookup("/toto/Hello");
		// InetAddress.getLocalHost().getHostName() + "/HelloServer");

		// String message = "blank";
		// message =
		helloClient.sayHello();
		// System.out.println(message+"\n");
	}
}