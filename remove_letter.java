import java.util.*;
class remove_letter {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char str1 = input.next().charAt(0);
        char g_char = input.next().charAt(0);
        char result = remove_Character(str1, g_char);
   
        System.out.println(str1);    
        System.out.println(result);                                
   }
  public static String remove_Character(char str1, char g_char) {
      String str = (String)str1;
       if (str == null || str.isEmpty()) {
          return "";
       }
       StringBuilder sb = new StringBuilder();
       char[] chArray = str.toCharArray();
       for (int i = 0; i < chArray.length; i++) {
           if (chArray[i] != g_char) {
               sb.append(chArray[i]);
           }
       }
       return sb.toString();
   }
}
/* 
weeelcome 
e
wlco
*/