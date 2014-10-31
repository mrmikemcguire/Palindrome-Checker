import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromeCheckerTest extends PalindromeChecker
	{

	@Test
	public void PalindromCheckerTest()
		{
		assertEquals(true, PalindromeChecker.checkForPalindrome("Abba"));
		assertEquals(false, PalindromeChecker.checkForPalindrome("Abbaa"));
		}

	}
