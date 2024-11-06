package com.rajaryan;

import com.rajaryan.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import java.awt.Desktop;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
            XML Based Configuration
         */
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Product product= (Product) context.getBean("product");
//        System.out.println( product.toString());

        /**
         Java Based Configuration
         */
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        com.rajaryan.Desktop desktop=context.getBean(com.rajaryan.Desktop.class); //witout name
        com.rajaryan.Desktop desktop=context.getBean("beast",com.rajaryan.Desktop.class); //with name
        com.rajaryan.Desktop desktop2=context.getBean("beast",com.rajaryan.Desktop.class); //with name
        Alien alien=context.getBean(Alien.class);
        System.out.println(alien.getAge());
        System.out.println(desktop);

    }
}
