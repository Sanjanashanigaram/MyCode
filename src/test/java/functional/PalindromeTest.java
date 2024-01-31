package functional;


import functional.Palindrome;
import junit.framework.Assert;
import junit.framework.TestCase;

public class PalindromeTest extends TestCase {
    Palindrome p = new Palindrome();
    public void testCheck(){

        //true case
        assertEquals(1,p.palindromeCheck(121));
        //false case
        assertEquals(0,p.palindromeCheck(223));
        //null input
        assertEquals(0,p.palindromeCheck(' '));
    }
}
