import java.util.Scanner;



public class ConsoleExercise {
    public static void main(String[] args){

        System.out.println("---------Exercise #1-----------\n");

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f. \n", pi);

        System.out.println("---------Exercise #2-----------\n");
        Scanner num = new Scanner(System.in);
        System.out.print("Enter an integer: \n");    // Gets ask to input something
        int userInput = num.nextInt();         // takes in an input and takes Integer
        System.out.println("You entered: --> \"" + userInput + "\" <-- \n"); // output the variable

        System.out.println("---------Exercise #3-----------\n");

        System.out.println("Enter three names: ");
        // String input
        System.out.println("One: ");
        String name1 = num.nextLine();
        System.out.println("Two: ");
        String name2 = num.nextLine();
        System.out.println("Three: ");
        String name3 = num.nextLine();
        // Output input by user
        System.out.println("Person 1: " + name1);
        System.out.println("Person 2: " + name2);
        System.out.println("Person 3: " + name3);

        System.out.println("---------Exercise #4-----------\n");

        System.out.println("Enter a Sentence: ");
        String longSentence = num.nextLine();
        System.out.println(longSentence);

        System.out.println("---------Exercise #5-----------\n");

        Scanner classroom = new Scanner(System.in);
        System.out.println("Enter the width and height of the classroom");

        int Width= classroom.nextInt();
        int Height = classroom.nextInt();

        System.out.println("Area: " + (Width * Height));
        System.out.println("Perimeter:  " + ((2*Width)+(2*Height)));


    }
}
