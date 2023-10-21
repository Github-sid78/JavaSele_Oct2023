package org.example;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = new int [] {5,4,9,3,7,2};
        for(int i=arr.length-1 ; i >= 0 ; i--){
            System.out.print(arr[i]);
        }
    }

}
