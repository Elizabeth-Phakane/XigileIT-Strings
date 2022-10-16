package stringmanipulation;
import java.util.Scanner;
public class StringComparison {

    public void compare (){

        //Creating a scanner object to help input the strings
        Scanner inputString=new Scanner(System.in);

        //Using the scanner object to input the 2 strings
        System.out.println("Please enter String 1: ");
        String string1=inputString.next();
        System.out.println("Please enter String 2: ");
        String string2=inputString.next();

        //Comparing the strings using if statement and returning the result
        if(string1.equals(string2)){
            System.out.print("The strings are equal.");
        }
        else{
            System.out.print("The strings are not equal.");
        }
    }

}
