package org.example;

public class ReversewordnString {
    public static void main(String[] args) {
        String s = "I Love My India";
        String[] b = s.split(" ");

        String output = "";

       for(int i=0; i <=b.length -1; i++) {
           String Word = b[i];
           String store = "";
           for (int j = Word.length()-1; j >= 0; j--)
           {
               store =store + Word.charAt(j);
               //System.out.print(store+ " ");
           }
             output = output + store + " ";
       }
        System.out.print(output);
    }

}
