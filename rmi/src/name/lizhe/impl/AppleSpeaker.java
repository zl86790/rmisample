package name.lizhe.impl;

import java.io.Serializable;
import java.rmi.RemoteException;

import name.lizhe.inter.Speaker;

public class AppleSpeaker implements Speaker,Serializable {
	
	@Override
	public String sayHello(String name) throws RemoteException {
		
		return "hello "+name;
	}

}
