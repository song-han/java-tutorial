package me.hansong.messageprinter.spring;

import me.hansong.messageprinter.HelloWorldMessageProvider;
import me.hansong.messageprinter.MessageProvider;
import me.hansong.messageprinter.MessageRenderer;
import me.hansong.messageprinter.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagePrinterConfiguration {

    // 定义接口的实现方式，代替properties配置文件
    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(MessageProvider provider){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider);
        return renderer;
    }

}
