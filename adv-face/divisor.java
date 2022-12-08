import java.util.*;
public class divisor {
    static int N=10000;
    void div(int b){
        int n=b;
        int a[] = new int[N+1];
        int k=0;
        int res = 0;
        for (int j=1;j<=n;j++){
            if(n%j==0){
                a[k]=j;
                System.out.println(j);
                k++;
            }
        }
        int len = k;
        if(len>=4){
            
            System.out.println("4 factors");
        }

    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        divisor d = new divisor();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            d.div(a[i]);
            System.out.println();
            System.out.println();
        }
    }
}
