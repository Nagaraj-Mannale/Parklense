package programming;

public class ZigzagPrint {
	     public static void main(String []args)
	     {
	        String zigzag="PAHNAPLSIIGYIR";
	        System.out.println(zigzag);
	        for (int i=0;i<zigzag.length();i++)
	        {
	         if(i<=(zigzag.length()*.3))
	         {
	               System.out.print(zigzag.charAt(i)+" ");
	         if(i==(zigzag.length()*.3))
	            {
	             System.out.println();
	            }
	         }
	         else if(i>=(zigzag.length()*.3) &&i<(zigzag.length()*.7))
	         {
	             System.out.print(" "+zigzag.charAt(i));
	         }
	         else
	         {
	             System.out.print(zigzag.charAt(i));
	         }
	          //System.out.println();
	        }
	     
	}

}
