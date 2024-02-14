package programming;
public class fibonnacy 
{
	public static void main(String[] args)
	{
     int fib1=0;
     int fib2=1;
     int count=0;
     for(int i=1;i<=10;i++)
     {
    	 count++;
    	 int fib=fib1+fib2;
    	 fib1=fib2;
    	 fib2=fib;
    	 System.out.println(fib);
     }
     System.out.println(count);
	}
}