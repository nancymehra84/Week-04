package regex_problems.advanced_problems.extract_currency_values;
import java.util.*;
import java.util.regex.*;

public class ExtractCurrencyValues {
    public static List<String> extractCurrencyValues(String text) {
        List<String> result = new ArrayList<>();
        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> result = extractCurrencyValues(text);

        System.out.println(String.join(", ", result));
    }
}

