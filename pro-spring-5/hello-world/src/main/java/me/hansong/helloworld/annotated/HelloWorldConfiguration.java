package me.hansong.helloworld.annotated;

import me.hansong.helloworld.HelloWorldMessageProvider;
import me.hansong.helloworld.MessageProvider;
import me.hansong.helloworld.MessageRenderer;
import me.hansong.helloworld.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    // equivalent to <bean id="provider" class=".."/>
    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }
    // equivalent to  <bean id="renderer" class=".."/>
    @Bean
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }

}
