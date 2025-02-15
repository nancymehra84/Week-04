package junit.basic_junit_test.testing_string_utility_methods;

public class StringUtils {
    public static String StringReverse(String str){
        StringBuilder sb= new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }return true;
    }
    public static String toUppercase(String str){
        return str.toUpperCase();
    }
}
