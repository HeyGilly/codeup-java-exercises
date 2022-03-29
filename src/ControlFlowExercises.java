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


//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        //----- Do While
        //--- Create a do-while loop that will count by 2's starting with 0 and ending at 100.
        // [X] Follow each number with a new line.
        // [X] Alter your loop to count backwards by 5's from 100 to -10. Create a do-while loop that starts at 2, and
        // [X] displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i > -15);

        //----- For
        // Refactor the previous two exercises to use a for loop instead.

//            for (var x = 100; x>-15;x-=5){
//                System.out.println(x);
//            }

        //----- FizzBuzz
        // [X] Write a program that prints the numbers from 1 to 100.
        // [X] For multiples of three: print “Fizz” instead of the number.
        // [X] For the multiples of five: print “Buzz”.
        // [X] For numbers which are multiples of both three and five: print “FizzBuzz”.
//        int count = 1;
//        while (count < 100) {
//            if (count % 5 == 0 && count % 3 == 0){
//                System.out.println("FizzBuzz");
//                count++;
//            }
//            if (count % 3 == 0){
//                System.out.println("Fizz");
//                count++;
//            }
//            if (count % 5 == 0){
//                System.out.println("Buzz");
//                count++;
//            }
//            System.out.println(count);
//            count++;
//        }


        //----- Display a table of powers.
        //  [X] Prompt the user to enter an integer.
        //  [X] Display a table of squares and cubes from 1 to the value entered.
        //  [ ] Ask if the user wants to continue.
        //  [ ] Assume that the user will enter valid data.
        //  [ ] Only continue if the user agrees to.

//        System.out.println("-----------------------------------------------------------------------------");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What number would you like to go up to? ");
//        Integer num = Integer.valueOf(scanner.next());
//        int squareValue = num * num * num;
//        int cubedvalue = num * num * num * num;
//        if (num == 0) {
//            System.out.println("GameOver!");
//        } else if (num == 1){
//            System.out.println("number   | squared  | cubed");
//            System.out.println("-----------------------------");
//            System.out.println(num + "        |   " + squareValue + "      |   " + cubedvalue);
//            System.out.println("-----------------------------");
//         } else {
//            System.out.println("number   | squared  | cubed");
//            System.out.println("-----------------------------");
//            System.out.println(1 + "        |   " + 1 + "      |   " + 1);
//            System.out.println("-----------------------------");
//            System.out.print("Would you like to continue? yes / no \n");
//            String continueValue = scanner.next();
//            if (continueValue.equals("yes")){
//                System.out.println("-----------------------------");
//                int count = 1;
//                do{
//                    int squareCount = count * count * count;
//                    int cubedCount = count * count * count * count;
//                    System.out.println(count+"        |   "+ squareCount +"      |   "+ cubedCount);
//                    System.out.println("-----------------------------");
//                    count++;
//                } while(count <= num );
//            }else{
//                System.out.println("GameOver!");
//            }
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("What was your Grade? ");
        Integer num2 = Integer.valueOf(scanner.next());

        System.out.println(num2);
        System.out.println("Would you like to continue? yes / no \n");
        String continueValue2 = scanner.next();

        if (continueValue2.equals("yes")){
                if(num2 > 94){
                    System.out.println("You made a A+");
                } else if(num2 > 90){
                    System.out.println("You made a A-");
                } else if(num2 > 85){
                    System.out.println("You made a B+");
                } else if(num2 > 80){
                    System.out.println("You made a B-");
                } else if(num2 > 75){
                    System.out.println("You made a C+");
                } else if(num2 > 70){
                    System.out.println("You made a C-");
                } else if(num2 > 65){
                    System.out.println("You made a D+");
                } else if(num2 > 60){
                    System.out.println("You made a D-");
                } else if(num2 < 60){
                    System.out.println("You failed!");
                }
            }else{
                System.out.println("We dont have to talk about your grade.");
            }









    }
}
