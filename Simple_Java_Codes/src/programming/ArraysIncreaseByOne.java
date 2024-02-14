package programming;

import java.util.Arrays;

public class ArraysIncreaseByOne 
{
	   
	public static void main(String[]args)
	    {
	        int []arr ={1,2,3};
	        arr[arr.length-1]++;
	        System.out.println(Arrays.toString(arr));
	        
	//------------------------------------------OR----------------------
	        for(int i=0;i<arr.length;i++)
	        {
	            if(i==arr.length-1)
	            {
	                arr[arr.length-1]++;
	               break;
	            }
	            
	        }
	        System.out.println(Arrays.toString(arr));
	    }
}

