package Facade;

//Class that defines the steps a digital waiter should do
public class DigitalWaiter {
    public void TakeOrder() {
        System.out.println("Order was taken");
    }

    public void SendOrderToKitchen() {
        System.out.println("Order sent to kitchen");
    }

    public void BringFood() {
        System.out.println("Order was served to customer");
    }
}

