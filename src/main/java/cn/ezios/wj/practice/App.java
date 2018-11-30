package cn.ezios.wj.practice;

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
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Parent parent = (Parent) ac.getBean("wParent");
        System.out.println( "Hello World!" );
        System.out.println("your parent is " + parent.toString());
    }
}
