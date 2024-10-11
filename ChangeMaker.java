//Name: Prabhav P.
//Period: 1A

import java.util.*;
import java.lang.Math;

public class ChangeMaker
{
    //public static String sampleMethod(int a)
    //{
    //    //the above is how to construct a method
    //}
    
    //challenge/method 1
    public static int simpleSearch(int[] nums, int value)
    {
        for (int i = 0; i != nums.length; i++)
        {
            if (nums[i] == value)
            {
                return i;
            }
        }
        return -1;
    }
    
    //challenge/method 2
    public static void squareBoard(int num)
    {
        for (int i = 0; i != num; i++)
        {
            for (int j = 0; j != num; j++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    
    //challenge/method 3
    public static void checkerBoard(int num)
    {
        boolean even = false;
        for (int i = 0; i != num; i++)
        {
            if (even == true)
            {
                System.out.print(" ");
            }
            for (int j = 0; j != num; j++)
            {
                System.out.print("# ");
            }
            even = !even;
            System.out.println("");
        }
    }
    
    //challenge/method 4
    public static void printPow2(double num)
    {
        for (double i = 0; i != num; i++)
        {
            System.out.println("2^"+i+"="+Math.pow(2, i));
        }
    }
    
    //challenge/method 5
    public static void convertTemp(double temp, boolean isF)
    {
        if (isF == true)
        {
            double temp2 = (temp - 32) * (5 / 9);
            System.out.println(temp+" degrees Farenheit is "+temp2+" degrees Celsius.");
        }
        else if (isF == false)
        {
            double temp2 = (temp * 1.8) + 32;
            System.out.println(temp+" degrees Celsius is "+temp2+" degrees Farenheit.");
        }
    }
    
    //challenge/method 6
    public static boolean isArmstrong(int num)
    {
         double[] digits = new double[10];
         double armstrong = 0;
         for (double i = 0; i != 11; i++)
         {
             digits.add(num % Math.pow(10, i));
         }
         for (double i = 0; i != digits.length; i++)
         {
             armstrong += Math.pow(digits[i], 3);
         }
         if (num == armstrong)
         {
             return true;
         }
         else
         {
             return false;
         }
    }
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("First Index of 7 is "+simpleSearch(new int[] {8, 6, 7, 4, 3, 6, 5}, 7));
        squareBoard(2);
        checkerBoard(5);
        printPow2(6);
        convertTemp(100, false);
        convertTemp(100, true);
    }
}