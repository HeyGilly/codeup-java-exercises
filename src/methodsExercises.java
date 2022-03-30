import java.util.Scanner;

public class methodsExercises {


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
        return;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number:  ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("-------------------------------------------");
        System.out.print("Enter your Next Number:   ");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        runIt(firstNumber, secondNumber);
    }
}
