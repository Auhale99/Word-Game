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
                //String[] wordList = {"Hello", "There", "World"};
                    // Strings to handle word guesses
                String userGuess = "", wordToGuess = "";
                String randoWord = "", hiddenWord = ""; 
                    // Random for random number
                Random rand = new Random();
                
                    // Create scanner Object to pass string in it
                Scanner scanner = new Scanner(System.in);
                    // Assign variable to be random value between 1 - 3
                int number = rand.nextInt(14 - 1 + 1) + 1; // Add 1 to result to meet required range
                
                
                    // switch statement set in order to determine which number will be used to pull a word from wordList
                            //switch statement seems unnecessary, but it's just there for future plans. --COME BACK TO--
                switch (number) 
                {
                            // case 1: word to guess is Advocate
                    case 1:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 2: word to guess is Apprehend
                    case 2:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 3: word to guess is Audacios
                    case 3:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 4: word to guess is Auspicious
                    case 4:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 5: word to guess is Bizarre
                    case 5:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 6: word to guess is Bonanza
                    case 6:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 7: word to guess is Bountiful
                    case 7:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 8: word to guess is Capacious
                    case 8:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 9: word to guess is Commemorate
                    case 9:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 10: word to guess is Conscientious
                    case 10:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 11: word to guess is Crusade
                    case 11:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 12: word to guess is Decipher
                    case 12:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 13: word to guess is Deplore
                    case 13:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // case 14: word to guess is Deter
                    case 14:
                        wordToGuess = Dictionary(number, randoWord);
                        hiddenWord = hide(wordToGuess);
                        System.out.println(wordToGuess);
                        System.out.println("Welcome to the Word Game\n--------------------------\n" + hiddenWord);
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
                        break;
                            // display error
                    default:
                        System.err.println("ERROR: NO WORD FOUND");
                        break;
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
    public static String Dictionary(int a, String randoWord){ // Dictionary to hold words
                                //receives random number from above
        
        String[] word = {"Advocate","Apprehend","Audacios","Audacios",
            "Auspicious","Bizarre","Bonanza","Bountiful","Capacious",
            "Commemorate","Conscientious","Crusade","Decipher","Deplore",
            "Deter"}; // List of words
        //String randoWord; // initializes the random word
        
        randoWord = word[a]; // takes the random number grabs its equal from the word array and sets it
        
        return randoWord;  // returns the random word
    }
    
}
