package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //lesson2 DZ
        // Карыбеков Темирлан

        System.out.println(ageAndTemperature(12, 10));
        System.out.println(ageAndTemperature(50, 15));
        System.out.println(ageAndTemperature(24, -21));
        System.out.println(ageAndTemperature(36, -4));
        System.out.println(ageAndTemperature(41, 30));

        System.out.println(generateRandomeAge());
        System.out.println(ageAndTemperature(generateRandomeAge(), 10));
        System.out.println(ageAndTemperature(generateRandomeAge(), 2));
        System.out.println(ageAndTemperature(generateRandomeAge(), -12));
        System.out.println(ageAndTemperature(generateRandomeAge(), -1));
    }

    public static String ageAndTemperature(int age, int temperature) {

        if (age > 20 & age < 45 & temperature > -20 & temperature < 30) {
          return ("Можно идти гулять!");
        }
       else if (age < 20 & temperature > 0 & temperature < 28) {
            return ("Можно идти гулять!");
        }
       else if (age > 45 & temperature > -10 & temperature < 25) {
            return ("Можно идти гулять!");
        } else {
            return ("Оставайтесь дома.");
        }

    }
    public static int generateRandomeAge () {
        Random age = new Random();
        int randomAge = age.nextInt(84)+1;
        return randomAge;
    }
}

