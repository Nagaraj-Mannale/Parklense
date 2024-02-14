package programming;

public class Factorial {
public static void main(String[] args)
{
int f1=6;
int f3=1;
//int f2=0;
for(int i=f1-1;i>=1;i--)
{

  int f2=f1*f3;
      f1=f2;
      f3=i;
	
	
}
System.out.println(f1);
}
}
