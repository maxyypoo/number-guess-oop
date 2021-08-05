//Doga Akpinaroglu

//For some reason in my ide if i do higher or lower after lower or higher respectively, the code breaks and bool is never set true again and higher and lower and never entered again. I cant tell why. For reference i used 26 as my guess.

import java.util.Scanner;



public class GuesserProgram {

    
    static public boolean shouldPlayAgain ()
    {
        Scanner input = new Scanner(System.in);
        boolean play = true;
        char goAgain;
        boolean wrongChar = true;

        System.out.print("Would you like to go again? (y/n): ");
        goAgain = input.next().charAt(0);
        
        do
        {
        if(goAgain == 'y')
        {
            play = true;
        }
        else if (goAgain == 'n')
        {
            play = false;
        }
        else
        {
            wrongChar = false;
        }
        } while (wrongChar == false);

        return play;
    }

    public static void play ()
    {

        int min = 1;
        int max = 100;
        char userGuess;
        boolean userGuessCorrect = false;
        Scanner input = new Scanner(System.in);


        RandomNumberGuesser guess = new RandomNumberGuesser(min, max);

        System.out.println ("Please make a guess between 1 and 100");
        while (userGuessCorrect == false)
        {
            System.out.print("Is the number you guessed: " + guess.getCurrentGuess() + "? (h for higher, l for lower, c for correct): ");
            userGuess = input.next().charAt(0);

            if (userGuess == 'h')

            {
                guess.higher(guess.getCurrentGuess());
            }
            else if (userGuess == 'l')
            {
                guess.lower(guess.getCurrentGuess());
            }
            else if (userGuess == 'c')
            {
                userGuessCorrect = true;
                guess.reset();
            }
            else
            {
                while (userGuess != 'h' && userGuess != 'l' && userGuess != 'c')
                {
                    System.out.print("Please use appropriate syntax,h for higher, l for lower, c for correct ");
                    userGuess = input.next().charAt(0);
                }
            }
        }
    }
    
    public static void main (String args[])
    {
        do 
        {
            play();
        }while (shouldPlayAgain());

        
    }
}


