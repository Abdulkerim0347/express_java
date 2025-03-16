package collections;

import java.util.Stack;

public class UndoRedo {
    private Stack<String> redo;
    private Stack<String> undo;

    public UndoRedo() {
        redo = new Stack<>();
        undo = new Stack<>();
    }

    public void performAction(String action) {
        undo.push(action);
        redo.clear();
        System.out.println(action + " performed");
    }

    public void undo() {
        if (!undo.isEmpty()) {
            String action = undo.pop();
            redo.push(action);
            System.out.println(action + " undone!");
        }
        else
            System.out.println("Nothing to undo");
    }

    public void redo() {
        if (!redo.isEmpty()) {
            String action = redo.pop();
            undo.push(action);
            System.out.println(action + " redone");
        }
        else
            System.out.println("Nothing to redo");
    }

    public void displayStacks() {
        System.out.println("Undo stack: " + undo);
        System.out.println("Redo stack: " + redo);
    }

    public static void main(String[] args) {
        UndoRedo editor = new UndoRedo();

        editor.performAction("Edit photo");
        editor.performAction("some action");
        editor.performAction("another action");
        editor.performAction("one more action");

        editor.displayStacks();
        System.out.println();

        editor.undo();
        editor.undo();
        editor.redo();
        editor.redo();
        editor.displayStacks();
    }
}
