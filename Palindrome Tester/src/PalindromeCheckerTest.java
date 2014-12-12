import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeCheckerTest extends PalindromeChecker
	{
	@Test
	public void PalindromCheckerTest()
		{
		assertEquals(true, PalindromeChecker.checkForPalindrome("Abba"));
		assertEquals(false, PalindromeChecker.checkForPalindrome("Abbaa"));
		assertEquals(true, PalindromeChecker.checkForPalindrome("race car"));
		assertEquals(true, PalindromeChecker.checkForPalindrome("A man, a plan, a canal - Panama"));
		}

	}
