package com.soumy.aopdemo.aspect;

import com.soumy.aopdemo.dto.StudentDto;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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


      @AfterThrowing(
              value = "execution(* com.soumy.aopdemo.service.StudentService.createStudent(..))",
              throwing = "exception")
      public void logAfterThrowMethod(Throwable exception) {
          System.out.println("Exception Type: " +  exception.getClass().getName());
          System.out.println("Exception Type: " +  exception.getMessage());


      }





}
