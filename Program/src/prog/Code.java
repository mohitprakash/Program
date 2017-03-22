package prog;

import java.util.Scanner;

public class Code 
{
	public static void main(String[] args) 
	{
		int b;
		String s,c;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		b = Integer.parseInt(s);
		c = sc.nextLine();
		if(b<=10 && c.length()<=15)
		{
			System.out.println(b*2);
			System.out.println(c);
		}
		else
		{
			System.out.println("Please enter number less that 10 and string less than 15");
		}
		sc.close();	
	}
		
}


