package name.lizhe.inter;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Speaker extends Remote {
	public String sayHello(String name) throws RemoteException;    
}
