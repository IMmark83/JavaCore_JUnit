package ru.netology;

import java.util.List;

public class DataService {
    public static int findMaxOddNumber(List<Integer> numbers) throws Exception {

        if (numbers == null || numbers.size() == 0) {
            throw new Exception("List of number is empty");
        }
        if (numbers.size() % 2 != 0) {
            throw new Exception("List of numbers cannot contain even numbers");
        }

        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (max < current) {
                max = current;
            }
        }
        return max;
    }
}
