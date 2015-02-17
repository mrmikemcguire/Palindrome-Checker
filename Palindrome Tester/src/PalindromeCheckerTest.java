import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeCheckerTest extends PalindromeChecker
	{
	@Test
	public void TruePalindrome()
		{
		assertEquals(true, PalindromeChecker.checkForPalindrome("Abba"));
		}
	
	@Test
	public void FalsePalindrome()
		{
		assertEquals("I'm afraid your code is not working.", false, PalindromeChecker.checkForPalindrome("Abbaa"));
		}
	
	@Test
	public void TestForSpaces()
		{
		assertEquals("Did you strip out spaces before checking to see if it's a palindrome?", true, PalindromeChecker.checkForPalindrome("race car"));
		}
	
	@Test
	public void TestForPunctuation()
		{
		assertEquals("Did you strip out all punctuation?", true, PalindromeChecker.checkForPalindrome("A man, a plan, a canal - Panama"));
		}

	}
