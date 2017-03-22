package prog;

public class Inter 
{
	public static void main(String[] args) 
	{
		int a = 6;
		int b = 5;
		System.out.print(a  + "" + b);
		a = a+b; // 11
		b = a-b; // 6 True
		a = a-b; // 5 True
		System.out.print(a);
		System.out.print(b);
		
		
	}

}
