package com.example.springbootmailer;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MailAspect {


//    @Around("@annotation(SendMail)")
//    public void logInfo() {
//        System.out.println("WYSŁANO MAILA");
//    }

//    @Before("@annotation(SendMail)")
//    public void logInfo() {
//        System.out.println("PRZED WYSŁANIEM");
//    }


    @After("@annotation(SendMail)")
    public void logInfo() {
        System.out.println("PO WYSŁANIU");
    }


}
