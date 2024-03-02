package programming;

public class Febonacci {
	

	     public static void main(String []args){
	       int a=0,b=1,c=11;
	       
	       for(int i=0;i<=11;i++)
	       {
	    	   if(a<=c)
	    	   {
	           System.out.print(a+" ");
	           int temp=a+b;
	           a=b;
	           b=temp;
	    	   }
	    	   else
	    	   {
	    		   break;
	    	   }
	       }
	     }
	}
	

