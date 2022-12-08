import java.util.*;
class majority
{
  public static void main(String args[])
  {
    //Try out your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int fact = 1;
        for(int i=0;i<n;i++){
          	if(a[i]!=0){
            for(int j=1;j<=a[i];j++){
                fact=fact*j;
               
            }
            System.out.println(fact);
            fact=1;
            }
          	else{
              System.out.println(fact);
        	}
        }
  }
}