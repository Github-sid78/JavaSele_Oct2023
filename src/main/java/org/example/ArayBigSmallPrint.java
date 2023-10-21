package org.example;

import java.util.Arrays;

public class ArayBigSmallPrint {
    public static void main(String[] args) {
        int [] arr2 = new int[] {5,4,9,3,7,2};
        Arrays.sort(arr2);

            System.out.println("Smallest number is" + arr2[0]);
        System.out.println("Largest number is" + arr2[arr2.length-1]);

    }

}
