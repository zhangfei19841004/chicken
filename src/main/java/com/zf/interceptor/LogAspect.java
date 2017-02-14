package com.zf.interceptor;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogAspect {
	
	private final Logger logger =LoggerFactory.getLogger(this.getClass());

	public Object log(ProceedingJoinPoint proceedingJoinPoint){
		Object result = null;
		String methodName = proceedingJoinPoint.getSignature().getName();
		String className = proceedingJoinPoint.getTarget().getClass().getName();
		try {
			logger.info(className+": 方法"+methodName+"执行开始，参数是"+Arrays.asList(proceedingJoinPoint.getArgs()));
			result = proceedingJoinPoint.proceed();
			logger.info(className+"方法"+methodName+"执行结束，执行结果是"+result);
		} catch (Throwable e) {
			e.printStackTrace();
			logger.info(className+"方法"+methodName+"执行出现异常，异常信息是"+e.getMessage());
		}
		logger.info(className+"方法"+methodName+"执行完毕，执行结果是"+result);
		return result;
	}

}
