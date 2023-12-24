package com.enuma.questa.utils;

public class RandomTokenGen {

    public static String generateRandomToken(){
        int randNum = (int) (Math.random() * 1000000);

        return String.format("QUESTA-%s", randNum);
    }
}
