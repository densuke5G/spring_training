package jp.co.sss.training.lesson08_02;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloInterceptor {
	
//	@Before("execution(* jp.co.sss.training.lesson06_02.*.*(..))")
//	public void before(Joinpoint jp) {
//		System.out.println("リクエストを処理します");
//	}
}
