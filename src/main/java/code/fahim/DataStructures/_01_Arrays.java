package code.fahim.DataStructures;

import java.util.Arrays;
import java.util.stream.Stream;

public class _01_Arrays{
    public static void main(String[] args){
        System.out.println("----- Arrays ------");

        // define an array
        String[] names = {"Daniel", "John", "Maria"};
        String[] names_2 = new String[3];
        names_2[0] = "Rafinia";
        names_2[1] = "Lamine Jamal";
        names_2[2] = "Pedri";

        // access arrays
        System.out.println("First element array names: "+ names[0]);
        System.out.println("Second element array names_2: "+ names_2[1]);


        /* ------------- java.util.Arrays --------------- */
        // convert array to string
        String namesString = Arrays.toString(names);
        System.out.println("names array: "+ namesString);

        // apply stream functional operations

    }
}