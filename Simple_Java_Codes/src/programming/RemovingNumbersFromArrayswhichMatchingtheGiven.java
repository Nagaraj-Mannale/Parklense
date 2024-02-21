package programming;



public class RemovingNumbersFromArrayswhichMatchingtheGiven
{
	public static void main(String[]args)
	 {
	
	 System.out.print("[");
	  int []num={1,2,3,4,1,4,5,1,1};
	  for(int i=0;i<num.length;i++)
	  {
	   if(num[i]!=1)
	   {
	   System.out.print(num[i]);
	   if(num[i]!=num.length-4 )
	   {
		   System.out.print(",");
	   }
	   }
	  }
	  System.out.println("]");
	 
	 }
	
}
