package regex_problems.advanced_problems.validate_a_credit_card_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static String validateCreditCard(String input){
        String regex="^(4\\d{15}|5\\d{15})$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        if(matcher.find()){
            return "Valid";
        }
        else{
            return "Invalid";
        }
    }
    public static void main(String[] args){
        String[] creditCard={ "4567890474893456", "4678489923134" , "5671898947823995" };
        for(String input:creditCard){
            System.out.println(validateCreditCard(input));
        }
    }
}
