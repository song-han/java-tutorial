package me.hansong.messageprinter.factory;

import me.hansong.messageprinter.MessageProvider;
import me.hansong.messageprinter.MessageRenderer;

public class MessagePrinterWithFactory {

    public static void main(String... args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }

}
