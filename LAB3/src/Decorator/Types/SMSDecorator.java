package Decorator;


public class SMSDecorator extends BaseDecorator {

    public SMSDecorator(Notification wrappee) {
        super(wrappee);
    }

    @Override
    public void sendMessage(String msg) {
        super.sendMessage(msg);
        sendSMS(msg);
    }

    private void sendSMS(String msg) {
        System.out.println(msg + ", message sent in SMS");
    }
}