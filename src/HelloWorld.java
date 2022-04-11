
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        //Exercise - Syntax, Types, and Variables

        int myFavoriteNumber = 3;
        System.out.println(myFavoriteNumber);

        String myString = "New world!";
        System.out.println(myString);


        // Change your code to assign a character value to myString.
//         myString = 'H';
        // This is not working because myString is a String and not a char data type.
        // You will have to use value to convert different types of value into strings.
        // here we are using  char to string
        myString = String.valueOf('H');

        //Change your code to assign the value 3.14159 to myString. What happens?
//        myString = 3.14159;
        //Just like the problem before you are turning a string into a double or a float
        myString = String.valueOf(3.14159);

        //Declare an long variable named myNumber, but do not assign anything to it.
        //Next try to print out myNumber to the console. What happens?
        long myNumber = 0;
        System.out.println(myNumber);
        // I tried to print out the long variable, but it forced me to add a number.
        // automatically added a 0

        //Change your code to assign the value 3.14 to myNumber. What do you notice?
//          myNumber = 3.14;
        // does not work because the long needs to turn into a double because of decimals.
        //  in order to work the code need to EXPLICIT CAST
        myNumber = (long) 3.14;
        //which converts larger types into smaller types.
        // When using this casting you will lose data by the 7th decimal.

        //Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        myNumber = 123L;
        System.out.println(myNumber);
        // Automatically cahnges the numbers to long 123.

        //Change your code to assign the value 123 to myNumber.
        myNumber = 123;
        System.out.println(myNumber);

        //Change your code to declare myNumber as a float. Assign the value 3.14 to it.
        // What happens? What are two ways we could fix this?
        myNumber = (long) 3.14f;
        float vOut = myNumber;
        System.out.println(vOut);


        int x = 5;
        System.out.println(x++);    // Shows five because the adding of one is after it shows
        System.out.println(x);      // So when it gets here you are seeing the add so the variable becomes 6
        System.out.println(++x);     // Here the adding is before the variable so it will change by the time it shows 7


        // You are not able to make a variable named class due to being a keyword.
        // Java is full of classes and classes are just template of objects.
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int x = 4;
//        x += 5;
//
//        x = 3;
//        int y = 4;
//        y *= x;
//
//
//         x = 10;
//         y = 2;
//        x /= y;
//        y -= x;
        
        System.out.println(Integer.MAX_VALUE);


    }
}
