package regex_problems.advanced_problems.extract_programming_language_names;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {
    public static List<String> extractProgrammingLang(String text){
        List<String> list= new ArrayList<>(Arrays.asList("JavaScript", "Java","Python", "C/C++", "Go"));
        String regex=String.join("|",list);
        List<String> result=new ArrayList<>();
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        while(matcher.find()){
            result.add(matcher.group());
        }
        return result;

    }
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> result=extractProgrammingLang(text);
        for(String s: result){
            System.out.println(s);
        }
    }
}
