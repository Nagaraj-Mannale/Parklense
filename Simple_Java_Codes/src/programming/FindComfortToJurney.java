package programming;

public class FindComfortToJurney
{
	public static void main(String[] args) {
		
	
	  {
		     int people=26;
		     int comfort=5;
		     if(people%comfort==0)
		     {
		     int needed_car=people/comfort;
		     System.out.println("for"+ people + " peopele to travel comfortably "+needed_car +" cars should be needed");
		     }
		     else
		     {
		         int needed_car=(people/comfort)+1;
		    System.out.print("for "+ people+ " peopele to travel comfortably "+needed_car +" cars should be needed");
		            }
}}
}