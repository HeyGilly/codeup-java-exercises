
import java.util.Scanner;
        import java.util.Random;

public class Highlow {
    public static void main(String args[]) {
        exercise5();

    }


    public static void exercise5(){
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            // Random
            Random rand = new Random();
            Scanner scanner = new Scanner(System.in);


            //Start of exercise
            System.out.println("------------------Exercise #5-------------------------");
            System.out.println("Welcome to the EXCITING NEW number guessing Game!");
            System.out.println("Rules: Guess the number between 1-100 and we will tell you HIGHER, LOWER, or if your " +
                    "right on the " +
                    "bullet.");
            System.out.println("Good Luck!");
            System.out.println();
            //random Number Generator
            int goldenNumber = rand.nextInt( 100);
            //method for the guessing game
            formulaGuessingGame(goldenNumber);
            //Want to roll again with new dice
            System.out.println("Roll again? (y/n): ");
            choice = scanner.nextLine();
            System.out.println();
        }
    }


    public static void formulaGuessingGame(int goldenNum){
        Scanner scanner = new Scanner(System.in);
        System.out.println(goldenNum);
        System.out.println("What is the Golden Number? \n");
        int userGuessedNumber  = Integer.parseInt(scanner.nextLine());

        System.out.println("the Golden Number is "+goldenNum);

        if ( userGuessedNumber == goldenNum){
            System.out.println("--------------------------- \n");
            System.out.println("BING ");
            System.out.println("BONG ");
            System.out.println("WINNER WINNER ");
            System.out.println("CHICKEN DINNER");
            System.out.println();
        } else if ( userGuessedNumber>goldenNum){
            System.out.println("--------------------------- ");
            System.out.println("LOWER ");
            formulaGuessingGame(goldenNum);
        } else {
            System.out.println("---------------------------");
            System.out.println("HIGHER");
            formulaGuessingGame(goldenNum);
        }
    }
}
