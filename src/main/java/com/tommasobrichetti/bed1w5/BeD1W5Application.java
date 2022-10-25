package com.tommasobrichetti.bed1w5;

import com.tommasobrichetti.bed1w5.products.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BeD1W5Application {

    public static void main(String[] args) {
        SpringApplication.run(BeD1W5Application.class, args);
        conf1();
    }

    public static List<Consumation> conf1(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Consumation p1 = ctx.getBean("Olivarola", Consumation.class);
        System.out.println(p1);

        Consumation c = new ExtraMozzarella(new ExtraPomodoro(new Pizza()));
        Consumation c1 = new Pizza();

        List<Consumation> arr = new ArrayList<>();
        arr.add(c);
        arr.add(c1);

        return arr;
    }

}
