import stringmanipulation.StringComparison;
import stringmanipulation.StringConcatenation;
import stringmanipulation.StringSubstring;

public class Main {
    public static void main(String[] args) {

        StringComparison  testStringComparison = new StringComparison();
        testStringComparison.compare();

        StringConcatenation testStringConcatenation = new StringConcatenation("Elizabeth", "Phakane");
        System.out.println(testStringConcatenation.result(testStringConcatenation.getString1(), testStringConcatenation.getString2()));

        StringSubstring testStringSubstring = new StringSubstring(2,3,"shoprite");
        testStringSubstring.substringTest();
    }
}