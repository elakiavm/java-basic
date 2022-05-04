import java.util.*;
public class remove_letter {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        String str1 = input.nextLine();
        str1 = str1.toLowerCase();
        char[] ch = str1.toCharArray();
        String str2 = input.next();
        char ch1 = str2.charAt(0);     
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==ch1){
                continue;
            }
            System.out.print(ch[i]);
        }
    }
  
}
/* Z`
weeelcome 
e
wlco
*/