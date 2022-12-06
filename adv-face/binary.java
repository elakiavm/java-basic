import java.util.*;

public class binary {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first,last;
        first=0;
        last=n-1;
        int mid = (first + last)/2;  
        int key = sc.nextInt();
        while( first <= last )
        {  
            if ( arr[mid] < key ){  
                first = mid + 1;     
            }
            else if ( arr[mid] == key ){  
                System.out.println(arr[mid]+"is present at location " + mid);  
                break;  
            }
            else{  
                last = mid - 1;  
            }  
            mid = (first + last)/2;  
        }  
        if ( first > last ){  
        System.out.println("Not found");  
        }  
        }  

    }
