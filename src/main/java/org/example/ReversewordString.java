package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ReversewordString {
    public static void main(String[] args) {
            String a = "I Love my India";
            String[] b = a.split(" ");
            System.out.println(Arrays.toString(b)); //to display array in output

            for (int i=b.length-1; i>=0; i--){

                System.out.print(b[i]+ " ");
            }
    }
}
