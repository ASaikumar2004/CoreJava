package Strings;

public class CharacterFrequency {

	public static void main(String[] args) {

		String s = "javadev".toUpperCase();

		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			boolean counted = false;
			for (int j = 0; j < i; j++)
			{
				if (s.charAt(j) == ch) 
				{
					counted = true;
					break;
				}
			}
			if (!counted) {
				int count = 0;
				for (int j = 0; j < s.length(); j++)
				{
					if (s.charAt(j) == ch) 
					{
						count++;
					}
				}
				System.out.println(ch + "-" + count);
			}
		}
	}
}
