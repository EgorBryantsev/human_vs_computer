import java.util.Scanner;

/**
 * Simple number guessing game for computers.
 * 
 * Think of a number and type "go". Your computer starts guessing
 * your number. Reply "lower" when the guess is too high, "higher" 
 * when it is too low, and "guessed" when the computer guessed
 * your number correctly.
 * 
 * @author Egor Bryantsev
 * @id     2087782
 * @author TODO
 * @id     TODO
 * @data   TODO
 */
public class ComputerGame {
    Scanner sc = new Scanner(System.in);
    int lowerBound = 0;
    int upperBound = 999;
    int guess;
    int numberOfGuesses = 0;
    boolean guessed = false;
    
    void run() {
        System.out.println(
            "Think of a secret number not smaller than 0 and not greater " 
            + "than 999. Type 'go' when you have one."
        );
        
        // wait for signal     
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equalsIgnoreCase("go")) {
                break;
            }
        }    
        
        // computer guess loop
        while (numberOfGuesses < 10 && !guessed) {
            guess = lowerBound + (upperBound - lowerBound) / 2;
            System.out.println(guess);
            numberOfGuesses++;

            // adjust guess based on user feedback
            if (sc.hasNext()) {
                String response = sc.next();
                if (response.equalsIgnoreCase("lower")) {
                    upperBound = guess - 1;
                } else if (response.equalsIgnoreCase("higher")) {
                    lowerBound = guess + 1;
                } else if (response.equalsIgnoreCase("guessed")) {
                    guessed = true;
                } else {
                    // invaid responses
                }        
            }
        }        
        // admit defeat
        if (!guessed) {
            System.out.println("I give up");
        }

    }

    public static void main(String[] args) {
        new ComputerGame().run();
    }
}
