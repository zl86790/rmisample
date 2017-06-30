package name.lizhe.exe;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

import name.lizhe.impl.AppleSpeaker;
import name.lizhe.inter.Speaker;

public class Executor {
	public static void main(String args[]) throws RemoteException, MalformedURLException, AlreadyBoundException{
		Speaker speaker = new AppleSpeaker(); 
		LocateRegistry.createRegistry(8888);  
		Naming.bind("rmi://127.0.0.1:8888/speaker", speaker);  
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}
}
