import java.util.*;
public class mango {
   public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[r][c];
        int count=0,loc_i=0,loc_j=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                count++;
                if(count==n){
                    loc_i=i;
                    loc_j=j;
                }
            }
        }
        int l=0;
        int k=0;
        for(l=0;l<c;l++){
            if(l==loc_i&&k==loc_j){
                System.out.println("Yes") ;
                break;        
            }
        }
        int flag=0;
        if(flag==0){
            int j=0;
            for(int i=0;i<r;i++){
                if(l==loc_i&&k==loc_j){
                    System.out.println("Yes") ;
                    break;
                }
            }
            flag=1;
        }
        else if(flag==1){
            int j=c-1;
            for(int i=0;i<r;i++){
                if(l==loc_i&&k==loc_j){
                    System.out.println("Yes") ;
                    break; 
                }
            }
        }
        if(loc_i!=0 && loc_j!=0){
            System.out.println("No");
        }
   }
}
