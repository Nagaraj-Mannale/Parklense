package programming;

import java.util.Arrays;

public class Findovelsandconsonents 
{
	   public static void main(String[]args)
	   {
	    String word="Nagaraj mannale";
	    String[]raj=word.split(" ");
	    System.out.println(Arrays.toString(raj));
	     word=word.toLowerCase(); 
	     word=word.replace(" ", "");
	     
	     
	    StringBuilder ovels=new StringBuilder();
	    StringBuilder consonents=new StringBuilder(); 
	    for(int i=0;i<word.length();i++)
	    {
	     char ch=word.charAt(i);
	     if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
	     {
	      consonents.append(ch);
	     }    
	     else
	     {
	     ovels.append(ch);
	     }
	    }
	    System.out.println("ovels are:--"+ovels+" consonents are:--"+consonents);
	   }
	 }
	

