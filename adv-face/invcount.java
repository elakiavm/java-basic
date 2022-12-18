import java.util.*;
public class invcount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int m=0;m<n;m++){
            for(int j=1;j<n;j++){
                // System.out.println(arr[m]+"  "+arr[j]);
                if(arr[m]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
