package com.bolsadeideas.springboot.backend.apirest.aop;

import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ApiLogs {
	
	/*
	 * @Pointcut
	 * ("execution(* com.bolsaideas.sprintboot.apirest.controllers(..))")//(
	 * "@annotation(org.spring.framework.web.bind.annotation.RequestMapping)")
	 * public void allFResources() {
	 * 
	 * }
	 * 
	 * @Before("allResources()") public void apiRequestLogs(JoinPoint jp) {
	 * LogManager.getLogger(jp.getSignature().getDeclaringTypeName()).info(
	 * "------o-------->"); String log = jp.getSignature().getName() + ">>>";
	 * for(Object arg: jp.getArgs() ) { log += "\n  ARG: " + arg; }
	 * LogManager.getLogger(jp.getSignature().getDeclaringTypeName()).info(log); }
	 * 
	 * @AfterReturning(pointcut= "allResources()", returning = "result") public void
	 * apiResponseLog(JoinPoint jp, Object result) { String log = "<<<  return << "
	 * + jp.getSignature().getName() + " : " + result;
	 * LogManager.getLogger(jp.getSignature().getDeclaringTypeName()).info(log); }
	 * 
	 * @AfterThrowing(pointcut= "allResources()", throwing= "exception") public void
	 * apioResponseExceptionLog(JoinPoint jp, Exception exception) { String log =
	 * "<<<  return Exception << " + jp.getSignature().getName() + " : " +
	 * exception.getClass().getSimpleName();
	 * LogManager.getLogger(jp.getSignature().getDeclaringTypeName()).info(log); }
	 * 
	 */
	
}
