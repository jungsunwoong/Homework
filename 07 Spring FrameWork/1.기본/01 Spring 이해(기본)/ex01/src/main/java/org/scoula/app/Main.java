package org.scoula.app;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {
    public static void main(String[] args) {

     var context = new AnnotationConfigApplicationContext(Main.class);

     Parrot p = (Parrot) context.getBean(Parrot.class);
     System.out.println(p.getName());

     String s = context.getBean(String.class).toString();

     System.out.println(s);

     Integer n = context.getBean(Integer.class);
        System.out.println(n);

    }
}
