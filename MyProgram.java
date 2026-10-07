import java.util.Scanner;

public class MyProgram
{
    public static void printRandomResponse()
    {
        // 1. Get a random number from 1 to 8
        
        int num = (int)(Math.random()* 8)+1;
       
        // 2. Use if statements to test the random number
        //    and print out 1 of 8 random responses
        if (num == 1)
        {
            System.out.println("Yes!");
        }
        if (num == 2)
        {
            System.out.println("No..");
        }
        if (num == 3)
        {
            System.out.println("Maybe");
        }
        if (num == 4)
        {
            System.out.println("Signal Unclear");
        }
        if (num == 5)
        {
            System.out.println("Yes!");
        }
        if (num == 6)
        {
            System.out.println("no.");
        }
        if (num == 7)
        {
            System.out.println("Maybe");
        }
        else
        {
            System.out.println("Signal Unclear");
        }

     }

     public static void lucky()
     {
         // 3. Use Math.random() to toss a coin to choose between 2 choices
         int ran = (int)(Math.random()* 2)+1;
         // 4. Use an if/else statement to test the random number
         //    and print out "Lucky!" or else "No Luck!"
         if (ran == 1)
         {
             System.out.println("Lucky!");
         }
         else
         {
             System.out.println("No Luck!");
         }
       
      
     }

     public static void main(String[] args)
     {
         
        //scanner stuff
        Scanner stringScanner = new Scanner(System.in); //Another scan object for Strings
        System.out.println("What question would you like to ask the Magic 8 ball?");
        String question = stringScanner.nextLine();   
         
         //method calls
         printRandomResponse();
         lucky();
     }
 }
