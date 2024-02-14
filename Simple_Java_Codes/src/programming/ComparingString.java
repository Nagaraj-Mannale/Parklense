package programming;

public class ComparingString 
{
public static void main(String[] args) {
	 String s1="Anil";
     String s2="anillll";
     String s=s1.toLowerCase()+s2;
   
     for (int i = 0; i < s.length(); i++) 
     {                     
         int count = 0;
         for (int j = 0; j < i; j++) {
             if (s.charAt(i)==s.charAt(j)) {
                 count++;
                 break;              }
         }

         
         if (count == 0) {
             System.out.print(s.charAt(i));
         }
        
     }}}


