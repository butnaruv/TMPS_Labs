package Decorator.Types;


import Decorator.BaseDecorator;
import Decorator.Notification;

//A SMSDecorator defines extra behaviors that can be added dynamically to components.
// The SMSDecorator overrides the methods of the base decorator and executes their behavior either before or after the parent method is called.
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