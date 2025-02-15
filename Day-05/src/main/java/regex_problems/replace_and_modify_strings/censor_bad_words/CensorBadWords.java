package regex_problems.replace_and_modify_strings.censor_bad_words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CensorBadWords {
    public static String repalceBadWordsre(String text){
        List<String> list= new ArrayList<>(Arrays.asList("damn", "stupid","idiot"));
        String regex=String.join("|",list);
        String replacedText=text.replaceAll("\\b("+regex+")\\b","****");
        return replacedText;

    }
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        System.out.println("Original: " + text);
        System.out.println("Formatted: " + repalceBadWordsre(text));
    }
}
