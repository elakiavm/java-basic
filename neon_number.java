import java.util.*;
public class neon_number {
    public static void main(String[] args){
        int rem,result=0;
        // int[] arr = new int[n];
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter the number ");
        // int i = input.nextInt();

        for (int i=0; i<=12;i++){
            int sq = i*i;
            while(sq!=0){
                rem = sq % 10;
                sq = sq/10;
                result = result + rem;
            }
            if(i==result){
                System.out.println("Neon number "+result);
        }
    //        System.out.println(i);
      }
    }
}
