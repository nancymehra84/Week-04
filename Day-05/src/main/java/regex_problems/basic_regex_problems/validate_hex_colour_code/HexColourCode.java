package regex_problems.basic_regex_problems.validate_hex_colour_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColourCode {
    public static String ValidateHexColourCode(String HexColourCode){
        String regex="^[#][0-9A-Fa-f]{6}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(HexColourCode);
        if(matcher.find()){
            return "Valid";
        }else {
            return "Invalid";
        }
    }
    public static void main(String[] args){
        String[] HexColourCodes={"#FFA500","#ff4500","#123"};
        for(String HexColourCode:HexColourCodes){
            System.out.println(HexColourCode+":"+ValidateHexColourCode(HexColourCode));
        }
    }
}
