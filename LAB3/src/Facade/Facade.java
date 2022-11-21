package Facade;

//Facade class - the facade of all processes that are performed in order to get a meal as a customer.
public class Facade {
    private DigitalWaiter waiter = new DigitalWaiter();
    private Kitchen kitchen = new Kitchen();

    public void OrderFood() {
        waiter.TakeOrder();
        waiter.SendOrderToKitchen();
        kitchen.PrepareOrder();
        kitchen.CallWaiter();
        waiter.BringFood();
    }
}
