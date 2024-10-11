//Name: Prabhav Paripati
//Period: 1A

import java.util.*;

public class RiceBowlAPPAddOn
{
    public static void main(String[] args)
    {
        //the receipt
        double totalCostFirstBowl = 10.0;
        
        //variables for the base and veggies
        double xtraBeans$ = 0.39, xtraRice$ = 0.59, tomatoes$ = 0.29, lettuce$ = 0.29;
        String xtraBeansR = " extra servings of beans", xtraRiceR = " extra servings of rice";
        String tomatoesR = " servings of tomatoes", lettuceR = " servings of lettuce";
        int xtraBeansNFB = 5, xtraRiceNFB = 5, tomatoesNFB = 9, lettuceNFB = 9;
        
        //variables for the meat and sauce
        double beef$ = 0.49, chicken$ = 0.49, sourCream$ = 0.19, spicySauce$ = 0.19;
        String beefR = " servings of beef", chickenR = " servings of chicken";
        String sourCreamR = " servings of sour cream", spicySauceR = " servings of spicy sauce";
        int beefNFB = 10, chickenNFB = 10, sourCreamNFB = 6, spicySauceNFB = 6;
        
        //java does the difficult work for the first bowl here
        totalCostFirstBowl += (xtraBeans$ * xtraBeansNFB);
        totalCostFirstBowl += (xtraRice$ * xtraRiceNFB);
        totalCostFirstBowl += (tomatoes$ * tomatoesNFB);
        totalCostFirstBowl += (lettuce$ * lettuceNFB);
        totalCostFirstBowl += (beef$ * beefNFB);
        totalCostFirstBowl += (chicken$ * chickenNFB);
        totalCostFirstBowl += (sourCream$ * sourCreamNFB);
        totalCostFirstBowl += (spicySauce$ * spicySauceNFB);

        //creating the receipt for the first bowl
        System.out.println("The cost of the first rice bowl was " + totalCostFirstBowl + ". You added ...");
        System.out.println(xtraBeansNFB + xtraBeansR);
        System.out.println(xtraRiceNFB + xtraRiceR);
        System.out.println(tomatoesNFB + tomatoesR);
        System.out.println(lettuceNFB + lettuceR);
        System.out.println(beefNFB + beefR);
        System.out.println(chickenNFB + chickenR);
        System.out.println(sourCreamNFB + sourCreamR);
        System.out.println(spicySauceNFB + spicySauceR);
        System.out.println("");
        
        //creating the java script that asks all of the questions
        Scanner console = new Scanner(System.in);
        
        //this is all of the questions
        System.out.println("How many extra servings of beans would you like? ");
        int xtraBeansNSB = console.nextInt();
        System.out.println("How many extra servings of rice would you like? ");
        int xtraRiceNSB = console.nextInt();
        System.out.println("How many spoons of tomatoes would you like? ");
        int tomatoesNSB = console.nextInt();
        System.out.println("How many leaves of lettuce would you like? ");
        int lettuceNSB = console.nextInt();
        System.out.println("How many servings of beef would you like? ");
        int beefNSB = console.nextInt();
        System.out.println("How many servings of chicken would you like? ");
        int chickenNSB = console.nextInt();
        System.out.println("How many spoons of sour cream would you like? ");
        int sourCreamNSB = console.nextInt();
        System.out.println("How many squirts of spicy sauce would you like? ");
        int spicySauceNSB = console.nextInt();
        
        //creating the second bowl
        double totalCostSecondBowl = 10.0;
        
        //adding the toppings
        totalCostSecondBowl += (xtraBeansNSB * xtraBeans$);
        totalCostSecondBowl += (xtraRiceNSB * xtraRice$);
        totalCostSecondBowl += (tomatoesNSB * tomatoes$);
        totalCostSecondBowl += (lettuceNSB * lettuce$);
        totalCostSecondBowl += (beefNSB * beef$);
        totalCostSecondBowl += (chickenNSB * chicken$);
        totalCostSecondBowl += (sourCreamNSB * sourCream$);
        totalCostSecondBowl += (spicySauceNSB * spicySauce$);
        
        //creating the second receipt
        System.out.println("The cost of the second rice bowl was " + totalCostSecondBowl + ". You added ...");
        System.out.println(xtraBeansNSB + xtraBeansR);
        System.out.println(xtraRiceNSB + xtraRiceR);
        System.out.println(tomatoesNSB + tomatoesR);
        System.out.println(lettuceNSB + lettuceR);
        System.out.println(beefNSB + beefR);
        System.out.println(chickenNSB + chickenR);
        System.out.println(sourCreamNSB + sourCreamR);
        System.out.println(spicySauceNSB + spicySauceR);
        System.out.println("");
    }
}
