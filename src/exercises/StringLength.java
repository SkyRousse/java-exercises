package exercises;

import java.util.ArrayList;

public class StringLength {
    public static void printLength5(String word) {
        if(word.length() == 5) {
            System.out.println(word);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("The");
        words.add("Quick");
        words.add("Brown");
        words.add("Fox");
        words.add("Jumped");
        words.add("over");
        words.add("the");
        words.add("lazy");
        words.add("dog");

        ArrayList<String> hasFive = new ArrayList<>();
        for (String word : words) {
            printLength5(word);
        }
    }
}
