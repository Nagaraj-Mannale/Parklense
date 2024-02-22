package programming;

import java.util.ArrayList;

public class GIvenNumberisPrimeButNotfebanacci 
{
	    public static void main(String[] args) {
	        int num = 7;
	        int count=0;
	        for(int i=1;i<=num;i++){
	  	          if(num%i==0) {
	  	         	 count++;  }    }
	  	     	  if(count==2)
	  	            {
	                 ArrayList<Integer> feb = new ArrayList<>();
	                   int a = 0, b = 1;
       	             for (int i = 0; i < num; i++) {
	                     feb.add(a);
	                     int temp = a + b;
	                            a = b;
	                            b = temp;          }
	                 int count1=0;
	                 for(int i=0;i<feb.size();i++) {
            	         if(feb.get(i)!=num) {
	                     count1++;           }     }      
	  	          if(count!=feb.size()) {
	            System.out.println(1);}
	  	        else {
	           System.out.println(0);}}
	  	          else{ System.out.println(0);
	  	        	  
	  	          }}}
	          
	

	
