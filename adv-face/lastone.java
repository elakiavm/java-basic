import java.util.*;
public class lastone {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
            while(t>0){
                int index=-1;
                String s=sc.next();
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)=='1'){
                        index=i;
                    }
                }
                System.out.println(index);
                t--;
            }
    }
}
