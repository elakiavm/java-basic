import java.util.*;

class ans_special {
    public static int[] findspecialproduct(int arr[], int n){
        int prod_arr[]=new int[10];
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    prod=prod*arr[j];
                }
            }
            prod_arr[i]=prod;
        }
        return prod_arr;
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int ans[]=new int[n];
		ans=findspecialproduct(arr,n);
		for(int i=0;i<n;i++){
		    System.out.println(ans[i]);
		}
	}
}