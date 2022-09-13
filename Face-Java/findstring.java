import java.util.Scanner;
import java.util.*;
public class findstring {
    static final int ASCII_SIZE = 256;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count[] = new int[ASCII_SIZE];
 
    // Construct character count array from the input
    // string.
    int len = str.length();
    for (int i=0; i<len; i++)
    count[str.charAt(i)]++;
    
    int max = -1; // Initialize max count
    char result = ' '; // Initialize result
    
    // Traversing through the string and maintaining
    // the count of each character
    for (int i = 0; i < len; i++) {
    if (max < count[str.charAt(i)]) {
        max = count[str.charAt(i)];
        result = str.charAt(i);
    }
    }
    
    System.out.print(result);
    }
}  
