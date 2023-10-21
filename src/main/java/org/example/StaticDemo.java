package org.example;

public class StaticDemo {

    int number1= 10;
    static int number= 20;
     public static void main (String[] args)
     {
         System.out.println(number);
         StaticDemo st=new StaticDemo();
         System.out.println(st.number1);

     }
}
