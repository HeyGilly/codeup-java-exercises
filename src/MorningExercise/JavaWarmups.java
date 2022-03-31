package MorningExercise;

import java.util.Scanner;

public class JavaWarmups {

    //------ March 31, 22
    // Create a Java class, JavaWarmups. Add a main method to test the warmup methods.
    //
    // Create a method, returnFirstCapitalLetter, that takes in a string and returns the first capital
    // letter as a char. If no capital letter is found, return a single space character ' '.
    // Assume only letters in the input string and all possible inputs will have at least one letter.

    // Examples...
    //returnFirstCapitalLetter("hellO") // returns 'O'
    //returnFirstCapitalLetter("hello") // returns ' '
    //returnFirstCapitalLetter("hEllo") // returns 'E'
    //returnFirstCapitalLetter("hELlO") // returns 'E'
    //returnFirstCapitalLetter("H") // returns 'H'


    public static char FirstCapitalLetter(String input) {
        for(int count = 0;count < input.length();count+=1) {


            if ( Character.isUpperCase(input.charAt(count))) {
                return input.charAt(count);
            }
        }
        return '-';
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------3/31/22-----------");
        System.out.println("please insert any word: (Be Respectful)\n");
        String name = sc.nextLine();
        FirstCapitalLetter(name);
    }
}
