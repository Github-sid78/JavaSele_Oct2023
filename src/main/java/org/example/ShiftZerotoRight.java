package org.example;

import java.util.Arrays;

public class ShiftZerotoRight {
    public static void main(String[] args) {
        int [] array1 = {2,4,0,8,0,0,8,1};
        int [] array2 = new int[array1.length];
        int count = 0;

        for(int i  = 0; i<= array1.length-1; i++){
            if(array1[i] != 0){
                array2[count]= array1[i];
                count ++;

            }
        }
        System.out.println(Arrays.toString(array2));
    }
}

