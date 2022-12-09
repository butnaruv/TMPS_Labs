package Memento;

import java.util.Stack;

public class CareTakerSalad {
    private static Stack<SelectSaladIngredients.Snapshot> snapshots = new Stack<SelectSaladIngredients.Snapshot>();

    public static void doBackup(SelectSaladIngredients saladIngredients) {
        System.out.println("You saved your choice!");
        System.out.println();
        snapshots.push(saladIngredients.save());
    }

    public static void undo(SelectSaladIngredients saladIngredients) {
        if (!snapshots.isEmpty()) {
            System.out.println("You gave un on changes!");
            System.out.println();
            saladIngredients.restore(snapshots.pop());
        }
    }
}
