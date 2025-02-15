package junit_testing.basic_junit_testing;

import junit.basic_junit_test.testing_string_utility_methods.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilitytesting {
    @Test
    void reverseTest(){
        assertEquals(StringUtils.StringReverse("Muskan"),"naksuM");
    }

    @Test
    void palindromeTest(){
        assertEquals(StringUtils.isPalindrome("madam"),true);
    }

    @Test
    void UppercaseTest(){
        assertEquals(StringUtils.toUppercase("Muskan"),"MUSKAN");
    }
}
