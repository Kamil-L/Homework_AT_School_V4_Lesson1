import java.util.Random;
import java.util.Scanner;

public class HomeworkLesson1 {

    public static void main(String[] args) {

        int numToGuess = new Random().nextInt(100);
        Scanner scannerNumber = new Scanner(System.in);
        System.out.println("Please input integer number from the following range 0-99: ");

        int numChosen, numUsedTries, numOfTries = 5;

        for (int i = 1; i <= numOfTries; i++) {

            numChosen = scannerNumber.nextInt();
            numUsedTries = numOfTries - i;

            if (numChosen != numToGuess) {

                if (numUsedTries == 0) {
                    System.out.println("Sorry you didn't guess the number, the answer was: " + numToGuess);
                    break;
                } else if (numChosen > numToGuess) {
                    System.out.println("Your number is GREATER than the one you are trying to guess");
                } else
                    System.out.println("Your number is LOWER than the one you are trying to guess");

                System.out.println("You have " + numUsedTries + " attempts left!");
                System.out.println("Please try again");

            } else {
                System.out.println("You guessed it!");
                break;
            }
        }
    }
}