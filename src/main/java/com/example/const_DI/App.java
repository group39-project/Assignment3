package com.example.const_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stud=(Student)appContext.getBean("stud");
        stud.display();
    }
}
