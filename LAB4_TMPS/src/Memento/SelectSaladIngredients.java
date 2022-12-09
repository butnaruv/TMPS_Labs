package Memento;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.*;

public class SelectSaladIngredients {
    private static String greens = "lettuce leaves";
    private static ArrayList<String> vegetables = new ArrayList<>(asList("tomatoes", "cucumber", "carrot"));
    private static String protein = "pork";
    private static String topping = "olive oil";

    public SelectSaladIngredients(String type){
        if(type.equals("greek")){
            setGreens("lettuce leaves");
            setVegetables(new ArrayList<>(asList("tomatoes", "cucumber", "olive")));
            setProtein("feta cheese");
            setTopping("olive oil");
        } else if(type.equals("caesar")){
            setGreens("lettuce leaves");
            setVegetables(new ArrayList<>(asList("tomatoes")));
            setProtein("chicken");
            setTopping("dijon mustard");
        } else if(type.equals("simple")){
            setGreens("lettuce leaves");
            setVegetables(new ArrayList<>(asList("tomatoes", "cucumber", "carrot")));
            setProtein("pork");
            setTopping("asiatic topping");
        }
    }

    public static void setGreens(String greens) {
        SelectSaladIngredients.greens = greens;
    }

    public static void setVegetables(ArrayList<String> vegetables) {
        SelectSaladIngredients.vegetables = vegetables;
    }

    public static void setProtein(String protein) {
        SelectSaladIngredients.protein = protein;
    }

    public static void setTopping(String topping) {
        SelectSaladIngredients.topping = topping;
    }

    public static void getIngredients() {
        System.out.println("--- Your salad has ----");
        System.out.println( greens +"\n"+  vegetables + "\n"+ protein + "\n" + topping );
        System.out.println();
    }

    public Snapshot save() {
        return new Snapshot(greens, vegetables, protein, topping);
    }

    public void restore(SelectSaladIngredients.Snapshot snapshot) {
        setGreens(snapshot.getGreens());
        setVegetables(snapshot.getVegetables());
        setProtein(snapshot.getProtein());
        setTopping(snapshot.getTopping());
    }

    public class Snapshot {
        private String greens;
        private ArrayList<String> vegetables = new ArrayList<>();
        private String protein;
        private String topping;

        public Snapshot(String greens, ArrayList<String> vegetables, String protein, String topping) {
            this.greens = greens;
            this.vegetables = vegetables;
            this.protein = protein;
            this.topping = topping;
        }

        public String getGreens() {
            return greens;
        }

        public ArrayList<String> getVegetables() {
            return vegetables;
        }

        public String getProtein() {
            return protein;
        }

        public String getTopping() {
            return topping;
        }
    }
}


