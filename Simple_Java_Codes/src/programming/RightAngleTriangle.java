package programming;

public class RightAngleTriangle 
{
public static void main(String[] args) {
	char a='A';
	int times=5;
	System.out.println(a);
	for(int i=1;i<times;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(++a);
		}
		System.out.println();
	}
	
	
//	//while(times!=0)
//	{
//	
//		a=++a;
//		System.out.println(a);
//		times=--times;
//	}
}
}
