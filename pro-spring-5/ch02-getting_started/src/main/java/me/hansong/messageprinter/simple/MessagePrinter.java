package me.hansong.messageprinter.simple;

import me.hansong.messageprinter.HelloWorldMessageProvider;
import me.hansong.messageprinter.MessageProvider;
import me.hansong.messageprinter.MessageRenderer;
import me.hansong.messageprinter.StandardOutMessageRenderer;

public class MessagePrinter {

    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }

}
