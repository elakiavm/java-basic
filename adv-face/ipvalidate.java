import java.util.regex.*;
import java.util.*;
class ipvalidate
{
  public static void main(String args[])
  {
    
    Scanner sc = new Scanner(System.in);
    String ip = sc.nextLine();
    String numRange = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + "\\." 
    + "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + "\\." 
    + "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + "\\." 
    + "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

    Pattern ip_pattern = Pattern.compile(numRange); 
    Matcher m = ip_pattern.matcher(ip);
    System.out.println(m.matches());
    boolean res= false;
    res=m.matches();


    // boolean res = m.matches();
    if (res==true) {
      System.out.print("1");
    }
    else {
      System.out.print("0");
    }
  }
}