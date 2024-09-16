import java.util.*; // For Scanner, Random, etc.

/** 
 * Number guessing game for humans.
 * 
 * Enter a seed number, and the computer will think of a number between 0 and
 * 99 that you have to guess in at most seven tries. Afterwards, you see your
 * guessing history so you can learn to better play the game.
 * 
 * @author Your Name
 * @id     Your Student ID
 * @date   YYYY-MM-DD
 */
public class EgorGame {
    Scanner sc = new Scanner(System.in);
    Random randomGenerator;

    void run() {
        // seed
        System.out.println("Type an arbitrary number");
        long seed = sc.nextLong();
        randomGenerator = new Random(seed);

        // generate from seed
        int code = randomGenerator.nextInt(100);
        
        // guessing game
        System.out.println("Start guessing!");
        List<Integer> guesses = new ArrayList<>();
        boolean won = false;
        int numberOfGuesses = 0;
        
        while (numberOfGuesses < 7 && !won) {
            if (sc.hasNextInt()) {
                int guess = sc.nextInt();
                guesses.add(guess);
                numberOfGuesses++;
                
                if (guess > code) {
                    System.out.println("lower");
                } else if (guess < code) {
                    System.out.println("higher");
                } else {
                    System.out.println("Good guess! You won.");
                    won = true;
                }
            }
        }
        
        if (!won) {
            System.out.println("No more guesses, you lost.");
        }
        
        // guessing history dots
        System.out.println(numberOfGuesses + " guesses:");
        for (int guess : guesses) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                if (i == guess && guess == code) {
                    line.append("X");
                } else if (i == guess) {
                    line.append("X");
                } else if (i == code && guess != code) {
                    line.append("|");
                } else {
                    line.append(".");
                }
                if (i < 99) {
                    line.append(" ");
                }
            }
            // If guess = code, remove the '|'
            if (guess == code) {
                int pos = guess * 2; // Account for spaces
                line.setCharAt(pos, 'X');
            }
            System.out.println(line.toString());
        }
    }

/** 
 * Can also do the above by doing:
 * if guess > code, println 
 */

    public static void main(String[] args) {
        new EgorGame().run();
    }
}
