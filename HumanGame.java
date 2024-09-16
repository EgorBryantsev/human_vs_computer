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
    
    int attempts = 1;
    int attemptsMax = 7; //sc.nextInt()
    //int guess = sc.nextInt();
    ArrayList<Integer> arrayGuess = new ArrayList<>();

    void run() {
        System.out.println("Type an arbitrary number");
        long seed = sc.nextLong();
        Random randomGenerator = new Random(seed);
        int code = randomGenerator.nextInt(100);
        System.out.println("Start guessing!");

        while (attempts <= attemptsMax) {
            int guess = sc.nextInt();
            arrayGuess.add(guess);
            if (guess > code) {
                System.out.println("lower");
                if (attempts == attemptsMax) {
                    System.out.println("No more guesses, you lost");
                }
                attempts++;
            } else if (guess < code) {
                System.out.println("higher");
                if (attempts == attemptsMax) {
                    System.out.println("No more guesses, you lost");
                }
                attempts++;
            } else if (guess == code) {
                System.out.println("Good guess! You won.");
                attempts = attemptsMax + 1;
            } else {
                System.out.println("Error");
            }
            
        }

        System.out.println("Guesses:");

        int counter = 0;
        
        while (counter < arrayGuess.size()) {
            int counter2 = 0;
            if (arrayGuess.get(counter) < code) {
                while (counter2 < arrayGuess.get(counter)) {
                    System.out.print(".");
                    counter2++;
                }
                System.out.print("x");
                counter2++;
                while (counter2 < code) {
                    System.out.print(".");
                    counter2++;
                }
                System.out.print("|");
                counter2++;
                while (counter2 < 100) {
                    System.out.print(".");
                    counter2++;
                }
            }
            if (arrayGuess.get(counter) > code) {
                while (counter2 < code) {
                    System.out.print(".");
                    counter2++;
                }
                System.out.print("|");
                counter2++;
                while (counter2 < arrayGuess.get(counter)) {
                    System.out.print(".");
                    counter2++;
                }
                System.out.print("x");
                counter2++;
                while (counter2 < 100) {
                    System.out.print(".");
                    counter2++;
                }
            }
            if (arrayGuess.get(counter) == code) {
                while (counter2 < arrayGuess.get(counter)) {
                    System.out.print(".");
                    counter2++;
                }
                System.out.print("x");
                counter2++;
                while (counter2 < 100) {
                    System.out.print(".");
                    counter2++;
                }
            }
            counter++;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new HumanGame().run();
    }
}

