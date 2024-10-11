//Name: Prabhav
//You will definitely laugh

import java.util.Scanner;

public class MadLibs
{
    public static void main(String[] args)
    {
        //the scanner is here
        Scanner words = new Scanner(System.in);
        
        //all of the variables
        System.out.println("Please enter the name of an animal");
        String animal = words.nextLine();
        System.out.println("Now enter an adverb");
        String adverb = words.nextLine();
        System.out.println("Now enter a verb");
        String verb1 = words.nextLine();
        System.out.println("Now enter the name of any place in the world");
        String place = words.nextLine();
        System.out.println("Now enter a verb that is not "+verb1);
        String verb2 = words.nextLine();
        System.out.println("Now enter any noun");
        String noun1 = words.nextLine();
        System.out.println("Now enter a city");
        String cityName = words.nextLine();
        System.out.println("Now enter the state that "+cityName+" is in");
        String stateName = words.nextLine();
        System.out.println("Now enter a verb that is not "+verb1+"or "+verb2);
        String verb3 = words.nextLine();
        System.out.println("Now enter any noun that is not "+noun1);
        String noun2 = words.nextLine();
        
        //the mad lib
        System.out.println("The life of an "+animal+".");
        System.out.println("This is the life of a "+animal+". This animal is special because it "+adverb+verb1+" and it always goes to "+place+". The "+animal+"interacts with people by "+verb2+"and giving them "+noun1+". It lives in "+cityName+stateName+"and makes a living by "+verb3+noun2+".");
    }
}