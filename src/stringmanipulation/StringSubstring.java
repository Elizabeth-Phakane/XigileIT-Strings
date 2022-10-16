package stringmanipulation;

import java.util.Scanner;

public class StringSubstring {
    private int stringLength;
    private int position1,position2;

    private String sentence;

public StringSubstring(int position1,int position2, String sentence) {

    this.position1 = position1;
    this.position2 = position2;
    this.sentence = sentence;

}


    public void substringTest(){


    System.out.println(sentence.substring( position1,position2));

}


}
