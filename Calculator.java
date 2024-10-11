//Name: Prabhav P.
//Period: 1A

import java.util.*;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //1
        System.out.println("Enter a number please.");
        int a = console.nextInt();
        if (a == 9)
        {
            System.out.println("#1");
        }
        //2
        System.out.println("Enter another number.");
        int b = console.nextInt();
        if (b == 9 || b > 20)
        {
            System.out.println("#2");
        }
        //3
        System.out.println("Enter a third number.");
        int c = console.nextInt();
        if (c == 5 || c == 6)
        {
            System.out.println("#3");
        }
        //5
        System.out.println("Enter a fourth number.");
        int d = console.nextInt();
        if (d != 4)
        {
            System.out.println("#5");
        }
        //6
        System.out.println("Enter a fifth number.");
        int e = console.nextInt();
        if (e < 10 && e > 2 && e != 7.5)
        {
            System.out.println("#6");
        }
        //7
        System.out.println("Enter a sixth number.");
        int f = console.nextInt();
        int g = 20;
        if (f > 15 || f < 25)
        {
            System.out.println("#7");
        }
    }
}