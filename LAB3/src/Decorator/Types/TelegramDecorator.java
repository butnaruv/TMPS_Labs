package Decorator.Types;

import Decorator.BaseDecorator;
import Decorator.Notification;

//A TelegramDecorator defines extra behaviors that can be added dynamically to components.
// The TelegramDecorator overrides the methods of the base decorator and executes their behavior either before or after the parent method is called
public class TelegramDecorator extends BaseDecorator {

    public TelegramDecorator(Notification wrappee) {
        super(wrappee);
    }

    @Override
    public void sendMessage(String msg) {
        super.sendMessage(msg);
        sendTelegram(msg);
    }

    private void sendTelegram(String msg) {
        System.out.println(msg + ", message sent in Telegram");
    }
}
