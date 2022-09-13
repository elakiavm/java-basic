import java.util.Scanner;
public class second_large{

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    int temp,i,j;
    int n =sc.nextInt();
    if(n>2){
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }

        if(a[n-1]==a[n-2]){
            System.out.print("No second large number");

        }
        else{
            System.out.println("Large number: "+a[n-2]);
        }

    }
    else{
        System.out.print("Please enter more than 2 as size");
    }
    

    }   
}