package spring.aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello=(Hello) context.getBean("hello");
		hello.method1();
		System.out.println("\n");
		hello.method2();
		System.out.println("\n");
		hello.method3();
		
		((ConfigurableApplicationContext)context).close();
	}
}
