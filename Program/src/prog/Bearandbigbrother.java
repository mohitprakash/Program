package prog;

import java.util.Scanner;

public class Bearandbigbrother 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int j=0;
		while(a<=b)
		{
			a=3*a;
			b=2*b;
			j++;
		}
		System.out.println(j);
		sc.close();
		
			
		
		
	}

}
