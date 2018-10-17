import java.util.Scanner;

public class StringManipulatorMain 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		boolean run = true;
		while (run)
		{
			StringManipulator test = new StringManipulator();
			
			System.out.print("Please enter which method (noVowel or reverse) you would like to run: ");
			String choice = in.next();
			choice = choice.toLowerCase();
			in.nextLine();
			
			while (!choice.equals("novowel")  && !choice.equals("reverse"))
			{
				System.out.print("\nPlease enter which method (noVowel or reverse) you would like to run: ");
				choice = in.next();
				choice = choice.toLowerCase();
				in.nextLine();
			}
			
			if (choice.equals("novowel"))
			{
				System.out.print("\nPlease print your word or sentence. "
						+ "Please press enter twice when finished your selection: ");
				String word = in.nextLine();
				in.nextLine();
				
				System.out.println(test.noVowels(word));
			}
			
			else
			{
				System.out.print("\nPlease print your word or sentence. " +
						"Please press enter twice when finished your selection: ");
				String word = in.nextLine();
				in.nextLine();
				
				System.out.println(test.reverse(word));
			}
			
			System.out.print("\nWould you like to use this program again? " +
					"Enter \"Yes\" if you wish to continue: ");
			String option = in.next();
			in.nextLine();
			
			System.out.println("");
			
			option = option.toLowerCase();
			
			if (option.equals("yes"))
			{
				run = true;
			}
			
			else if (option.equals("no"))
			{
				run = false;
			}
			
			else
			{
				while (!option.equals("yes") && !option.equals("no"))
				{
					System.out.print("\nWould you like to use this program again? " +
							"Enter \"Yes\" if you wish to continue: ");
					option = in.next();
					in.nextLine();
					
					System.out.println("");
					
					option = option.toLowerCase();
					
					if (option.equals("yes"))
					{
						run = true;
					}
					
					else if (option.equals("no"))
					{
						run = false;
					}
				}
			}
		}
		
		in.close();
	}
}
