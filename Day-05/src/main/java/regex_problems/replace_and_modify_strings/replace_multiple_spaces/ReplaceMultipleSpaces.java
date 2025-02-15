package regex_problems.replace_and_modify_strings.replace_multiple_spaces;

import java.util.regex.*;
public class ReplaceMultipleSpaces {
    public static String repalceMultipleSpaces(String text){
        String replacedText = text.replaceAll("\\s+", " ");
        return replacedText;

    }
    public static void main(String[] args) {
        String text = "This    is  an     example   with  multiple spaces.";
        System.out.println("Original: " + text);
        System.out.println("Formatted: " + repalceMultipleSpaces(text));
    }
}

