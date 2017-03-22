package prog;

import java.util.Scanner;

public class Imp1 
{
	public static void main(String[] args) 
	{
		String s;
		int a=0,e=0,i=0,o=0,u=0;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		for(int c=0; c<s.length(); c++)
		{
			char b = s.charAt(c);
			int d = (int) b;
			System.out.println(d);
			if(d==a)
			{
				a++;
				System.out.println(a);
			}
			else if(d==e)
			{
				e++;
				System.out.println(e);
			}
			else if(d==i)
			{
				i++;
				System.out.println(i);
			}
			else if(d==o)
			{
				o++;
				System.out.println(o);
			}
			else if(d==u)
			{
				u++;
				System.out.println(u);
			}
		}
		sc.close();
	}

}
