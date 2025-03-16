package exceptions;

class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message,cause);
    }
}

public class ExceptionChaining {

    public static void methodA() throws CustomException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            throw new CustomException("Exception in method A",e);
        }
    }

    public static void methodB() {
        throw new ArithmeticException("Division by zero");
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (CustomException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}
