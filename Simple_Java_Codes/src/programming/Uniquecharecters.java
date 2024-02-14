package programming;
public class Uniquecharecters
{
 public static void main(String[]args)
 {
  String a="hello world";
  for(int i=0;i<a.length();i++)
  {
      int count=0;
   for(int j=0;j<a.length();j++)
   {
    if(a.charAt(i)==a.charAt(j)&& i!=j)
    {
     count++;
     break;
    }
    
   }
   if(count==0)
    {
    System.out.print(a.charAt(i));
    }
  } 
 }
}