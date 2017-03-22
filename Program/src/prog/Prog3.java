package prog;

import java.util.Scanner;

public class Prog3 
{
	public static void main(String[] args)  
	{
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		for(int i=0; i<s.length(); i++)
		{
		 char b = s.charAt(i);
		 int j = (int) b;
		 if(j>=65 || j<=90)
		 {
			 j = j + 32;
		 }
		 else if(j>=97 || j<=122)
		 {
			 j = j - 32 ;
		 }
		 System.out.print(j);
		 char a = (char) j;
		 System.out.print(a);
		}
		sc.close();
	}

}
