package spring.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspectJ {

	@Before(value = "execution(* spring.aop.aspectj.Hello.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Before method: " + joinPoint.getSignature().getName());
	}

	@After(value = "execution(* spring.aop.aspectj.Hello.*(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("After method: " + joinPoint.getSignature().getName());
	}

	@AfterReturning(pointcut = "execution(* spring.aop.aspectj.Hello.method2(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		System.out.println("After return method : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
	}

	@AfterThrowing(pointcut = "execution(* spring.aop.aspectj.Hello.*(..))", throwing = "error")
	public void logThrow(JoinPoint joinPoint, Throwable error) {
		System.out.println("execution in method: " + joinPoint.getSignature().getName());
		System.out.println("Exevution is : " + error);
	}
}
