
public class StringManipulator 
{
	String str1 = "";
	
	public StringManipulator()
	{
		str1 = "";
	}
	
	public String noVowels(String str2)
	{
		for (int i = 0; i < str2.length(); i++)
		{
			if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || 
					str2.charAt(i) == 'o' || str2.charAt(i) == 'u' || str2.charAt(i) == 'A' ||
					str2.charAt(i) == 'E' || str2.charAt(i) == 'I' || str2.charAt(i) == 'O' ||
					str2.charAt(i) == 'U')
				str1 += "*";
			else
				str1 += str2.charAt(i);
		}
		
		return str1;
	}
	
	public String reverse(String str3)
	{
		for (int i = str3.length()-1; i >=0; i--)
		{
			str1 += str3.charAt(i);
		}
		
		return str1;
	}
}
