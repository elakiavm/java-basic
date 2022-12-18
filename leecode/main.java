import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class faceprep {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        while(a!=-1){
            arr.add(a);
            a=in.nextInt();
        }
        int k=in.nextInt();
        int i=0,f=0;
        while(f==0){
            int l=i+k;
            for(int j=l-1;j>=i;j--){
                if(j<arr.size()){
                    System.out.println(arr.get(j));
                }
                else{
                    f=1;
                }
            }
            i=i+k;

        }

    }
}