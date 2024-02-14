package programming;

public class LengthySubstring {
	    public static void main (String[]args)
	    {
	        String series="abcdabacdef";
	        for(int i=0;i<series.length();i++)
	        {
	        	for(int j=0;j<i;j++)
	        	{
	             if(series.charAt(j)==series.charAt(j+1))
	             {
	                System.out.print(" ");
	             }
	             else
	             {
	            System.out.print(series.charAt(i));
	             }
	    }   }   }}
	    
	 
	 

