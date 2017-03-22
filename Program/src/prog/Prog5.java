package prog;

import java.util.Scanner;

public class Prog5 
{
	public static void main(String[] args) 
	{
		int s,b=1;
		Scanner sc = new Scanner(System.in);
		s =  sc.nextInt();
		for(int i=1; i<=s; i++)
		{
			b = b*i;
			System.out.println(b);
		}
		sc.close();
	}

}
