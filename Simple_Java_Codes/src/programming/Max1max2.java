package programming;

public class Max1max2 
{
	public static void main(String[] args) 
	{
     int []a= {1,2,3,4,5,9};
     int max=a[0];
     int min=a[5];
     int sum=0;
     for(int i=0;i<a.length;i++)
     {
    	 sum+=a[i];
      if(max<a[i])
      {
    	  max=a[i]; 
      }
      else if(min>a[i])
      {
    	  min=a[i];
      }

     }
     System.out.println("max= "+max);
         System.out.println("min= "+min);
         System.out.println(sum);
     }
}

//for(int j=0;j<i;j++)
//{
//  if(min>a[j])
//  {
//	  min=a[j];
//  }
//}















