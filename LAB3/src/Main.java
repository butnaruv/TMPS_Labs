import Adapter.*;
import Composite.Box;
import Composite.Meal;
import Decorator.Notification;
import Decorator.Notifier;
import Decorator.Types.SMSDecorator;
import Decorator.Types.TelegramDecorator;
import Facade.Facade;

public class Main {
    public static void main(String[] args) {

        //Composite
        System.out.println("-------Composite------");
        //Common box --> * Box for children
        //               * Box form parents
        Box familyBox = new Box("FamilyBox");

        Box childrenBox = new Box("ChildrenBox");
        childrenBox.add(new Meal("French fries", 15));
        childrenBox.add(new Meal("Burger", 11));
        childrenBox.add(new Meal("Cola", 10));
        familyBox.add(childrenBox);

        Box parentsBox = new Box("ParentsBox");
        parentsBox.add(new Meal("Burger", 25));
        parentsBox.add(new Meal("Salad", 15));
        familyBox.add(parentsBox);

        int totalSize = familyBox.calculatePrice();
        System.out.println("---------------------------------------------");
        System.out.println("Meal:  " + familyBox.getBoxName() + ", total price: " + totalSize);
        System.out.println("---------------------------------------------");

        //Adapter
        System.out.println();
        System.out.println("-------Adapter------");

        //make the burger for parents vegetarian
        BurgerCreator burgerForParents = new lightBurger(meatType.chicken);
        BurgerCreatorAdaptor vegetarianBurger = new BurgerCreatorAdaptorImplementation(burgerForParents);
        System.out.println(vegetarianBurger.getVegetarianIngredients());
        //make the burger for children vegetarian
        BurgerCreator burgerForChildren = new lightBurger(meatType.beef);
        BurgerCreatorAdaptor vegetarianBurgerForChildren = new BurgerCreatorAdaptorImplementation(burgerForChildren);
        System.out.println(vegetarianBurgerForChildren.getVegetarianIngredients());

        //Decorator
        System.out.println();
        System.out.println("-------Decorator------");
        Notification notifyStack = new Notifier();
        notifyStack = new SMSDecorator(notifyStack);
        notifyStack = new TelegramDecorator(notifyStack);
        notifyStack.sendMessage("HEY, thank you for choosing us! Your order will be ready as soon as possible!");

        //Facade
        System.out.println();
        System.out.println("-------Facade------");
        Facade facade = new Facade();
        facade.OrderFood();


    }
}