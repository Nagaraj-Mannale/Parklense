package programming;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArraysort {

	

	     public static void main(String []args){
	       int [] []a={{1,2,4},{7,9,3},{5,6,8}};
	       ArrayList<Integer> b=new ArrayList<>();
	       for(int i=0;i<a.length;i++)
	       {
	           for(int j=0;j<a[i].length;j++)
	           {
	               b.add(a[i][j]);
	           }
	       }
           int []c=new int[b.size()];
           for(int i=0;i<b.size();i++)
           {
        	   c[i]=b.get(i);
           }
           System.out.println(Arrays.toString(c)); 
           for(int k=0;k<c.length;k++)
           {
        	   for(int l=0;l<k;l++)
        	   {
        		   if(c[l]>c[k])
        		   {
        			   int temp=c[l];
        			   c[l]=c[k];
        			   c[k]=temp;
        		   }
        	   }
           }
	       System.out.println(Arrays.toString(c));
	       
	     
	}
}
