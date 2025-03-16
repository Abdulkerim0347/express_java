package exceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Division by zero: " + e.getMessage());
        } finally {
            System.out.println("Program terminated");
        }
    }
}
