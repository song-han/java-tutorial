package me.hansong.helloworld.decoupled;

import me.hansong.helloworld.MessageProvider;
import me.hansong.helloworld.MessageRenderer;

public class HelloWorldDecoupledWithFactory {
    public static void main(String... args) {
        MessageRenderer mr =
                MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp =
                MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}