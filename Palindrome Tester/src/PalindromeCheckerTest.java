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
		assertEquals(false, PalindromeChecker.checkForPalindrome("Abbaa"));
		}
	
	@Test
	public void TestForSpaces()
		{
		assertEquals(true, PalindromeChecker.checkForPalindrome("race car"));
		}
	
	@Test
	public void TestForPunctuation()
		{
		assertEquals(true, PalindromeChecker.checkForPalindrome("A man, a plan, a canal - Panama"));
		}

	}
