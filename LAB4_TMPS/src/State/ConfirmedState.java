package State;

public class ConfirmedState implements OrderState{
    @Override
    public void next(Order order) {
        order.setState(new BakedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order Confirmed!");
    }
}
