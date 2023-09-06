/*
 * Created by: Jacob Roe
 * Created On: 10/10/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 10/10/2022	Jacob Roe		Initial Implementation
 * 
 * Description: A program to prompt the user to guess a phrase and wins if the phrase is correct or loses upon hitting 10 wrong guesses
 */
package Game;

import java.util.*;

public class guess {

	public static void main(String[] args) {
		
		//Make Strings for the hidden phrase and actual phrase
		String Phrase = "Bite the Bullet";
		String Hidden = "*i** *** ******";
		//Create scanner object
		Scanner keyboard = new Scanner(System.in);
					
		//Create StringBuilder object to edit the Hidden String
		StringBuilder string = new StringBuilder(Hidden);
		
		//Create wrong guess count variable
		int wrong = 0;
		
		//Create boolean variable for win
		boolean win = false;
		
		//Display Hidden String
		System.out.println(Hidden);
		
		//While loop to repeat the cycle until the user wins or guesses 10 incorrect times
		while (win == false && wrong < 10) {			 
			
			//Prompt user for a guess in the form of a letter
			System.out.print("Please enter a letter: ");
			
			//Get next input
			char input = keyboard.next().charAt(0);
						
			//if else loop to check input and change the String accordingly to reveal correct guesses or tally incorrect guesses
			if ( input =='B' || input =='b') {
				
				string.setCharAt(0, 'B'); //Change string form * to the letter B at the index position 0
				string.setCharAt(9, 'B');
				
				Hidden = string.toString(); //Set the String Hidden to match the changed StringBuilder string
				
				System.out.println(Hidden); //Print the String Hidden to confirm
				
			}
			
			else if (input == 'E' || input == 'e') {
				
				string.setCharAt(3, 'e');
				string.setCharAt(7, 'e');
				string.setCharAt(13, 'e');
				
				Hidden = string.toString();
				
				System.out.println(Hidden);
				
			}
			
			else if (input == 'H' || input == 'h') {
				
				string.setCharAt(6, 'h');
				
				Hidden = string.toString();
				
				System.out.println(Hidden);
				
			}
			
			else if (input == 'L' || input == 'l') {
				
				string.setCharAt(11, 'l');
				string.setCharAt(12, 'l');
				
				Hidden = string.toString();
				
				System.out.println(Hidden);
				
			}
			
			else if (input == 'T' || input == 't') {
				
				string.setCharAt(2, 't');
				string.setCharAt(5, 't');
				string.setCharAt(14, 't');
				
				Hidden = string.toString();
				
				System.out.println(Hidden);
				
			}
			
			else if (input == 'U' || input == 'u') {
				
				string.setCharAt(10, 'u');
				
				Hidden = string.toString();
				
				System.out.println(Hidden);
				
			}
			
			else {
				
				//Increase the wrong guess counter
				wrong = wrong + 1;
				
				//Print a message to tell the user they guessed incorrectly
				System.out.println("The guessed letter is not in the phrase");	
				
			}
			
			//If else loop to change the boolean variable win depending on if the string Hidden matches String Phrase
			if (Hidden.equals(Phrase)) {
				
				win = true;
				
			}
			
			else {
				
				win = false;
				
			}
						
		}
		
	//If else loop to print messages for winning or losing	
	if(Hidden.equals(Phrase)) {
		
		System.out.println("Your phrase: " + Hidden);
		System.out.println("The correct phrase: " + Phrase);
		System.out.println("You Win! Game Over!");
		
		}
	
	else {
		
		System.out.println("Your phrase: " + Hidden);
		System.out.println("The correct phrase: " + Phrase);
		System.out.println("You Lose! Game Over!");
		
		}
			
	}
		
}

