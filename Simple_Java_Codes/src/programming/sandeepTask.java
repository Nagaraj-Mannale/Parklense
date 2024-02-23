package programming;

import java.util.ArrayList;

public class sandeepTask 
{
	

	    public static void main(String[] args) {
	     ArrayList<Integer> al=new ArrayList<>();
	     for(int i=1;i<=10;i++){
	         int count=0;
	         for(int j=1;j<=i;j++)
	         {
	           if(i%j==0)
	           {
	               count++;
	           }
	         }
	         if(count==2)
	         {
	             al.add(i);
	         }
	     }
	     System.out.print(al);
	     ArrayList<Integer> fib=new ArrayList<>();
	     for(int i=0;i<al.size();i++)
	     {    int fact=al.get(i);
	         for(int j=1;j<al.get(i);j++)
	         {
	             fact=fact*j;
	         }
	         
	     }
	    }
	    
	}



