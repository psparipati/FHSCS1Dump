// Write your import statements here!
// Name:
// Reviewed by:

import java.util.*;

public class ReviewClass
{
    public static void main(String[] args)
    {
        //Write the code below to create a Random object
        Random randomGen = new Random();
        //Declare but don't initialize an int variable named mood below
        int cpuMood;
        //Set mood equal to a random from 1 to 10 (inclusive)
        cpuMood = randomGen.nextInt(10) + 1;
        //Create a Scanner object named console
        Scanner console = new Scanner(System.in);
        //Prompt the user to enter how good their break was from a scale of 1 to 10
        System.out.println("On a scale of 1 to 10, how good was your Thanksgiving Break? ");
        //Declare an int variable to store user input into for the user's mood
        int userMood = console.nextInt();
        //Print out the computer's mood and the user's mood in the same print statement using concatentation
        System.out.println("Computer Mood: "+cpuMood+", Your Mood: "+userMood);
        //If the computer's mood was better than the user's mood, then add the computer's mood to the user's mood
        if (cpuMood > userMood)
        {
            userMood += cpuMood;
            System.out.println("Computer Mood: "+cpuMood+", Your Mood: "+userMood);
        }
        //Else, if the user's mood was better than the computer's mood, give the computer some of the user's mood
        else if (cpuMood < userMood)
        {
            userMood -= 2;
            cpuMood += 2;
            System.out.println("Computer Mood: "+cpuMood+", Your Mood: "+userMood);
        }
        //Create a looping variable for the following:
        //While the user's mood or the computer's mood is less than or equal to 10...
        while ((userMood != 10) && (cpuMood != 10))
        {
            //Add 1 to each mood and print out their mood, with classifiers to know what is printing
            userMood++;
            cpuMood++;
            if (userMood == 11)
            {
                userMood--;
            }
            if (cpuMood == 11)
            {
                cpuMood--;
            }
            if ((userMood == 10) && (cpuMood == 10))
            {
                break;
            }
            System.out.println("Computer Mood: "+cpuMood+", Your Mood: "+userMood);
        }
        /*
            * FOR REVIEWER ONLY *
            This is a big comment!
            Write down at least 3 pieces of feedback here if you are the reviewer
            Make sure to give a positive but also let them know what was incorrect
            If they didn't have anything wrong, think about other ways you could have done it!
            You can also comment on syntax, variable names, organization, etc.
            1.
            2.
            3.
         */
    }
}