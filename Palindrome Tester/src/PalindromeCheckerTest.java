import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeCheckerTest
	{
	@Test
	public void testTruePalindrome()
		{
		assertEquals(true, PalindromeChecker.checkForPalindrome("Abba"));
		}
	
	@Test
	public void testFalsePalindrome()
		{
		assertEquals("I'm afraid your code is not working.", false, PalindromeChecker.checkForPalindrome("Abaa"));
		}
	
	@Test
	public void testForPunctuation()
		{
		assertEquals("Did you strip out all punctuation?", true, PalindromeChecker.checkForPalindrome("A man, a plan, a canal - Panama"));
		}
	
	@Test
	public void testForSpaces()
		{
		assertEquals("Did you strip out spaces before checking to see if it's a palindrome?", true, PalindromeChecker.checkForPalindrome("race car"));
		}

	}
