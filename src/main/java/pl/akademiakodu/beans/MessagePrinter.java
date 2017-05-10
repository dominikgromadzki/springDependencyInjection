package pl.akademiakodu.beans;

/**
 * Created by dominikgromadzki on 28.03.2017.
 */
public class MessagePrinter {
    private MessageProducer messageProducer;

    private String name;

    public void setMessageProducer(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print () {
        System.out.println(messageProducer.getMessage());
    }
}
