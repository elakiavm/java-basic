import java.util.*;

public class linear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        int key =sc.nextInt();
        int result=0,i;
            for(i=0;i<n;i++){
                if(arr[i]==key)
                {
                 result=1;   
                }

            }
            if(result==1){
                System.out.print(key+" is present at location "+(i+1)+".");
            }
            else{
                System.out.println("Not found");
            }

            
        }
    
}
