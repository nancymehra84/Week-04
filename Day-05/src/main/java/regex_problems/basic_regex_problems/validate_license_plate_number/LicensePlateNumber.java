package regex_problems.basic_regex_problems.validate_license_plate_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateNumber {
    public static String ValidatePlateNumber(String plateNumber){
        String ragex="^[A-Z]{2}\\d{4}$";
        Pattern pattern=Pattern.compile(ragex);
        Matcher matcher= pattern.matcher(plateNumber);
        if(matcher.find()){
            return "Valid";
        }else{
            return "Invalid";
        }
    }
    public static void main(String[] args){
        String[] plateNumbers={"AB1234","A12345"};
        for(String plateNumber:plateNumbers){
            System.out.println(plateNumber+":"+ValidatePlateNumber(plateNumber));
        }
    }
}
