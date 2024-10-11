//Name: Prabhav
//Period: 1A
import java.util.*;

public class TrickOrTreat
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        System.out.println("How much candy are we giving out today? ");
        int numCandy = console.nextInt();
        System.out.println("What kind of candy is it? ");
        console.nextLine();
        String candyName = console.nextLine();
        System.out.println();
        
        while (numCandy >= 100)
        {
            System.out.println("Hello! Here are 2 "+candyName+".");
            System.out.println("We have "+numCandy+" "+candyName+" left.");
            System.out.println();
            numCandy -= 2;
        }
        while (numCandy > 1)
        {
            System.out.println("Hi! Here is a "+candyName+".");
            System.out.println("We have "+numCandy+" "+candyName+" left.");
            System.out.println();
            numCandy -= 1;
        }
        System.out.println("Hi! Here is the last "+candyName+".");
        System.out.println("Sorry! You can go home now!");
    }
 }