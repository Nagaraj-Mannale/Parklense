package programming;

public class PrintVowelsAndConsonents
{
		
		public static void main(String[] args) {
			
			
			String str="Arun chandakavathe".replace(" ", "");
			
			String nstr=str.toLowerCase();	
			System.out.println(nstr);
			
			int vowelscount=0;
			int consonantscount=0;
		   StringBuilder ConsonantsStr = new StringBuilder();
		   StringBuilder OvelsStr = new StringBuilder();
			for(int i=0;i<nstr.length();i++) 
			{
				char ch=nstr.charAt(i);
				
				if(!(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') )
				{   
					ConsonantsStr.append(ch);
					consonantscount++;
				}
				else 
				{
					OvelsStr.append(ch);
					vowelscount++;
				}
			}
			
			System.out.println("consonant count"+consonantscount+"the value is : "+ConsonantsStr);
			System.out.println("Vowels count"+vowelscount+"The values are :"+ OvelsStr);
			System.out.print("Ovels without duplicate:- ");
			for(int i=0;i<OvelsStr.length();i++)
			{
				int count=0;
				for(int j=0;j<i;j++)
				{
					if(OvelsStr.charAt(i)==OvelsStr.charAt(j))
					{
						count++;
					}
				}
				
				if (count==0)
				{
					
					System.out.print(OvelsStr.charAt(i));
				}
			}
			
			
			
		}

	}

