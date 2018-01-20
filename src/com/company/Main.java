package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> numberList = new ArrayList<>(List.of(5045,990, 181, 349,2, 45,99));

        System.out.println(highestCombination(numberList));

    }

    private static final Comparator<Integer> NUMBER_ORDER = new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {

                    //The 2 compared integers are concatenated in both possible ways
                    // to find the higher concatenated number and
                    // then  swap the integers to achieve that number

                    int o1o2 = Integer.valueOf(o1 + "" + o2);
                    int o2o1 = Integer.valueOf(o2 + "" + o1);

                    if (o1o2 < o2o1) {

                        return 1;

                    } else {

                        return -1;
                    }
                }
            };


    static String highestCombination(List<Integer> numberList) {

        numberList.sort(NUMBER_ORDER); //Sorts the list according to the criteria used in the comparator

        StringBuilder sb = new StringBuilder();

        for (int number: numberList) { //Integers concatenated

            sb.append(number);
        }

        return sb.toString();
    }

    /* EXPLANATION:

    My first thought as a solution was to build an algorithm that tries all different combinations that could be created from the integers given,
    but I rejected that idea really fast because that would be complicated (as the number of integers is not fixed)
    and it could lead to thousands/millions of loops (number of loops needed = N!)

    My second thought as a solution was to write numbers as follows: 423 = 4 * 100 + 2 * 10 + 3
    and compare the corresponding values. But on the existing problem this doesn't help because not all integers have the same number of digits.
    So again the algorithm would have to be really complicated and hard to build.

    My third thought (and my submitted solution) was to implement the basic concept of sorting a list, which is to compare the neighbouring values and
    swap them, if needed. After thinking about it, I came to the conclusion that the following statement should be true in any case:

    (AB < BA) <=> (ACB<BCA). So, this is the final solution I used.

    */
}
