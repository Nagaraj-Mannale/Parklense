package programming;
import java.util.ArrayList;
public class AddwordsaternativelyBytwoarrays {

	
	       	public static void main(String[] args) {
		          String a = "apple mango jackfruit"; 
		          String [] Awords=a.split(" ");
		          String b ="kiwi grapes peach";
		          String [] Bwords=b.split(" ");
		          ArrayList<String> result=new ArrayList<>();
		          
		        	  for(int i=0;i<Awords.length;i++)
		        	  {
		        		  result.add("'"+Awords[i]+"'");
		        		 // System.out.println();
		        		  for(int j=0;j<=i;j++)
		        		  {
		        			 if(i==j)
		        			 { 
		        				result.add("'"+Bwords[j]+"'");
		        				 break;
		        			 }
		        		  }
		        	  }
		          System.out.println(result);
		           
		        }
		



}
