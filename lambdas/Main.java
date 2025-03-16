package lambdas;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        Map<String, Integer> wordLength = words.stream()
                        .collect(Collectors.toMap(word -> word, String::length));

        System.out.println(wordLength);


    }
}
