import java.util.*;
public class divide0and1 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int arr[] = new int[10];
    int i,count=0,j;
    int n = sc.nextInt();
    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++){
        if(arr[i]==0){
            count+=1;
        }
    }
    System.out.println("----------------");

    while(count!=0){
        System.out.println("0");
        count-=1;
    }
    j=n-count;
    while(j!=0){
        System.out.println("1");
        j-=1;
    }


    }
}

