package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> numberList = new ArrayList<>(List.of(45, 15, 47));

        System.out.println(highestCombination(numberList));

    }

    static final Comparator<Integer> NUMBER_ORDER;

    static{

        NUMBER_ORDER = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                int o1o2 = Integer.valueOf(o1 + "" + o2);
                int o2o1 = Integer.valueOf(o2 + "" + o1);

                if (o1o2 < o2o1) {

                    return 1;

                } else {

                    return -1;
                }
            }
        };
    }

    static String highestCombination(List<Integer> numberList) {

        Collections.sort(numberList,NUMBER_ORDER);

        String finalString = "";

        for (int number: numberList) {

            finalString = finalString + number;
        }

        return finalString;
    }



}
