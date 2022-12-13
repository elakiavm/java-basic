import java.util.Scanner;
class Main 
{
    static int total_ways_wrapper(int cr, int cc, int dr, int dc)
    {
        if(cr > dr || cc > dc)
        {
            return 0;
        }
    
        if(cr == dr && cc == dc)
        {
            return 1;
        }
    
        int ways = total_ways_wrapper(cr, cc+1, dr, dc) + total_ways_wrapper(cr+1, cc, dr, dc);
    
        return ways;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(total_ways_wrapper(0,0,m-1,n-1));
    }
}