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

    int a = 1;
    int am = 7; //sc.nextInt()
    int x = randomGenerator();
    int x = sc.nextInt();

    void run() {
        // TODO: Implementation
      
        // END TODO
    }

    While(a>=am) {
        System.out.println("Guess a number");
        int g = sc.nextInt();
        if (g > x) {
            System.out.println("Lower");
            //Array.. ar[a] = guess;
            a ++;
        } else if (g < x) {
            System.out.println("Higher");
            //Array.. ar[a] = guess;
            a ++;
        } else if (g == x) {
            System.out.println("Well done");
            System.out.println("You'll see the result here:");
            //Array.. ar[a] = guess;
            a = am;
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

