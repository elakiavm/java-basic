import java.util.*;
public class pos_neg_array {
   public static void main(String[] args){
    int count_pos= 0,count_neg = 0;

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
        if(arr[i]>0){
            count_pos = count_pos + 1 ;
        }
        else if(arr[i]<0){
            count_neg = count_neg + 1;
        }
        else{
            System.out.println("0 is present ");
        }

    }
    System.out.println("+ve is present "+count_pos);
    System.out.println("-ve is present "+count_neg);
    for(int i=0;i<n;i++){
        System.out.println("Elements : "+arr[i]);
    }
   } 
}
/*


*/
