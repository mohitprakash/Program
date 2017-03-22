package prog;

import java.util.Scanner;

public class Arrayprog1 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		String tmpDataArray[] = data.split(" ");
		int a[] = new int[tmpDataArray.length];
		int b[] = new int[tmpDataArray.length];
		int c[] = new int[tmpDataArray.length];
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		/*for(int j=0; j<a.length; j++)
		{
			System.out.println(a[j]);
		}*/
		for(int i=0; i<n; i++)
		{
			b[i] = sc.nextInt();
		}/*
		for(int j=0; j<b.length; j++)
		{
			System.out.println(b[j]);
		}*/
		for(int i=0; i<n; i++)
		{
			c[i] = a[i]+b[i];
		}
		for(int k=0; k<c.length; k++)
		{
			System.out.print(c[k]);
		}
		sc.close();
	}

}

/*class HistogramChart {

	   public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);

	      System.out.println("Please enter data separated by spaces: ");
	      String data = scan.nextLine();

	      String tmpDataArray[] = data.split(" ");

	      int dataArray[] = new int[tmpDataArray.length];
	      for (int i = 0; i < dataArray.length; ++i) {
	          dataArray[i] = Integer.parseInt(tmpDataArray[i]);
	      }
	}*/


