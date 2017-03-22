package prog;

import java.util.Scanner;

public class Inter1 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		a =  sc.nextInt();
		b = sc.nextInt();
		int c = (a*a + ((a+1)*(a+1)));
		int d = (((b-1)*(b-1)) + b*b);
		int e = (c+d);
		System.out.println(e);
		sc.close();
		
	}

}
