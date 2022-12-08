import java.util.*;
import java.io.*;
public class alphadigitsum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp="0" ;
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(Character.isDigit(ch)){
                temp += ch;
            }

            else{
                sum = sum+ Integer.valueOf(temp);
                temp = "0";
            }
        }
        System.out.println(sum + Integer.valueOf(temp));
        // System.out.println(sum);
    }
}
