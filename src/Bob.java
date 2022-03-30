import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




            // Important Variables
            String choiceContinue = "y";
        do {
            String[] bobAnswers = {"Sure", "Whoa, chill out!", "Fine. Be that way", "Whatever"};
            int min = 0;
            int max = 4;
            int num = (int) (Math.random()*(max - min + 1)+min);
            String bobSays = bobAnswers[num];
            // Question
            System.out.print("Ask Bob a question, any question: \n");
            String userInput = scanner.next();
            // Bob's Answer
            System.out.print("Bob's answer: "+ bobSays);
            System.out.println();
            // Do you want to ask again?
            System.out.print("\nAsk Again? (y/n): \n");
            choiceContinue = scanner.next();
            System.out.println();
        }while(choiceContinue.equals("y"));
        // When your done the scanner will close and GAME OVER
        scanner.close();
        System.out.println("Game-Over");

    }
}
