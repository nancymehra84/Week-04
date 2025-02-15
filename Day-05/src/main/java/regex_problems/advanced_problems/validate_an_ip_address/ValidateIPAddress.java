package regex_problems.advanced_problems.validate_an_ip_address;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static String validateIp(String ip){
        String regex="\\b((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(ip);
        if(matcher.find()){
            return "Valid";
        }
        else{
            return "Invalid";
        }
    }
    public static void main(String[] args){
        String[] ip={ "0.234.12.23", "123.256.10.1111" , "12.344.012" };
        for(String input:ip){
            System.out.println(validateIp(input));
        }
    }
}
