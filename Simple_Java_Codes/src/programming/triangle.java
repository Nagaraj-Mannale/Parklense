package programming;

import java.util.Scanner;

public class triangle 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	
	int a=sc.nextInt();
	for(int i=10; i<=a;i--)
	{
	 for(int j=10;j<=i;j--)
	 {
		 System.out.print(j);	 
	 }
	 System.out.println();
	}
}
}
