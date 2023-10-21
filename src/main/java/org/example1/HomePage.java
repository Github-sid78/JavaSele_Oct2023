package org.example1;

public class HomePage {

    static HomePage homePage;
    private HomePage(){

    }

    public void m1() {
    }

    public static HomePage getObject(){
        if(homePage == null)
        {
            homePage = new HomePage();

        }
        return homePage;
    }

}
