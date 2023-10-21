package org.example;

public class ConstructorDemo {

    ConstructorDemo()
    {

        System.out.println("I am constructor");
    }

    ConstructorDemo(int a)
    {
          a = 10;
        System.out.println(a);
    }

    public class ChildConstructor extends ConstructorDemo{


        ChildConstructor(){
            System.out.println("Child Constructor");
        }

        ChildConstructor(int b){

            b =40;
            System.out.println(b);
        }

    }

    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo();
        ConstructorDemo cd1 = new ConstructorDemo(20);
    }
}
