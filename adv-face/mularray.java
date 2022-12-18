import java.util.*;
public class mularray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of the array");
        int m =sc.nextInt();
        System.out.println("Enter the col size of the array");
        int n =sc.nextInt();
        int arr[][] = new int[m][n];

        System.out.println("Enter the array 1");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the row size of the array");
        int p =sc.nextInt();
        System.out.println("Enter the col size of the array");
        int q =sc.nextInt();
        if(n!=p){
            System.out.println("Multiplication not possible");
        }

        else{
            int brr[][] = new int[p][q];
            int crr[][] = new int[m][q];
            System.out.println("Enter the array 1");
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    brr[i][j]=sc.nextInt();
                }
            }
            int sum=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<q;j++){
                    for(int k=0;k<p;k++){
                        sum=sum+arr[i][k]*brr[k][j];
                    }
                    crr[i][j]=sum;
                    sum=0;
                }
            }
            System.out.println("Result Matrix");
            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++){
                    System.out.println(crr[i][j]);
                }
            }
        }

    }
}
