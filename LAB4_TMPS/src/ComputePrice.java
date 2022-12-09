import java.util.ArrayList;

public class ComputePrice {
    public static int computeTotalPrice(ArrayList<Integer> listOfPrice){
        int totalCost = 0;
        for (int i = 0; i < listOfPrice.size(); i++) {
            totalCost += listOfPrice.get(i);
        }
        System.out.println("Total cost: " + totalCost);
        return totalCost;
    }
}
