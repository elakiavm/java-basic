import java.lang.*;
import java.util.*;

class majority
{
    static void  FindMajority(int[] arr){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count= map.get(arr[i])+1;
                if(count>arr.length/2){
                    System.out.println(arr[i]);
                    return;
                }
                else{
                    map.put(arr[i],count);
                }
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(-1);
    }
 
    public static void main(String args[]){
          Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            FindMajority(arr);
        }
    }
}