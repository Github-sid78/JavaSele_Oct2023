package org.example;

public class Parent {
    int count = 10;
    Parent(){
       this(10);
       this.m1();
        System.out.println("Parent1");
        System.out.println(this.count);
    }

    public void m1(){
        System.out.println("m1 method");

    }
    Parent(int a){
        //this();
        System.out.println("Parent2"+a);
    }

    public static void main(String[] args) {
        Parent p =new Parent();
    }
}
