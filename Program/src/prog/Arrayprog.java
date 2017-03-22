package prog;

import java.util.Scanner;

public class Arrayprog 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n<100)
		{
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int j=(a.length-1);j>=0;j--)
		{
			System.out.println(a[j]);
		}
		sc.close();
		}
		else
		{
			System.out.println("Enter array less than 100");
		}
	}

}
