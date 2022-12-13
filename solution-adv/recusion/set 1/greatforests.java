import java.util.*;

class Main{
    static char[][] mat= new char[1000][1000];
    static int n;
    static int count=0;
    public static void count_tree(int i,int j){
        if(i<0 || i>=n || j<0 || j>=n)
            return;
        if(mat[i][j]=='T'){
            mat[i][j]='W';
            count++;
            count_tree(i-1,j);
            count_tree(i+1,j);
            count_tree(i,j+1);
            count_tree(i,j-1);
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        for(int i=0;i<n;i++){
                mat[i]=sc.next().toCharArray();
        }
        int max_count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]=='T'){
                    count_tree(i,j);
                    if(max_count <count)
                        max_count=count;
                    count=0;
                }
            }
        }
        System.out.print(max_count);
    }
}