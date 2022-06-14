package view;

import business.IBusiness;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ViewSpringAnnotations {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext("dao","ext","business");
        IBusiness business=context.getBean(IBusiness.class);
        System.out.println("Result=>"+business.compute());
    }
}
