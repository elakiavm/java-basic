import java.util.*;

class binaryArray {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int n=sc.nextInt();
		    int count_0=0,count_1=0;
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        if(arr[i]==0)
		            count_0++;
		        if(arr[i]==1)
		            count_1++;   
		        
		    }
		    
		    int new_arr[]=new int[n];
		    for(int i=0;i<count_0;i++)
		        new_arr[i]=0;
		    for(int i=count_0;i<n;i++)
		        new_arr[i]=1;
		    for(int i=0;i<n;i++) 
		        System.out.print(new_arr[i]+" ");
		    System.out.println();
		        
		      
		    t--;
		}
	}
}