package Decorator;

//BaseDecorator has a field for referencing a wrapped object.
// In order to be able to contain both concrete components and decorators, the field’s type should be declared as a Notification interface.
// All operations are delegated to the wrapped object by the base decorator.
public abstract class BaseDecorator implements Notification {
    private Notification wrappee;

    public BaseDecorator(Notification wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void sendMessage(String msg) {
        wrappee.sendMessage(msg);
    }
}
