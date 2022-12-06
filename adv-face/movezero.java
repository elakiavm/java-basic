import java.util.*;

public class movezero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i;
        for(i = 1; i <= t; i++)
        {
            int num, r, count = 0, ans = 0;
            num = sc.nextInt();
            while(num != 0) 
            {
                r = num % 10;
                if(r==0)
                {
                    count++;
                }
                else
                {
                    ans=(ans*10)+r;
                }
                num /= 10;
            }
            System.out.print(ans);
            for(int j=0;j<count;j++)
            {
                System.out.print("0");
            }  
            System.out.println();
            
        }
    }
}
