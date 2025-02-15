package regex_problems.extraction_problems.capitalized_words_from_sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWord {
    public static ArrayList<String> capitalisedWords(String text){
        String regex="[A-Z]\\w+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        ArrayList<String> list=new ArrayList<>();
        while(matcher.find()){
            list.add(matcher.group());
        }
        return list;
    }
    public static void main(String[] args){
        String text="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> list=capitalisedWords(text);
        for(String input:list){
            System.out.print(input+" ");
        }
    }
}
