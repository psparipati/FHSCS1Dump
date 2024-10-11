//Name: Prabhav P.
//Period: 1A

import java.util.*;

public class PrimeChecker
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //challenge 1
        for (int a = 1; a < 10; a++)
        {
            System.out.print(a);
        }
        System.out.println();
        
        //challenge 2
        for (int b = 1; b < 10; b++)
        {
            System.out.print(b+" ");
        }
        System.out.println();
        
        //challenge 3
        for (int c = 2; c < 22; c+=2)
        {
            System.out.print(c+" ");
        }
        System.out.println();
        
        //challenge 4
        for (int d = 20; d < 26; d++)
        {
            System.out.print(d+" ");
        }
        System.out.println();
        
        //challenge 5
        for (int e = 10; e < 81; e+=10)
        {
            System.out.print(e+" ");
        }
        System.out.println();
        
        //challenge 7
        for (int f = 0; f > -11; f--)
        {
            System.out.print(f+" ");
        }
        System.out.println();
        
        //challenge 8
        System.out.print("Enter a number: ");
        int num = console.nextInt();
        for (num += 0; num != 0; num--)
        {
            System.out.print("* ");
        }
        System.out.println();
        
        //challenge 9
        for (int g = 1; g < 11; g++)
        {
            int square = 0;
            square = g * g;
            System.out.print(square+" ");
        }
        System.out.println();
        
        //challenge 10
        for (int h = 1; h < 10; h++)
        {
            if ((h % 3) == 0)
            {
                System.out.print("? ");
            }
            else
            {
                System.out.print(h+" ");
            }
        }
    }
}