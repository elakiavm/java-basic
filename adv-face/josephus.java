import java.util.*;
public class josephus{
    static int josephusfun(int n,int k){
        if(n==1) 
            return 1;

        else{
            return (((josephusfun(n-1,k)+k-1)%n)+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int j = 2;
        int res =0;
        res =josephusfun(a,j);
        System.out.println(res);
    }
    
}