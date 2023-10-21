package org.example;

public class Occurance {

    public static void main(String[] args) {

        String letters = "electrical engg";

        int replacevaribale = letters.replaceAll("e","").length();

        int count = letters.length() - replacevaribale;

        System.out.println(count);



    }
}
