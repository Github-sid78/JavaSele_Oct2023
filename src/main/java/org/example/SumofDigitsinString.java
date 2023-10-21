package org.example;

public class SumofDigitsinString {
    public static void main(String[] args)
    {
        String a = "a76df5nnhh7w8";
        int sum = 0;
        for(int i=0; i<a.length(); i++)
        {
            char ch = a.charAt(i);
            if(Character.isDigit(ch))
            {
                sum = sum + Character.getNumericValue(ch);
            }

        }

        System.out.println(sum);
    }
}
