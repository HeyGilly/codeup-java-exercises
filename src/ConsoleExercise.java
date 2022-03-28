import java.util.Scanner;



public class ConsoleExercise {
    public static void main(String[] args){

        double pi = 3.14159;
        System.out.format("The value of pi is approvimately %.2f. \n", pi);


        Scanner num = new Scanner(System.in);

        System.out.print("Enter something: \n");    // Gets ask to input something
        Integer userInput = num.nextInt();         // takes in an input and takes Integer
        System.out.println("You entered: --> \"" + userInput + "\" <-- \n"); // output the variable

    }
}
