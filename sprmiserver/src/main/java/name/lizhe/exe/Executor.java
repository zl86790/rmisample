package name.lizhe.exe;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {
	public static void main(String args[]){
		new ClassPathXmlApplicationContext("applicationContext.xml");  
	}
}
