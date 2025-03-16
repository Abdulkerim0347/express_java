package practice_6.photo_editor;

public class Main {
    public static void main(String[] args) {
        PhotoEditor editor = new PhotoEditor();


        editor.addAction("Some action");
        editor.addAction("Some action");
        editor.addAction("Some action");
        editor.addAction("Some action");
        editor.undo();
        editor.undo();
        editor.undo();

        editor.printActions();
    }
}
