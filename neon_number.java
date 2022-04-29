
import java.util.*;

public class neon_number {
    // function to check Neon Number
    public static void main(String[] args) {

    Scanner cs=new Scanner(System.in);
    int range1,range2;
    System.out.println("Enter a range:");
    range1=cs.nextInt();
    range2=cs.nextInt();
    System.out.println("Neon numbers between "+range1+" and "+range2+" are: ");
    for(int i=range1;i<=range2;i++)
    {
     int sqr=i*i;
        //Sum of digit
       int sum=0,rem;
       while(sqr!=0)
       {
           rem=sqr%10;
           sum+=rem;
           sqr/=10;
       }
    if(sum==i)
    System.out.print(i+" ");
    }
    cs.close();  
    }
}   



