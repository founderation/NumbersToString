package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class MainTest {

    @org.junit.Test
    public void main() {
    }

    List<Integer> numberList;

    String expected;

    public MainTest (List<Integer> numberList, String expected) {

        this.numberList = new ArrayList<>(numberList);
        this.expected = expected;

    }

    @org.junit.Test
    public void highestCombination() {

        assertEquals(expected, Main.highestCombination(numberList));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {Arrays.asList(42, 420, 423),  "42423420"},
                {Arrays.asList(56, 52, 9), "95652"},
                {Arrays.asList(5, 50, 56), "56550"},
                {Arrays.asList(50, 2, 1, 9), "95021"},
                {Arrays.asList(10, 49, 5690, 8, 1342), "8569049134210"},
                {Arrays.asList(34, 1, 98, 83), "9883341"}
        });

    }

}