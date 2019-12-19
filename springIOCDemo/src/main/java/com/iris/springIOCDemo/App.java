package com.iris.springIOCDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("springs.xml");
        /* laptop lobj= context.getBean("obj1", laptop.class);
        lobj.printDetails(); */
        car car= context.getBean("obj2", car.class);
        System.out.println(car);
        
    }
}
