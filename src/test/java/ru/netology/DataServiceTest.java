package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DataServiceTest {

    @Test
    public void TestFindMax() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 1, 9, 13, 7, 11);
        DataService.findMaxOddNumber(numbers);
        int maxTest = DataService.findMaxOddNumber(numbers);
        Assertions.assertEquals(13, maxTest);
    }

    @Test
    public void TestFindMaxExeption() throws Exception {

        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            List<Integer> numbers = Arrays.asList();
            DataService.findMaxOddNumber(numbers);
        });
        Assertions.assertEquals("List of number is empty", thrown.getMessage());
    }

    @Test
    public void TestFindMaxEvenNumbersExeption() throws Exception {
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            List<Integer> numbers = Arrays.asList(1, 3, 5);
            numbers.set(0, 2);
            DataService.findMaxOddNumber(numbers);
        });
        Assertions.assertEquals("List of numbers cannot contain even numbers", thrown.getMessage());
    }
}