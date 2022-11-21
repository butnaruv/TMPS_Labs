package Composite;

import java.util.ArrayList;
import java.util.List;

//Box class (Composite)  is an element that has sub-elements meals and boxes.
// A box does not know the concrete class of its children.
// All sub-elements are controlled by the ComplexMeal(Component) interface.
// In response to a request, a box class delegated the work to its sub-elements
// The sub-elements then processed intermediate results and returned the final result to the client.
public class Box implements ComplexMeal {
    private String boxName;
    private List<ComplexMeal> children;

    public Box(String boxName) {
        this.boxName = boxName;
        children = new ArrayList<>();
    }

    public void add(ComplexMeal element) {
        children.add(element);
    }

    public String getBoxName() {
        return boxName;
    }

    @Override
    public int calculatePrice() {
        int price = 0;
        for (ComplexMeal ele : children) {
            price += ele.calculatePrice();
        }
        System.out.println(">>> Box " + boxName + ", price: " + price);
        return price;
    }
}
