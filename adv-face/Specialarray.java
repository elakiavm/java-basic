import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Specialarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0&&n<=5){
            int[] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                int result = 1;
                for(int j=0;j<n;j++)
                if(arr[i]!=arr[j])
                {
                    result=result*arr[j];
                }
    
            System.out.println(result);
    
            }
        }
    }
}
