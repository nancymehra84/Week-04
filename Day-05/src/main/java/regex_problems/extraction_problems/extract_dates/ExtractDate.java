package regex_problems.extraction_problems.extract_dates;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDate {
    public static ArrayList<String> extractDate(String text){
        String regex="\\d{2}/\\d{2}/\\d{2}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        ArrayList<String> Date=new ArrayList<>();
        while (matcher.find()){
            Date.add(matcher.group());
        }
        return Date;
    }
    public static void main(String[] args){
        String Text="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> list=extractDate(Text);
        for(String input:list){
            System.out.println(input+" ");
        }
    }
}
