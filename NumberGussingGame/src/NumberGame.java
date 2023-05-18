import java.util.Random;
import java.util.Scanner;

public class NumberGame {
		public static void main(String[] args) {
		
			
	System.out.println("----------------------------------------------------------");
	System.out.println("                    pick any number                       ");
	System.out.println("----------------------------------------------------------");
	System.out.println();
	
	//Generate a random number		
	Random rand = new Random();
	int random_number = rand.nextInt(99) + 1;
	
	//Reading use input
	Scanner scn = new Scanner(System.in);
	System.out.print("Pick a number between 0 and 100 (you have 5 gusses):  ");
	int guess;
	int numberOfTries = 1; //Initial count of number of guesses
	boolean win = false;
	
	while(win == false)
	{
		guess = scn.nextInt();  // Read input of the user to see if it matches the random number.
		if (numberOfTries < 5)
		{
			
			if(guess == random_number)
			{  // if number is guessed, while loop is terminated
				System.out.println();
				System.out.println("You got it! It is indeed: "+ random_number);
				System.out.println("It only took you " + numberOfTries + "guessesnto get it right");
				scn.close();
				win = true;
			}
			else if (guess < random_number)
			{  // if guess is too low , program should tell us
				System.out.println("You are too low!");
				System.out.println();
				System.out.println("Guess again : ");
			}
			else if (guess > random_number)
			{
			// if guess is to high , program should tell us
				System.out.println("You are too high!");
				System.out.println();
				System.out.println("Guess again:  ");
			}	
	   	}
		// output of closing message and information to the user depending onif they guessed right on their final guess.
		else if(numberOfTries == 5)
		{
			if(guess == random_number)
			{ // If the number is guessed, while loop is terminated.
				System.out.println();
				System.out.println("You got it! It is indeed: "+ random_number);
				System.out.println("It only took you " + numberOfTries + "gusses to get it right!");
				scn.close();
				win = true;
			}
			if (guess != random_number)
			{ // Then user didn't guess the correct number 
				System.out.println();
				System.out.println("Sorry you ran out of attempts. The correct number is: " + random_number + " Better luck next time!");
				scn.close();
				break;
				
			}
		}
		 
		numberOfTries = numberOfTries + 1; //Increament the count of number of guesses by 1
      }

    }
}