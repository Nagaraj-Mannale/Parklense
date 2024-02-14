package programming;

import java.util.Arrays;

public class CountUniqueValues 
{
	public static void main(String[]args)
	 {
	 int count=0;
	 System.out.print("[");
	  int []num={1,2,3,4,1,4,5,1,1};
	  for(int i=0;i<num.length;i++)
	  {
	   if(num[i]!=1)
	   {
	   count++;
	   System.out.print(num[i]);
	   if(num[i]!=num.length-4 )
	   {
		   System.out.print(",");
	   }
	   }
	  }
	  System.out.println("]");
	  System.out.println(count);
	 }
	
}
