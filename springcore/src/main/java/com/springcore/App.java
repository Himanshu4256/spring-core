package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("configmain.xml");
        
        // yaha Student class ka object bean n banakar diya hai hame.
        // and yaha setter injection use kiya.
        
        Student studentdata = (Student) context.getBean("student1");
        System.out.println(studentdata); 
         
        Student student2 = (Student)context.getBean("student2");
        System.out.println(student2);
        
        Student student3 = (Student)context.getBean("student3");
        System.out.println(student3);
        
        
    }
}
