//Name: Prabhav P.
//Period: 1A

import java.util.*;
public class CalculatorAPP
{
    public static void main(String[] args)
    {
        //all scanners come from here
        Scanner console = new Scanner(System.in);
        
        //call machine and answer
        System.out.println("for the addition operator please press 1");
        System.out.println("for the subtraction operator please press 2");
        System.out.println("for the multiplication operator please press 3");
        System.out.println("for the division operator please press 4");
        System.out.println("for the modulus operator please press 5");
        int operation = console.nextInt();
        
        //enter the numbers
        System.out.println("Enter the first number you want to operate");
        int number1 = console.nextInt();
        System.out.println("Enter the second number you want to operate");
        int number2 = console.nextInt();
        
        //if statements
        if (operation == 1)
        {
            System.out.println(number1+" + "+number2+" = "+(number1 + number2));
        }
        else if (operation == 2)
        {
            System.out.println(number1+" - "+number2+" = "+(number1 - number2));
        }
        else if (operation == 3)
        {
            System.out.println(number1+" * "+number2+" = "+(number1 * number2));
        }
        else if (operation == 4)
        {
            System.out.println(number1+" / "+number2+" = "+(number1 / number2));
        }
        else if (operation == 5)
        {
            System.out.println(number1+" % "+number2+" = "+(number1 % number2));
        }
    }
}