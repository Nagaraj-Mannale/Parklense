package programming;

import java.util.Arrays;

public class NumberIsPrimeAndNotFibonacci {
    public static void main(String[] args) {
        int fib1 = 0;
        int fib2 = 1;
        int n = 6;
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            int fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
            c[i] = fib;
        }

       int[] prime = {};

                   
        for (int i = 2; i <= 13; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) 
            { 
            
                if (i % j == 0) 
                {
                    
                }
            }
                int f=0;
            if (count == 2) 
            {
            	f=i;
            	return;	
            }
            
            for(int k=0;k<=c.length-1;k++)
            {
            	System.out.println(f);
            	if(f!=c[i])
            	{
            		System.out.println(f);
            	}
            }
            
            
        }

        System.out.println("fibonaccy array: " + Arrays.toString(c));
       
    }
}
