package name.lizhe.exe;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import name.lizhe.inter.Speaker;

public class Client {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		Speaker speaker = (Speaker) Naming.lookup("rmi://127.0.0.1:8888/speaker");  
        System.out.println(speaker.sayHello("world")); 
	}

}
