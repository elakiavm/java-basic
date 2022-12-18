import java.util.*;
import java.lang.Math;
public class sq_root_array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = input.nextInt();

        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array element :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Square root element :"+Math.sqrt(arr[i]));
        }
        for(int i=0;i<n;i++){
            System.out.println("Elements : "+arr[i]);
        }
    }
}
