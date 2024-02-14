package programming;

public class Primary_num
{
	public static void main(String[] args) {
		
	
int a[]= {4,5,6,7,8,9};
System.out.println("Given Numbers are prime");
for(int b:a)
{
	int count=0;
	for(int i=1;i<=9;i++)
	{
	
	if(b%i==0)
	{
		count++;
	}
	
   }
	
	if(count==2)
	{
	System.out.println(b);
	}}
}}
 