package me.hansong.ioc.bean_naming;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class AnnotatedBeanNaming {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        Map<String,Singer> beans =
                ctx.getBeansOfType(Singer.class);
        beans.entrySet().stream().forEach(b ->
                System.out.println("id: " + b.getKey()));
        ctx.close();
    }

}
