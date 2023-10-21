package org.example;

import java.util.Arrays;

public class Arraysort {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5,3,8,1,9,7,2,4};
        Arrays.sort(arr1);
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.print(arr1[i]);
        }
    }
}
