package Facade;

//Class that defines the steps a kitchen should do in order to make a meal
public class Kitchen {
    public void PrepareOrder() {
        System.out.println("Order is ready!");
    }

    public void CallWaiter() {
        System.out.println("Food is ready!");
    }
}
