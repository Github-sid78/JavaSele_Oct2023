package org.example;

public class IncrementofLetters {
    public static void main(String[] args) {
        String s = "abcd";
        char[] ch = s.toCharArray();  //[a,b,c,d]
        String output = "";

        for (int i=0;i<=ch.length-1; i++){
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122){
                ch[i] = ch[i+1];
                //output = output + s.charAt(i+1);
                // s[i]= s.charAt(i+1);
                //ch =ch[i] + s.charAt(i+1);
            }

        }
        System.out.println(ch);
    }
}
