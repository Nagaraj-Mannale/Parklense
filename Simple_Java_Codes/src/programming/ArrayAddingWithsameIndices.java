package programming;

import java.util.Arrays;

public class ArrayAddingWithsameIndices {
	 public static void main(String[]args)
	 {
	  int []a={1,2,3};
	  int []b={1,2,3};
	  int []c=new int[b.length];
	  for(int i=0;i<a.length;i++)
	   {
	   c[i]=a[i]+b[i];
	   }
	  System.out.println(Arrays.toString(c));
	 }
}
