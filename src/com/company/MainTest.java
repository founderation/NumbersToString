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
        List<Integer> numberList = new ArrayList<>(List.of(420,42, 423));

        assertEquals("42423420", Main.highestCombination(numberList));

    }

}