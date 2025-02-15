package regex_problems.advanced_problems.validate_a_ssn;

import java.util.regex.*;

public class ValidateSSN {
    public static String isValidSSN(String ssn) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(ssn);
        if(matcher.find()){
            return "Valid";
        }
        else{
            return "Invalid";
        }
    }
    public static void main(String[] args){
        String[] ssn={ "123-45-6789", "123456789"  };
        for(String input:ssn){
            System.out.println(isValidSSN(input));
        }
    }
}

