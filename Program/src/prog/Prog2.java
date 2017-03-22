package prog;

import java.util.Scanner;

public class Prog2 
{
	public static void main(String[] args) 
	{
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		for(int i=0; i<s.length(); i++)
		{
			char b = s.charAt(i);
			if(Character.isLowerCase(b))
			{
				char c = Character.toUpperCase(b);
				System.out.print(c);
			}
			else if(Character.isUpperCase(b))
			{
				char c = Character.toLowerCase(b);
				System.out.print(c);
			}
		}	
		sc.close();
		
	}

}
