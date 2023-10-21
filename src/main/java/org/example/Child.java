package org.example;

public class Child extends Parent{
    int count= 20;
    Child(){
        super(10);
       // this(10); Cannot write super or this statement on second line.it must be on first line of constructor
        System.out.println("child");

        System.out.println(count);
        System.out.println(super.count);
        super.m1();

    }


    Child(int b){
        System.out.println("child"+b);
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}
