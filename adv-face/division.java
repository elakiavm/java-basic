import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class division
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N=10;
		int[] nums=new int[N+1];
		int ans[]=new int[N+1];
		for(int i=1;i<=N;i++){
		    for(int j=i;j<=N;j+=i){
		        nums[j]++;
		        ans[j]++;
		    }
		}
		for(int i=1;i<=N;i++){
		    for(int j=i;j<=N;j+=i){
		        if(nums[j/i]==4) 
                    ans[j]=Math.min(ans[j],ans[i]);

		    }
		}
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    System.out.println(ans[n]);
		}
	}
}
