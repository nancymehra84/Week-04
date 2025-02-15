package regex_problems.extraction_problems.email_address_from_text;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static ArrayList<String> EmailAdresses(String text){
        String regex="[A-Za-z0-9_.+-]+@[A-Za-z0-9-]+\\.[a-zA-Z]{2,}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        ArrayList<String> list=new ArrayList<>();
        while(matcher.find()){
            list.add(matcher.group());
        }
        return list;
    }
    public static void main(String[] args){
        String text="Contact us at support@example.com and info@company.org";
        List<String> list=EmailAdresses(text);
        for(String input:list){
            System.out.println(input);
        }
    }
}
