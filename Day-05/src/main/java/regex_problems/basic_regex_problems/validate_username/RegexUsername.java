package regex_problems.basic_regex_problems.validate_username;

import java.util.regex.*;
public class RegexUsername {
    public static String ValidUsername(String username){
        String regex="^[a-zA-Z][a-zA-Z0-9_]{5,15}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(username);
        if(matcher.find()){
            return "Valid";
        }else {
            return "Invalid";
        }
    }
    public static void main(String[] args){
        String[] usernames={"user_123","123user","us"};
        for(String username:usernames){
            System.out.println(username+":"+ ValidUsername(username));
        }
    }
}
