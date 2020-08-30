package com.jsonplaceholder.utility;

import java.util.Random;

public class RandomNumber {

    public static int getNumber(int bound) {
        Random random = new Random();

        return random.nextInt(bound);
    }
}
