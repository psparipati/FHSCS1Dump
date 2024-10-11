//Name: Prabhav Paripati
//Period: 1A

public class RiceBowlAPP
{
    public static void main(String[] args)
    {
        //the receipt
        double totalCost = 10.0;
        String receipt = "";
        
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
        totalCost += (xtraBeans$ * xtraBeansNFB);
        totalCost += (xtraRice$ * xtraRiceNFB);
        totalCost += (tomatoes$ * tomatoesNFB);
        totalCost += (lettuce$ * lettuceNFB);
        totalCost += (beef$ * beefNFB);
        totalCost += (chicken$ * chickenNFB);
        totalCost += (sourCream$ * sourCreamNFB);
        totalCost += (spicySauce$ * spicySauceNFB);

        //creating the receipt for the first bowl
        System.out.println("The cost of the first rice bowl was " + totalCost + ". You added ...");
        System.out.println(xtraBeansNFB + xtraBeansR);
        System.out.println(xtraRiceNFB + xtraRiceR);
        System.out.println(tomatoesNFB + tomatoesR);
        System.out.println(lettuceNFB + lettuceR);
        System.out.println(beefNFB + beefR);
        System.out.println(chickenNFB + chickenR);
        System.out.println(sourCreamNFB + sourCreamR);
        System.out.println(spicySauceNFB + spicySauceR);
    }
}