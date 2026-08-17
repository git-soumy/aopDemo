package com.soumy.aopdemo.aspect;

import com.soumy.aopdemo.dto.StudentDto;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(String com.soumy.aopdemo.service.StudentService.createStudent())")
//    public void logBeforeMethod(JoinPoint joinPoint) {
//
//        Object[] arr = joinPoint.getArgs();
//
//        System.out.println("Student is going to be saved");
//
//
//
////        boolean allowed = false;
////
////        if(!allowed){
////            throw new RuntimeException("Method execution not allowed");
////        }
//    }

//
//    @AfterReturning(
//         value = "execution(" +
//                 "* com.soumy.aopdemo.service.StudentService." +
//                 "createStudent(..))",
//         returning = "result")
//    public void logAfterReturningMethod(StudentDto result ) {
//
//        result.setName("Rohit");
//        result.setAge(30);
//
//        System.out.println("Intercepted createStudent()");
//
//
//    }


//      @AfterThrowing(
//              value = "execution(* com.soumy.aopdemo.service.StudentService.createStudent(..))",
//              throwing = "exception")
//      public void logAfterThrowMethod(Throwable exception) {
//          System.out.println("Exception Type: " +  exception.getClass().getName());
//          System.out.println("Exception Type: " +  exception.getMessage());
//      }

//    @After(
//            value = "execution(* com.soumy.aopdemo.service.StudentService.createStudent(..))")
//    public void logAfterMethod() {
//        System.out.println("Log After Method executed");
//    }

//    @Around(
//            value = "execution(* com.soumy.aopdemo.service.StudentService.createStudent(..))")
//    public Object logAroundMethod(ProceedingJoinPoint pjp)throws Throwable {
//        System.out.println("Starting :" + pjp.getSignature().getName());
//
//        try {
//            Object result = (StudentDto) pjp.proceed();
//            System.out.println("Execution successfull");
//
//            return result;
//        } catch (Exception e) {
//            System.out.println("Execution failed: " + e.getMessage());
//            throw e;
//        } finally {
//            System.out.println("Execution completed");
//        }
//
//
//    }

@Around(
        value = "execution(* com.soumy.aopdemo.service.StudentService.dummyMethod(..))")
public Object logAroundMethod(ProceedingJoinPoint pjp)throws Throwable {

    Object[] arr = pjp.getArgs();

    String originalString = arr[0].toString();

    String modifiedString = originalString.toUpperCase();

    Object[] modifiedArr = {
            modifiedString
    };

    return pjp.proceed(modifiedArr);
}







}
