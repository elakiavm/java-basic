import java.util.*;
public class jagged_array {
    public static void main(String[] args){
        // Scanner input = new Scanner(System.in);

        // System.out.println("Enter the array size:");
        // int n = input.nextInt();

        int arr[][] = {
            {2,6,4},
            {3,5},
            {23,34,56,8}
        };
        int max;
        // Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            max = arr[i][0];
            for(int j=0;j<arr[i].length; j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println("\n");
            System.out.println("Element Max " + max);
        }

    }
}