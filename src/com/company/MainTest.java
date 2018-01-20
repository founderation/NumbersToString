package com.company;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void highestCombination() {
        List<Integer> numberList = new ArrayList<>(List.of(50,2, 1, 9));

        assertEquals("95021", Main.highestCombination(numberList));

    }

}