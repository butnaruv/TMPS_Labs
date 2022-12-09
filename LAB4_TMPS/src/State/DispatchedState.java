package State;

public class DispatchedState implements OrderState{

    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order Dispatched!");
    }
}
