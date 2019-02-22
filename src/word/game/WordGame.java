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
            // try/catch for general exception handling
        try
        {
                // Boolean to determine if word was guessed
            boolean wordGuessed = false;
            int counter = 4;
            do
            {
                
                    // Strings to handle word guesses
                String userGuess = "", wordToGuess = "";
                String randoWord = "", hiddenWord = ""; 
                    // Random for random number
                Random rand = new Random();
                
                    // Create scanner Object to pass string in it
                Scanner scanner = new Scanner(System.in);
                    // Assign variable to be random value between 1 - 3
                int number = rand.nextInt(68 - 1 + 1) + 1; // Add 1 to result to meet required range
                
                
                wordToGuess = Dictionary(number, randoWord);
                    //Hides the word that is going to be guessed
                hiddenWord = hide(wordToGuess);
                    //Test line to display word during development
                do
                {
                    System.out.println(wordToGuess);
                    System.out.println("Welcome to the Word Game\n--------------------------\nWord: " + hiddenWord + "\t\tGuesses Left: " + counter);
                        //Display definition as hint
                    if(counter <= 4 && counter != 0)
                    {
                        System.out.println("Definition: " + Hint(number));
                    }
                        //Exits program for failure
                    else if(counter == 0)
                    {
                        System.out.println("Definition: " + Hint(number));
                        System.out.println("\n\nYou have failed to guess the word " + wordToGuess);
                        System.exit(0);
                    }
                
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
                        counter -= 1;
                        System.out.println("\nThat was incorrect. Please try again.\n\n\n\n");
                    }
                }
                while(wordGuessed != true);
                
            }
            while(wordGuessed != true);
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
            
            hiddenWord = hiddenWord + "―"; // adds a horizontal bar for every character
        } // end of for loop
        return hiddenWord; // returns the hidden word
    }
    public static String Dictionary(int a, String randoWord){ // Dictionary to hold words
                                //receives random number from above
        
        String[] word = //Dictionary of random words
            {"advocate",   "apprehend",    "audacios", "auspicious",    //0-3
            "bizarre",     "bonanza",      "bountiful","capacious",     //4-7 
            "commemorate", "conscientious","crusade",  "decipher",      //8-11
            "deplore",     "deter",        "doctrine", "embargo",       //12-15
            "endeavor",    "enigma",       "exotic",   "facilitate",    //16-19
            "ferret",      "foreboding",   "gaunt",    "gingerly",      //20-23
            "grapple",     "haggard",      "haven",    "hindrance",     //24-27
            "imperative",  "intervene",    "intricate","jurisdiction",  //28-31
            "languish",    "legendary",    "loll",     "lucrative",     //32-35
            "mercenary",   "mien",         "muse",     "muster",        //36-39
            "onslaught",   "ornate",       "ovation",  "overt",         //40-43
            "pang",        "phenomenon",   "pivotal",  "pungent",       //44-47
            "rankle",      "rebuke",       "renown",   "rue",           //48-51
            "Sage",        "sedative",     "serene",   "sporadic",      //52-55
            "succumb",     "swelter",      "Tedious",  "teem",          //56-59
            "trepidation", "tycoon",       "ultimate", "ungainly",      //60-63
            "vie",         "vilify",       "voracious","wage",          //64-67
            "wrangle"};
        
        randoWord = word[a]; // takes the random number grabs its equal from the word array and sets it
        
        return randoWord;  // returns the random word
    }
    
    public static String Hint(int a){
        
        String[] Definition = // Definitions of random words, position match dictionary
        {/*00*/"a person who publicly supports or recommends a particular cause or policy.",
         /*01*/"arrest (someone) for a crime.",
         /*02*/"showing a willingness to take surprisingly bold risks.",
         /*03*/"conducive to success; favorable.",
         /*04*/"very strange or unusual, especially so as to cause interest or amusement.",
         /*05*/"a situation or event that creates a sudden increase in wealth, good fortune, or profits.",
         /*06*/"large in quantity; abundant.",
         /*07*/"having a lot of space inside; roomy.",
         /*08*/"recall and show respect for (someone or something).",
         /*09*/"(of a person) wishing to do what is right, especially to do one's work or duty well and thoroughly.",
         /*10*/"a medieval military expedition, one of a series made by Europeans to recover the Holy Land from the Muslims in the 11th, 12th, and 13th centuries.",
         /*11*/"convert (a text written in code, or a coded signal) into normal language.",
         /*12*/"feel or express strong disapproval of (something).",
         /*13*/"discourage (someone) from doing something by instilling doubt or fear of the consequences.",
         /*14*/"a belief or set of beliefs held and taught by a Church, political party, or other group.",
         /*15*/"an official ban on trade or other commercial activity with a particular country.",
         /*16*/"try hard to do or achieve something.",
         /*17*/"a person or thing that is mysterious, puzzling, or difficult to understand.",
         /*18*/"originating in or characteristic of a distant foreign country.",
         /*19*/"make (an action or process) easy or easier.",
         /*20*/"a domesticated polecat kept as a pet or used, especially in Europe, for catching rabbits. It is typically albino or brown.",
         /*21*/"fearful apprehension; a feeling that something bad will happen.",
         /*22*/"(of a person) lean and haggard, especially because of suffering, hunger, or age.",
         /*23*/"in a careful or cautious manner.",
         /*24*/"engage in a close fight or struggle without weapons; wrestle.",
         /*25*/"looking exhausted and unwell, especially from fatigue, worry, or suffering.",
         /*26*/"a place of safety or refuge.",
         /*27*/"a thing that provides resistance, delay, or obstruction to something or someone.",
         /*28*/"of vital importance; crucial.",
         /*29*/"come between so as to prevent or alter a result or course of events.",
         /*30*/"very complicated or detailed.",
         /*31*/"the official power to make legal decisions and judgments.",
         /*32*/"(of a person or other living thing) lose or lack vitality; grow weak or feeble.",
         /*33*/"of, described in, or based on legends.",
         /*34*/"sit, lie, or stand in a lazy, relaxed way.",
         /*35*/"producing a great deal of profit.",
         /*36*/"a professional soldier hired to serve in a foreign army.",
         /*37*/"a person's look or manner, especially one of a particular kind indicating their character or mood.",
         /*38*/"a person or personified force who is the source of inspiration for a creative artist.",
         /*39*/"collect or assemble ",
         /*40*/"a fierce or destructive attack.",
         /*41*/"made in an intricate shape or decorated with complex patterns.",
         /*42*/"a sustained and enthusiastic show of appreciation from an audience, especially by means of applause.",
         /*43*/"done or shown openly; plainly or readily apparent, not secret or hidden.",
         /*44*/"a sudden sharp pain or painful emotion.",
         /*45*/"a fact or situation that is observed to exist or happen, especially one whose cause or explanation is in question.",
         /*46*/"of crucial importance in relation to the development or success of something else.",
         /*47*/"having a sharply strong taste or smell.",
         /*48*/"(of a comment, event, or fact) cause annoyance or resentment that persists.",
         /*49*/"express sharp disapproval or criticism of (someone) because of their behavior or actions.",
         /*50*/"the condition of being known or talked about by many people; fame.",
         /*51*/"repentance; regret.",
         /*52*/"an aromatic plant with grayish-green leaves that are used as a culinary herb, native to southern Europe and the Mediterranean.",
         /*53*/"promoting calm or inducing sleep.",
         /*54*/"calm, peaceful, and untroubled; tranquil.",
         /*55*/"occurring at irregular intervals or only in a few places; scattered or isolated.",
         /*56*/"fail to resist pressure, temptation, or some other negative force.",
         /*57*/"an uncomfortably hot atmosphere.",
         /*58*/"too long, slow, or dull; tiresome or monotonous.",
         /*59*/"be full of or swarming with.",
         /*60*/"a feeling of fear or agitation about something that may happen.",
         /*61*/"a wealthy, powerful person in business or industry.",
         /*62*/"being or happening at the end of a process; final.",
         /*63*/"(of a person or movement) awkward; clumsy.",
         /*64*/"compete eagerly with someone in order to do or achieve something.",
         /*65*/"speak or write about in an abusively disparaging manner.",
         /*66*/"wanting or devouring great quantities of food.",
         /*67*/"a fixed regular payment, typically paid on a daily or weekly basis, made by an employer to an employee, especially to a manual or unskilled worker.",
         /*68*/"a dispute or argument, typically one that is long and complicated."};
        
        
        String hint = Definition[a]; // takes same random used in Dictionary and hint will equal that words definition
        return hint; // returns the defintion
    }
    
}
