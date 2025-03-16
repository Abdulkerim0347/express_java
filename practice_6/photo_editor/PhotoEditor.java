package practice_6.photo_editor;

import java.util.Stack;

public class PhotoEditor {
    private Stack<String> actions;

    public PhotoEditor() {
        this.actions = new Stack<>();
    }


    public void undo() {
        actions.pop();
    }

    public void addAction(String action) {
        actions.push(action);
    }

    public void printActions() {
        System.out.println("All actions:");
        actions.forEach(System.out::println);
    }


}
