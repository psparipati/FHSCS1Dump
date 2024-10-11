//Name: Prabhav P.
//Period: 1A

import java.util.Scanner;

public class WordScramble
{
  public static boolean isLetterA(final char letter)
  {
      return (letter == 'a');
  }

	public static boolean hasTwoA(final String str)
  {
      int numA = 0;
      boolean has = false;
      for (int i = 0; i != str.length(); i++)
      {
        if (str.charAt(i) == 'a')
        {
          numA++;
        }
        if (numA == 2)
        {
          has = true;
          break;
        }
      }
      return has;
    }
    
  public static boolean isVowel(char letter)
  {
      boolean isVowel = false;
      char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
      for (int i = 0; i != 10 && isVowel == false; i++)
      {
        if (letter == vowels[i])
        {
          isVowel = true;
        }
      }
      return isVowel;
    }
    
  public static int numVowels(String str)
  {
      int numVowels = 0;
      for (int i = 0; i != str.length(); i++)
      {
        if (isVowel(str.charAt(i)) == true)
        {
          numVowels++;
        }
      }
      return numVowels;
    }

  public static boolean equalChars(String str, char alpha, char beta)
  {
      int numAlpha = 0, numBeta = 0;
      for (int i = 0; i != str.length(); i++)
      {
        if (str.charAt(i) == alpha)
        {
          numAlpha++;
        }
        else if (str.charAt(i) == beta)
        {
          numBeta++;
        }
      }
      return (numAlpha == numBeta);
    }

  public static boolean twoInARow(String str, char alpha)
  {
      boolean hello = false;
      for (int i = 0; i != str.length(); i++)
      {
        if (str.charAt(i) == alpha && str.charAt(i + 1) == alpha)
        {
          hello = true;
        }
      }
      return hello;
  }
  
  public static void main(final String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println(isLetterA('a'));
    System.out.println(hasTwoA("Hello, why is this a thing? I had to do it!"));
    System.out.println(isVowel('i'));
    System.out.println(numVowels("Hello! My name is Prabhav!"));
    System.out.println(equalChars("Hello! My name is Prabhav!", 'l', 'a'));
    System.out.println(twoInARow("Hello! My name is Prabhav!", 'l'));
  }
}