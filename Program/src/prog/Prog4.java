package prog;

import java.util.Scanner;

public class Prog4 
{
	public static void main(String[] args) 
	{
		String s;
		String s_backup;
		String b = "";
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		s_backup = s;
		for(int i=(s.length()-1); i>=0; i--)
		{
			char bc = s.charAt(i);
			b = b + bc;	
		}
		System.out.println(b);
		if(s_backup.equalsIgnoreCase(b))
		{
			System.out.println("Yes");	
		}
		
		sc.close();
		
	}

}
