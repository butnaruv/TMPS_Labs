package Singleton;
import java.util.*;
public class SingeltonItem {
    private static SingeltonItem instance = null;
    private static int instanceCounter = 0;
    private ArrayList<Item> TestedProducts = null;

    private SingeltonItem(){
        instanceCounter++;
        TestedProducts = new ArrayList<Item>();
    }

    public static SingeltonItem getInstance(){
        if(instance == null){
            instance = new SingeltonItem();
        }
        return instance;
    }
    public void AddItems(Item item){
        TestedProducts.add(item);
    }
    public int Count(){
        return TestedProducts.size();
    }
}
