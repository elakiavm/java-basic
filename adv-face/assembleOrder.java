import java.util.*;
public class assembleOrder {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int b[] = new int[n];
        int a[] = new int[n];
        int arr[] =new int[n];
        int ncount=0,pcount=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                b[pcount]=arr[i];
                pcount++;
            }
            else{
                a[ncount]=arr[i];
                ncount++;
            }
        }
        System.out.println("\n\n");
        for(int j=0;j<pcount;j++){
            System.out.println(b[j]);
        }
        System.out.println("\n\n");
        for(int j=0;j<ncount;j++){
            System.out.println(a[j]);
        }
        boolean flag = false;
        int sp=0,sn=0,i=0;
        while(sp<=pcount && sn<=ncount)
        {
            if(flag==true){
                arr[i]=a[i];
                sn++;
                i++;
                flag=false;
            }
            else{
                arr[i]=b[i];
                sp++;
                i++;
                flag=true;
            }
        }
        System.out.println("\n\n");
        System.out.println(i);
        System.out.println("\n\n");
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }

        // while(sp<=pcount){
        //     arr[i]=b[sp];
        //     sp++;
        //     i++;
        // }
        // while(sn<=ncount){
        //     arr[i]=a[sn];
        //     sn++;
        //     i++;
        // }
        System.out.println("\n\n");
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
        // System.out.println("\n\n");
        // for(int j=0;j<pcount;j++){
        //     System.out.println(b[j]);
        // }
        // System.out.println("\n\n");
        // for(int j=0;j<ncount;j++){
        //     System.out.println(a[j]);
        // }
    }
}