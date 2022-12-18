import java.util.*;
public class sortmerge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array size");
        int n = sc.nextInt();
        System.out.println("Enter the first array size");
        int t = sc.nextInt();
        int arr[] = new int[n];
        int brr[] = new int[t];
        int res[] = new int[n+t];
        System.out.println("Enter the 1 array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the 2 array elements");
        for(int k=0;k<t;k++){
            brr[k]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            res[j]=arr[j];
        }
        int m=0;
        int c=n+t;
        for(int l=n;l<c;l++){
            res[l]=brr[m];
            m++;
        }
        Arrays.sort(res);
        for(int k =0;k<n+t;k++){
            System.out.print(res[k]);
        }
        int r = 0;
        if(c%2==0){
            r=c/2;
            System.out.println("Median : "+(res[r]+res[r+1])/2);
        }
        else{
            r=(c+1)/2;
            System.out.println("Median :"+res[r]);
        }


    }
}
