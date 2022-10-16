package stringmanipulation;

public class StringConcatenation {

    private String string1;
    private String string2;
    private String output;


    public StringConcatenation(String string1, String string2){
        this.string1 = string1;
        this.string2 = string2;
    }

    public String getString1() {
        return string1;
    }


    public String getString2() {
        return string2;
    }


    public String result (String string1, String string2) {
        output = string1.concat(string2);
        return output;
    }
}
