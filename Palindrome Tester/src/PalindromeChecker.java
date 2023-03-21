import java.util.Scanner;

public class PalindromeChecker
	{
	static String originalText;
	
	public static void main(String[] args)
		{
		inputString();
		}
	
	public static void inputString()
		{
		System.out.println("Please enter your word(s) to be tested: ");
		Scanner userInput = new Scanner(System.in);
		originalText = userInput.nextLine();
		userInput.close();
		checkForPalindrome(originalText);
		}
	
	public static boolean checkForPalindrome(String originalText)
		{
		originalText = originalText.toLowerCase();
		originalText = originalText.replaceAll(" ", "");
		//originalText = originalText.replaceAll("[^\\p{L}\\p{Nd}]+", "");		
		System.out.println("Your stripped text is " + originalText);
		
		StringBuffer reversedText = new StringBuffer(originalText);
		reversedText = reversedText.reverse();
		System.out.println("Reversed, it reads " +reversedText);
		
		if (originalText.contentEquals(reversedText))
			{
			System.out.println("It's a palindrome!\n");
			
			return true;
			}
		else
			{
			System.out.println("Alas, it's not a palindome.\n");
			return false;
			}
		}
	}

		
	

