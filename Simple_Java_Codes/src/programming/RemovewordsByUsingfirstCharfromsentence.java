package programming;

import java.util.ArrayList;

public class RemovewordsByUsingfirstCharfromsentence {
public static void main(String[] args) {
	           String a = "The faverate dish of all ages was apple pie";
	          String [] words=a.split(" ");
	          //StringBuilder str=new StringBuilder();
	          ArrayList<String> b=new ArrayList<>();
	          for(int i=0;i<words.length;i++)
	          {
	              for(int j=0;j<1;j++)
	              if(words[i].charAt(j)!='a')
	              {
	                  b.add(words[i]);
	                  
	              }
	          }
	          System.out.println(b);
	           }
	        }
	


