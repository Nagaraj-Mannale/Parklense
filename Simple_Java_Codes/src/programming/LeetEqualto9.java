package programming;

class LeetEqualto9 {
    int sum=9;
    int add=0;
    int arr[]={2,7,11,15};
    int ans[]=new int[2];
    public int [] target()
    {
        for(int j=0;j<arr.length;j++)
        {       
          for(int i=1;i<arr.length;i++)
           {
             if(arr[j]+arr[i]==9)
             {
              ans[0]=j;
              ans[1]=i;
              
             }
            
            }
        }
        return ans;
    }
    

public static void main(String[]args)
{
    LeetEqualto9 sol=new LeetEqualto9();
    int[] res=sol.target();
    System.out.println("["+res[0]+","+res[1]+"]");
}
}
