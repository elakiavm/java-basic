// rat maze
import java.util.*;

public class ratmice {

    static boolean isSafe(int arr[][],int i,int j,int r,int c) {
        if(i < 0 || i >= r) {
            return false;
        }
        if(j < 0 || j >= c) {
            return false;
        }
        if(arr[i][j] == 1){
            return true;
        }
        else {
            return false;
        }
    }
    static boolean fun(int arr[][],int i,int j,int r,int c) {
        if(arr[0][0] == 0) {
            return false;
        }
        if(i == r-1 && j== c-1) {
            return true;
        }
        if(isSafe(arr,i,j+1,r,c)) {
            if(fun(arr,i,j+1,r,c)) return true;
        }
        if(isSafe(arr,i+1,j,r,c)) {
            if(fun(arr,i+1,j,r,c)) return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r,c;
        r = sc.nextInt();
        c = sc.nextInt();

        int arr[][] = new int[r][c];

        for(int i=0; i < r; i++) {
            for(int j=0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        if(fun(arr,0,0,r,c)) {
            System.out.println("reached destination : ");
        }
        else {
            System.out.println("Cannot reach destination : ");
        }




    }
}