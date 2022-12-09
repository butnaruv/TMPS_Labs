package State;

public interface OrderState {
    public void next(Order order);
    public void printStatus();
}
