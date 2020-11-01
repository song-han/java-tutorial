package me.hansong.ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        MessageRenderer messageRenderer = ctx.getBean("renderer",
                MessageRenderer.class);
        messageRenderer.render();

        MessageProvider messageProvider = ctx.getBean("configurableProvider",
                MessageProvider.class);
        System.out.println(messageProvider.getMessage());
        ctx.close();
    }

}
