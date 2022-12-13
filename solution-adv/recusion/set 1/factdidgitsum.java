/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main {
    public static int[] fact={1,1,2,6,24,120,720,5040,40320,362880};
    public static void find_num(Long n, List<Integer> ans, int d){
        if(n==0)
            return;
        if(fact[d]>n)
            find_num(n,ans,d-1);
        else{
            n=n-fact[d];
            ans.add(d);
            find_num(n,ans,d);
        }
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-- > 0){
		    Long n=Long.parseLong(br.readLine());
		    List<Integer> ans= new ArrayList<>();
		    find_num(n,ans,9);
		    Collections.reverse(ans);
		    for(int x:ans){
		        System.out.print(x);
		    }
		    System.out.println();
		}
	}
}