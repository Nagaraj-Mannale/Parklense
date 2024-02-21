package programming;

public class MatchingTheStringByGivenIndices {

  
        
    public static void main(String []args)
       {
          String c= "tonyPh";
          String a="4 3 0 5 1 2";
          String [] ch=a.split(" ");
          for(int i=0;i<ch.length;i++)
           {
        	int b=Integer.parseInt(ch[i]);
            for(int j=0;j<c.length();j++)
            {
                if(b==j)
                {
                    System.out.print(c.charAt(j));
                }
            }
           }
    }}
