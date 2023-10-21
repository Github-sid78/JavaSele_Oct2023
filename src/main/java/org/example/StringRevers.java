package org.example;

public class StringRevers {

    public static void main(String args[])
    {
        String s = "naman";
        int len = s.length();
        String store = "";

        for (int i = len-1; i >=0 ;i--)

            store = store + s.charAt(i);
        {
            if (s.equals(store))
                System.out.println("its a pallindrome");
            else
                System.out.println("its not a pallindrome");
        }
    }



}
