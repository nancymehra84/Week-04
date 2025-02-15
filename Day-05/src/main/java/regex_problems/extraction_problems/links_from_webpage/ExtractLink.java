package regex_problems.extraction_problems.links_from_webpage;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {
    public static ArrayList<String> extractLinks(String text){
        String regex="http+s?://(www\\.)?([a-zA-Z0-9.-]+\\.[a-z]{2,})";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        ArrayList<String> list=new ArrayList<>();
        while(matcher.find()){
            list.add(matcher.group());
        }return list;
    }
    public static void main(String[] args){
        String text="Visit https://www.google.com and http://example.org for more info.";
        ArrayList<String> list=extractLinks(text);
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}