package spring.aop.aspectj;

public class Hello {

	public void method1() {
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("Method1.");
	}
	
	public String method2() {
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("Method2.");
		return "hello";
	}
	
	public void method3() {
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("Method3.");
		throw new IllegalArgumentException();
	}
}
