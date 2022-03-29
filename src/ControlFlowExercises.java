import java.util.Locale;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String args[]) {


//--------  Loops Basics


        // ----  While
        // [X] Create an integer variable i with a value of 5.
        // [X] Create awhile loop that runs so long as i is less than or equal to 15
        // [X] Each loop iteration, output the current value of i, then increment i by one.
        // [X] Your output should look like this:
        //  5 6 7 8 9 10 11 12 13 14 15

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Exercise 1");
        System.out.println("-----------------------------------------------------------------------------");

        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Exercise 2");
        System.out.println("-----------------------------------------------------------------------------");
        //----- Do While
        //--- Create a do-while loop that will count by 2's starting with 0 and ending at 100.
        // [X] Follow each number with a new line.
        // [X] Alter your loop to count backwards by 5's from 100 to -10. Create a do-while loop that starts at 2, and
        // [X] displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        int iy = 100;
        do {
            System.out.println(iy);
            iy-=5;
        } while (iy > -15);


        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Exercise 2B");
        System.out.println("-----------------------------------------------------------------------------");
//        ----- For
//         Refactor the previous two exercises to use a for loop instead.

            for (var x = 100; x>-15;x-=5){
                System.out.println(x);
            }


        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Exercise 3");
        System.out.println("-----------------------------------------------------------------------------");
        //----- FizzBuzz
        // [X] Write a program that prints the numbers from 1 to 100.
        // [X] For multiples of three: print “Fizz” instead of the number.
        // [X] For the multiples of five: print “Buzz”.
        // [X] For numbers which are multiples of both three and five: print “FizzBuzz”.
        int count = 1;
        while (count < 100) {
            if (count % 5 == 0 && count % 3 == 0){
                System.out.println("FizzBuzz");
                count++;
            }
            if (count % 3 == 0){
                System.out.println("Fizz");
                count++;
            }
            if (count % 5 == 0){
                System.out.println("Buzz");
                count++;
            }
            System.out.println(count);
            count++;
        }

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Exercise 4");
        System.out.println("-----------------------------------------------------------------------------");
        //----- Display a table of powers.
        //  [X] Prompt the user to enter an integer.
        //  [X] Display a table of squares and cubes from 1 to the value entered.
        //  [ ] Ask if the user wants to continue.
        //  [ ] Assume that the user will enter valid data.
        //  [ ] Only continue if the user agrees to.

        Scanner scanner = new Scanner(System.in);
        System.out.println("              What number would you like to go up to? \n" +
                "                   (Please insert a number)\n" +
                "\n" +
                "\n");
        Integer num = Integer.valueOf(scanner.next());
        int squareValue = num * num * num;
        int cubedvalue = num * num * num * num;
        if (num == 0) {
            System.out.println("GameOver!");
        } else if (num == 1){
            System.out.println("number   | squared  | cubed");
            System.out.println("-----------------------------");
            System.out.println(num + "        |   " + squareValue + "      |   " + cubedvalue);
            System.out.println("-----------------------------");
         } else {
            System.out.println("number   | squared  | cubed");
            System.out.println("-----------------------------");
            System.out.println(1 + "        |   " + 1 + "      |   " + 1);
            System.out.println("-----------------------------");
            System.out.print("Would you like to continue? yes / no \n");
            String continueValue = scanner.next();
            if (continueValue.equals("yes")){
                System.out.println("-----------------------------");
                int count2 = 1;
                do{
                    int squareCount = count2 * count2 * count2;
                    int cubedCount = count2 * count2 * count2 * count2;
                    System.out.println(count2+"        |   "+ squareCount +"      |   "+ cubedCount);
                    System.out.println("-----------------------------");
                    count2++;
                } while(count2 <= num );
            }else{
                System.out.println("GameOver!");
            }
        }




        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Exercise 5");
        System.out.println("-----------------------------------------------------------------------------");


        //--- Convert given number grades into letter grades.

                Scanner scanner2 = new Scanner(System.in);
        System.out.println("              What is your grade? \n" +
                "\n" +
                "\n" +
                "\n");        Integer num2 = Integer.valueOf(scanner2.next());

        System.out.println(num2);
        System.out.println("Would you like to continue? yes / no \n");
        String continueValue2 = scanner2.next();

        if (continueValue2.equals("yes")){
                if(num2 > 94){
                    System.out.println("You made a A+");
                } else if(num2 >= 90){
                    System.out.println("You made a A-");
                } else if(num2 >= 85){
                    System.out.println("You made a B+");
                } else if(num2 >= 80){
                    System.out.println("You made a B-");
                } else if(num2 >= 75){
                    System.out.println("You made a C+");
                } else if(num2 >= 70){
                    System.out.println("You made a C-");
                } else if(num2 >= 65){
                    System.out.println("You made a D+");
                } else if(num2 >= 60){
                    System.out.println("You made a D-");
                } else if(num2 < 60){
                    System.out.println("You failed!");
                }
            }else{
                System.out.println("We dont have to talk about your grade.");
            }

    }
}
