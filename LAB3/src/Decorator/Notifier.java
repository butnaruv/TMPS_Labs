package Decorator;

//The Notifier class implements the Notification interface.
// This class defines the basic behavior of sending email, which can be altered by decorators.
public class Notifier implements Notification{
    @Override
    public void sendMessage(String msg) {
        System.out.println(msg + ", message sent in email");
    }
}
