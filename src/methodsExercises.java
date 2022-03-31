import java.util.Scanner;
import java.util.Random;

public class methodsExercises<min, max> {


    //--- 1.  Basic Arithmetic
    //[ ] 1a. Create four separate methods. Each will perform an arithmetic operation:
    //[ ] 1b. Addition, Subtraction, Multiplication, Division
    //[ ] 1c. Test your methods and verify the output
    //[ ] 1d. Add a modulus method that finds the modulus of two numbers

    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public static int division(int num1, int num2){
        return num1 / num2;
    }

    public static void runIt(int firstNumber, int secondNumber){
        System.out.println("-------------------------------------------");
        System.out.println("When you add "+firstNumber+" and "+secondNumber+" you will get: " + addition(firstNumber, secondNumber));
        System.out.println("-------------------------------------------");
        System.out.println("When you minus "+firstNumber+" and "+secondNumber+" you will get: " + subtraction(firstNumber, secondNumber));
        System.out.println("-------------------------------------------");
        System.out.println("When you multiply "+firstNumber+" and "+secondNumber+" you will get: " + multiplication(firstNumber, secondNumber));
        System.out.println("-------------------------------------------");
        System.out.println("When you divide "+firstNumber+" and "+secondNumber+" you will get: " + division(firstNumber, secondNumber));
        System.out.println("-------------------------------------------");
    }



    // ----- Exercise #2
    //----      Create a method that validates that user input is in a certain range
    //----      The method signature should look like this:
    public static void getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int middleNumber = Integer.parseInt(scanner.nextLine());

            if (max < middleNumber || middleNumber < min) {
                System.out.println("Error: input the correct number");
                getInteger(min, max);
            } else {
                System.out.println("-------------------------------------------");
                System.out.print("Your number is between " + min + " and " + max + "! \nyour lucky number is: " + middleNumber);
                System.out.println("\n-------------------------------------------");
            }
    }


    // ----- Exercise #3
    //----      Prompt the user to enter an integer from 1 to 10.
    //----      Display the factorial of the number entered by the user.
    //----      Ask if the user wants to continue.
    //----      Use a for loop to calculate the factorial.
    //----     Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //----     Use the long type to store the factorial.
    //----     Continue only if the user agrees to.
    //----     A factorial is a number multiplied by each of the numbers before it.

    public static int exercise3(int num) {
        Scanner scanner = new Scanner(System.in);

        int max = 10;
        int min = 0;

        if (min > num || num > max) {
            System.out.println("Error: input the correct number");
            System.out.println("Enter any number between 1 and 10:  ");
            int exercise3Num = Integer.parseInt(scanner.nextLine());
            exercise3(exercise3Num);
        } else {
            System.out.println("-------------------------------------------");
            long factorial = 1;
            for(int i = 1; i <= num; ++i) {
                // factorial = factorial * i;
                factorial *= i;
            }
            System.out.printf("Factorial of %d = %d", num, factorial);
        }
        return num;
    }




    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
//        //  Exercise#1
//        System.out.println("-------------------Exercise #1------------------------");
//        System.out.print("Enter your first number:  ");
//        int firstNumber = Integer.parseInt(scanner.nextLine());
//        System.out.println("-------------------------------------------");
//        System.out.print("Enter your Next Number:   ");
//        int secondNumber = Integer.parseInt(scanner.nextLine());
//
//        runIt(firstNumber, secondNumber);


        //  Exercise #2
//        System.out.println("------------------Exercise #2-------------------------");
//        System.out.println("Enter any two numbers ");
//        System.out.print("      First Number please: ");
//        int num1 = Integer.parseInt(scanner.nextLine());
//        System.out.print("      Second Number please: ");
//        int num2 = Integer.parseInt(scanner.nextLine());
//        getInteger(num1, num2);

//        //  Exercise #3
//        System.out.println("------------------Exercise #3-------------------------");
//        System.out.println("Enter any number between 1 and 10:  ");
//        int exercise3Num = Integer.parseInt(scanner.nextLine());
//        exercise3(exercise3Num);

        //Exercise #4
        exercise4();

    }


    public static void exercise4() {
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            // Scanner and Random
            Random rand = new Random();
            Scanner scanner = new Scanner(System.in);
            //Start of exercise
            System.out.println("------------------Exercise #4-------------------------");
            System.out.println("Enter the number of sides for a pair of dice:  ");
            int diceSides = Integer.parseInt(scanner.nextLine());
            // AWESOME random number method
            int dice1 = rand.nextInt(diceSides);
            int dice2 = rand.nextInt(diceSides);
            //If statement if they roll zeros
            if (dice1 == 0 || dice2 == 0){
                System.out.println("-------Dice rolled off table--------");
                System.out.println();
            }else{
                System.out.println("-------and you rolled--------");
                System.out.println("Dice 1: "+dice1);
                System.out.println("Dice 2: "+dice2);
            }
            //Want to roll again with new dice
            System.out.println("Roll again? (y/n): ");
            choice = scanner.nextLine();
            System.out.println();
        scanner.close();
        }
    }


    public static void exercise5(){

    }


    }
