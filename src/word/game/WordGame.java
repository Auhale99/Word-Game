/*
 * Program Name: Word Game
 * Authors: Austin Hale, Alixandria Kramer, Shane Dugan
 * Date Created: 2/12/2019
 */
package word.game;

import java.util.Scanner;
import java.util.Random;
public class WordGame 
{

    public static void main(String[] args) 
    {
            // try/catch for overall exception handling
        try
        {
                // Boolean to determine if word was guessed
            boolean wordGuessed = false;

            while(wordGuessed != true)
            {
                    // Single dimensional array wordList containing three words to guess
                String[] wordList = {"Hello", "There", "World"};
                    // Strings to handle word guesses
                String userGuess = "", wordToGuess = "";
                    // Random for random number
                Random rand = new Random();

                    // Create scanner Object to pass string in it
                Scanner scanner = new Scanner(System.in);
                    // Assign variable to be random value between 1 - 3
                int number = rand.nextInt(3 - 1 + 1) + 1; // Add 1 to result to meet required range
                
                    // switch statement set in order to determine which number will be used to pull a word from wordList
                switch (number) 
                {
                            // case 1: word to guess is Hello
                    case 1:
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + wordList[0]);
                        wordToGuess = wordList[0];
                        break;
                            // case 2: word to guess is There
                    case 2:
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + wordList[1]);
                        wordToGuess = wordList[1];
                        break;
                            // case 3: word to guess is World
                    case 3:
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + wordList[2]);
                        wordToGuess = wordList[2];
                        break;
                            // display error
                    default:
                        System.err.println("ERROR: NO WORD FOUND");
                        break;
                }
                            // --Formatting--
                System.out.print("\n\nGuess the Word\n---------------\n");

                    // Read in the user guess
                userGuess = scanner.nextLine();

                    // If the user's guess was correct, then game is complete
                if(userGuess.equals(wordToGuess))
                {
                    System.out.println("\nThat was correct! Congratulations, You Won!");
                    wordGuessed = true;
                }
                else if(!userGuess.equals(wordToGuess))
                {
                    System.out.println("\nThat was incorrect. Please try again.\n\n\n\n");
                }
            }  
        }
        catch(Exception e)
        {
            System.err.println("ERROR HAS OCCURED");
        }
    }
    
    public static String hide(String word){ // Method to show hidden word
                                // The word to be hidden is retrieved
        
        int x; // for the for loop
        String hiddenWord = ""; // Hold the value of the hidden word
        
        for(x = 0; x < word.length(); x++){ // Loop loops equal as the number of characters in the word
            
            hiddenWord = hiddenWord + "-"; // adds a for every character
        } // end of for loop
        return hiddenWord; // returns the hidden word
    }
    public static String Dictionary(int a){ // Dictionary to hold words
                                //recieves random number from above
        
        String[] word = {"Advocate","Apprehend","Audacios","Audacios",
            "Auspicious","Bizarre","Bonanza","Bountiful","Capacious",
            "Commemorate","Conscientious","Crusade","Decipher","Deplore",
            "Deter"}; // List of words
        String randoWord; // initializes the random word
        
        randoWord = word[a]; // takes the random number grabs its equal from the word array and sets it
        
        return randoWord;  // returns the random word
    }
    
}
