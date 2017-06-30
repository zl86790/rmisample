package name.lizhe;  
  
import java.rmi.RemoteException;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

import name.lizhe.inter.Speaker;  
  
public class SpeakerClient {  
      
    public static void main(String[] args) throws RemoteException {  
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");  
        Speaker speaker =  applicationContext.getBean("speakerClient",Speaker.class);  
        System.out.println(speaker.sayHello("world"));  
    }  
  
}  