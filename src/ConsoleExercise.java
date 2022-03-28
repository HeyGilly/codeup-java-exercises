import java.util.Scanner;



public class ConsoleExercise {
    public static void main(String[] args){

//        double pi = 3.14159;
//        System.out.format("The value of pi is approvimately %.2f. \n", pi);

//
//        Scanner num = new Scanner(System.in);
//
//        System.out.print("Enter something: \n");    // Gets ask to input something
//        Integer userInput = num.nextInt();         // takes in an input and takes Integer
//        System.out.println("You entered: --> \"" + userInput + "\" <-- \n"); // output the variable
//
//

//        Scanner randomWord = new Scanner(System.in);
//
//        System.out.println("Enter three names: ");
//        // String input
//        String name = randomWord.nextLine();
//        String name2 = randomWord.nextLine();
//        String name3 = randomWord.nextLine();
//        // Output input by user
//        System.out.println("Person 1: " + name);
//        System.out.println("Person 2: " + name2);
//        System.out.println("Person 3: " + name3);
//

        Scanner helloWorld = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String longSentence = helloWorld.nextLine();
        System.out.println(longSentence);



    }
}
