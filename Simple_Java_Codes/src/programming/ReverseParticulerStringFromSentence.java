package programming;

import java.util.Arrays;

public class ReverseParticulerStringFromSentence {
    public static void main(String[] args) {
        String names = "anil sandeep naga arun";
        String[] words = names.split(" ");

        for (int i = words.length - 1; i >= 0; i--) 
        {
            if (words[i].equals("naga"))
            {
                for (int j = words[i].length() - 1; j >= 0; j--) 
                {
                    System.out.print(words[i].charAt(j));
                }
                
            } 	
            else 
            {
                System.out.print(words[i]);
            }

           System.out.print(" ");
        }

        
        
    }
}
