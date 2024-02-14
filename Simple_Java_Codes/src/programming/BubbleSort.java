package programming;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int[]c= {1,4,3,6};
	
		for(int k=0;k<c.length;k++)
		    {
		      for (int l=0;l<k;l++)
		      {
		      if(c[k]<c[l])
		       {
		        int temp=c[k];
		        c[k]=c[l];
		        c[l]=temp;
		     }   
		      } 
		     }
			System.out.println(Arrays.toString(c));
}
}
