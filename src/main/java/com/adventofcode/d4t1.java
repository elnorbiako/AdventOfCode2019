package com.adventofcode;

import java.util.*;

public class d4t1 {

    //366 too low

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

    public static boolean ifSolePair (int psswrd) {
        int temp = psswrd;
        ArrayList<Integer> digits = new ArrayList<>();
        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }

        Collections.reverse(digits);

       Map<Integer, Integer> digitsCount = new HashMap<>();

        for (int i = 0; i < digits.size(); i++) {
            if(digitsCount.containsKey(digits.get(i))) {
                digitsCount.replace(digits.get(i), digitsCount.get(digits.get(i))+1);
            } else {
                digitsCount.put(digits.get(i), 1);
            }
        }

        return digitsCount.containsValue(2);

    }

    public static void main(String[] args) {
        int start = 264793;
        int finish = 803935;

        List<Integer> correctPasswords = new ArrayList<>();
        List<Integer> correctPasswordsWithoutTriples = new ArrayList<>();

        for (int i = start; i <= finish ; i++) {
            if (isValid(i)) {
                correctPasswords.add(i);
            }

        }

        for (Integer psswrd: correctPasswords) {
            if (ifSolePair(psswrd)) {
                correctPasswordsWithoutTriples.add(psswrd);
            }
        }

        System.out.println(correctPasswords.size());
        System.out.println(correctPasswordsWithoutTriples.size());

    }

}
