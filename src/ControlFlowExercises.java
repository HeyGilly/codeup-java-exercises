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
        int i = 100;
        do {
            System.out.println(i);
            i-=5;
        } while (i > -15);






    }
}
