package collections;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[] stream = {1,2,3,4,5,1,2,3,4};

        Set<Integer> mySet = new HashSet<>();

        for (int num : stream) {
            if (mySet.contains(num))
                System.out.println("Duplicate detected: " + num);
            else
                mySet.add(num);
        }

    }

}
