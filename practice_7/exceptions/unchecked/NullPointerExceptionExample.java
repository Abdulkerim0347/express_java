package practice_7.exceptions.unchecked;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String text = null;
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("You tried to call method of null object");
        }
    }
}
