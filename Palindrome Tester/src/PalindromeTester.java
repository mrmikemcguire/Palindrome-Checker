import java.util.Scanner;

public class PalindromeTester
	{
	static String originalText;
	
	public static void main(String[] args)
		{
		System.out.println("Please enter your word(s) to be tested: ");
		Scanner userInput = new Scanner(System.in);
		String originalText = userInput.nextLine();
		userInput.close();
		originalText = originalText.toLowerCase();
		originalText = originalText.replaceAll("[^\\p{L}\\p{Nd}]+", "");
		System.out.println("Your stripped text is " + originalText);
		originalText = originalText.replaceAll("[^\\p{L}\\p{Nd}]+", "");		
		System.out.println("Your text without spaces is " + originalText);
		
		StringBuffer reversedText = new StringBuffer(originalText);
		reversedText = reversedText.reverse();
		System.out.println("Reversed, it reads " + reversedText);
		System.out.println();
		
		if (originalText.contentEquals(reversedText))
			{
			System.out.println("It's a palindrome!");
			}
		else
			{
			System.out.println("Alas, it's not a palindome.");
			}
		}

	}
