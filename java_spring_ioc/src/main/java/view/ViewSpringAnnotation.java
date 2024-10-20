package view;

import business.IBusiness;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ViewSpringAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext("business","dao","ext");
        IBusiness business=context.getBean(IBusiness.class);
        System.out.println("Result=>"+business.compute());
    }
}