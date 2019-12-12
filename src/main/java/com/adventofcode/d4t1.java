package com.adventofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class d4t1 {

    public static boolean isValid (int num) {

        int temp = num;
        ArrayList<Integer> digits = new ArrayList<>();
        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }

        Collections.reverse(digits);

        boolean isIncreasing = true;
        boolean isPair = false;

        for (int i = 1; i < digits.size(); i++) {
            if (digits.get(i).equals(digits.get(i - 1))) {
                isPair = true;
            }

            if (digits.get(i) < digits.get(i - 1)) {
                isIncreasing = false;
            }
        }
        return isIncreasing && isPair;

    }
    public static void main(String[] args) {
        int start = 264793;
        int finish = 803935;

        List<Integer> correctPasswords = new ArrayList<>();

        for (int i = start; i <= finish ; i++) {
            if (isValid(i)) {
                correctPasswords.add(i);
            }

        }

        System.out.println(correctPasswords.size());
    }

}
