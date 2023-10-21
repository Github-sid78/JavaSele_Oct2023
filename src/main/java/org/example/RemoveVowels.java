package org.example;

public class RemoveVowels {

    public static void main(String[] args) {

        String a = "Automation";
        String b = a.toLowerCase();
        String lenvowel = "";

        for(int i=0; i<b.length(); i++)
        {
            if(b.charAt(i) != 'a' & b.charAt(i) != 'e' & b.charAt(i) != 'i' & b.charAt(i) != 'o' & b.charAt(i) != 'u')
            {
                lenvowel = lenvowel + b.charAt(i);
            }

        }
        System.out.println(lenvowel);

        String total = a.replaceAll("[aeiouAEIOU]", "");
        System.out.println(total);
    }
}
