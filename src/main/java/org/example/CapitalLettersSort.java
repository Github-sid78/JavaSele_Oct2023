package org.example;

public class CapitalLettersSort
{

    public static void main(String args[])
    {
        String s = "LakANaaaaQ";
        int len = s.length();
        String store = "";

        for (int i = 0; i <= len-1 ; i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
            {
                store = store + s.charAt(i);

            }
        }
        System.out.println(store);
        int a = 'a';
        System.out.println(a);
    }
}
