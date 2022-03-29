import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


        String[] bobAnswers = {"Sure", "Whoa, chill out!", "Fine. Be that way", "Whatever"};
        int min = 0;
        int max = 4;
        int num = (int) (Math.random()*(max - min + 1)+min);
        String bobSays = bobAnswers[num];

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ask Bob a question, any question: \n");
        String userInput = scanner.next();
        System.out.printf(
                        "Your question is: "+userInput +
                        "\nBob's answer: "+ bobSays);








    }
}
