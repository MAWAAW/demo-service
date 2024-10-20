package view;

import business.IBusiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ViewSpringXML {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        IBusiness business=(IBusiness) context.getBean("business");
        System.out.println("Result=>"+business.compute());
    }
}