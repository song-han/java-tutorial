package me.hansong.messageprinter.spring;

import me.hansong.messageprinter.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessagePrinterWithSpring {

    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext
                (MessagePrinterConfiguration.class);
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }

}
