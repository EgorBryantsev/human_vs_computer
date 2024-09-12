import java.util.*; // For Scanner, Random, etc.

/** 
 * Number guessing game for humans.
 * 
 * Enter a seed number, and the computer will think of a number between 0 and
 * 99 that you have to guess in at most seven tries. Afterwards, you see your
 * guessing history so you can learn to better play the game.
 * 
 * @author TODO
 * @id     TODO
 * @author TODO
 * @id     TODO
 * @data   TODO
 */

public class HumanGame {
    Scanner sc = new Scanner(System.in);
    Random randomGenerator;

    int attempts = 1;
    int attemptsMax = 7; //sc.nextInt()
    int answer = randomGenerator();
    //int guess = sc.nextInt();
    int[] arrayGuess = new int[attemptsMax];

    void run() {
        // TODO: Implementation
      
        // END TODO
    }

    While(attempts>=attemptsMax) {
        System.out.println("Guess a number");
        int guess = sc.nextInt();
        if (guess > answer) {
            System.out.println("Lower");
            //Array.. ar[a] = guess;
            attempts ++;
        } else if (guess < answer) {
            System.out.println("Higher");
            //Array.. ar[a] = guess;
            attempts ++;
        } else if (guess == answer) {
            System.out.println("Well done");
            System.out.println("You'll see the result here:");
            //Array.. ar[a] = guess;
            attempts = attemptsMax;
        } else {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        new HumanGame().run();
    }
    public String outputLines(int guess, int answer) {
        String output = guess
        return output;
    }

