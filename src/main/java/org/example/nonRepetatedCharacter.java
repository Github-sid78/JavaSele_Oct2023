package org.example;

public class nonRepetatedCharacter
{
    public static void main(String[] args)
    {
        String a = "electrical";

        for (int i=0 ; i<a.length(); i++)
        {
            char ch = a.charAt(i);
            if(a.indexOf(ch) == a.lastIndexOf(ch))
            {
                System.out.print(ch);
                break;
            }
        }

    }

}
