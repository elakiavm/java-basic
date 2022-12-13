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
        // for(int j=0;j<pcount;j++){
        //     System.out.println(b[j]);
        // }
        // System.out.println("\n\n");
        // for(int j=0;j<ncount;j++){
        //     System.out.println(a[j]);
        // }
        System.out.println(ncount);
        System.out.println("\n\n");
        System.out.println(pcount);
        System.out.println("\n\n");
        // boolean flag = false;
        // int sp=0,sn=0,i=0;
        // while(sp<=pcount && sn<=ncount)
        // {
        //     if(flag==true){
        //         arr[i]=a[i];
        //         sn++;
        //         i++;
        //         flag=false;
        //         // System.out.println(arr[i]);
        //     }
        //     else{
        //         arr[i]=b[i];
        //         sp++;
        //         i++;
        //         flag=true;
        //         // System.out.println(arr[i]);
        //     }
        // }
        // int i=0,sp=0,sn=0;
        int res[] =new int[n];
        // boolean flag = true;
        // while(sp<=pcount&&sn<ncount){
        //     if(flag==true){
        //         res[i]=a[i];
        //         sn++;
        //         flag=false;
        //     }
        //     else{
        //         res[i]=b[i];
        //         sp++;
        //         flag=true;
        //     }

        // }
        // System.out.println("\n\n");
        // System.out.println(i);
        // System.out.println("\n\n");
        // for(int j=0;j<n;j++){
        //     System.out.println(arr[j]);
        // }

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
        int i=0;
        int k=0;
        while(i!=pcount){
            res[i]=b[k];
            i+=2;
            k++;
        }
        int j=1;
        while(j!=ncount){
            res[j]=a[k];
            k++;
            j+=2;
        }
        System.out.println("\n\n");
        for(int j=0;j<n;j++){
            System.out.println(res[j]);
        }
        System.out.println("\n\n");
        for(int j=0;j<pcount;j++){
            System.out.println(b[j]);
        }
        System.out.println("\n\n");
        for(int j=0;j<ncount;j++){
            System.out.println(a[j]);
        }
    }
}