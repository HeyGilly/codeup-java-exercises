public class ControlFlowExercises {
    public static void main(String args[]){



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


    }
}
