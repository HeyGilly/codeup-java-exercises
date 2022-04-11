public class HelloWorld {

    public static void main(String[] args){

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




    }
}
