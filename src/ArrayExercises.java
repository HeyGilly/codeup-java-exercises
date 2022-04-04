import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        String[] Person = {"John", "Paul", "Ringo"};
        System.out.println("Array:\n"+ Arrays.toString(Person));

    }


    public static void addPerson( int[] arrayList, String[] personToBeAdded) {
        int n = arrayList.length;

        int[] newArray = new int[n + 1];
        System.out.println(Arrays.toString(newArray));



        for (int people : newArray){
            System.out.println(people);
        }
    }
}

