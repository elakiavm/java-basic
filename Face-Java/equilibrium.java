import java.util.*;
public class equilibrium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[10];
        int i,j;
        for(i=n;i<0;i++){
            for(j=0;j<n;j++){
                if(a[i]<a[j]){
                    a[j]=a[j]+a[j+1];
                }
                else if(a[j]== a[i]){
                    

                }
            }
        }
    }
}
