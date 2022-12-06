import java.util.*;
public class diffdigit {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int res,j=1,count=0;
        int n = sc.nextInt();
        int d =sc.nextInt();
        for(int i=10;i<n+1;i++){
            res=i-j;
            if(res>=d){
                count=count+1;
            }
            j++;
        }
        System.out.println(count);

    }
}
