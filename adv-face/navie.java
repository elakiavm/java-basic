import java.util.*;
public class navie {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s =sc.nextLine();
        int l1= str.length();
        int l2 = s.length();
        int i = 0, j = l2 - 1;
 
        for (i = 0, j = l2 - 1; j < l1;) {
 
            if (s.equals(str.substring(i, j + 1))) {
                System.out.println("Pattern found at index "+ i);
            }
            i++;
            j++;
        }
    }
}
