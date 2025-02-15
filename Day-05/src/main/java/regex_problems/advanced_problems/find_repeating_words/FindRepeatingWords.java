package regex_problems.advanced_problems.find_repeating_words;

import java.util.*;
import java.util.regex.*;

public class FindRepeatingWords {
    public static Set<String> getRepeatingWords(String text) {
        Set<String> seen = new HashSet<>();
        Set<String> repeatedWords = new HashSet<>();

        String regex = "\\b(\\w+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = matcher.group();
            if (!seen.add(word)) {
                repeatedWords.add(word);
            }
        }
        return repeatedWords;
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        Set<String> result = getRepeatingWords(text);

        System.out.println(String.join(", ", result));
    }
}

