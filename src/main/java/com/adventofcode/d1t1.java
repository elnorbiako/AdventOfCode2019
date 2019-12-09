package com.adventofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class d1t1 {

        public static int computeFuel(int mass) {
            return mass/3 - 2;
        }


        public static void main(String[] args) {

            String data = "80740\n" +
                    "103617\n" +
                    "86598\n" +
                    "135938\n" +
                    "98650\n" +
                    "84982\n" +
                    "79253\n" +
                    "122436\n" +
                    "119679\n" +
                    "89758\n" +
                    "131375\n" +
                    "112500\n" +
                    "111603\n" +
                    "112563\n" +
                    "111174\n" +
                    "114961\n" +
                    "131423\n" +
                    "144920\n" +
                    "56619\n" +
                    "94542\n" +
                    "94533\n" +
                    "116453\n" +
                    "78286\n" +
                    "70985\n" +
                    "91005\n" +
                    "116346\n" +
                    "137141\n" +
                    "90815\n" +
                    "68806\n" +
                    "61549\n" +
                    "116078\n" +
                    "53067\n" +
                    "116991\n" +
                    "58210\n" +
                    "54878\n" +
                    "98184\n" +
                    "108532\n" +
                    "130796\n" +
                    "144893\n" +
                    "137845\n" +
                    "57481\n" +
                    "133204\n" +
                    "125789\n" +
                    "99573\n" +
                    "121718\n" +
                    "73905\n" +
                    "105746\n" +
                    "134401\n" +
                    "136337\n" +
                    "74788\n" +
                    "147758\n" +
                    "128636\n" +
                    "97457\n" +
                    "84983\n" +
                    "57520\n" +
                    "125839\n" +
                    "68230\n" +
                    "106761\n" +
                    "147436\n" +
                    "95604\n" +
                    "142427\n" +
                    "82718\n" +
                    "81692\n" +
                    "138713\n" +
                    "53145\n" +
                    "90348\n" +
                    "69312\n" +
                    "139908\n" +
                    "139836\n" +
                    "91889\n" +
                    "126399\n" +
                    "130204\n" +
                    "103643\n" +
                    "70653\n" +
                    "81236\n" +
                    "99555\n" +
                    "64461\n" +
                    "128172\n" +
                    "122914\n" +
                    "71321\n" +
                    "141502\n" +
                    "124121\n" +
                    "67214\n" +
                    "64612\n" +
                    "78519\n" +
                    "69582\n" +
                    "124489\n" +
                    "95904\n" +
                    "124274\n" +
                    "66556\n" +
                    "140500\n" +
                    "112775\n" +
                    "114855\n" +
                    "57332\n" +
                    "50072\n" +
                    "79830\n" +
                    "126844\n" +
                    "67276\n" +
                    "137841\n" +
                    "108654";

            List<String> fuelStrings = Arrays.asList(data.split("\\s*\\n\\s*"));

            List<Integer> fuels = new ArrayList<>();
            List<Integer> masses = new ArrayList<>();

            for (String fuelString: fuelStrings) {
                masses.add(Integer.parseInt(fuelString));
                fuels.add(computeFuel(Integer.parseInt(fuelString)));
            }

            int sum = fuels.stream().mapToInt(i->i).sum();
            int sumMass = masses.stream().mapToInt(i->i).sum();

            System.out.println(sum);
            System.out.println(sumMass);


        }

    }
