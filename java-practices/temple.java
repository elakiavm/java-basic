import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class temple {
    
    public static void main(String[] agrs){
       Scanner input = new Scanner(System.in);

       System.out.println("Enter the no of lemons:");
       int LemonsNo = input.nextInt();

    if (LemonsNo > 0)
    {
      if (LemonsNo == 21)
       {
           System.out.println("You have right no of lemons ");
       }
       else if (LemonsNo < 21)
       {
           int req = 21 - LemonsNo;
           System.out.println("You required " + req + " lemons");
       }
       else if (LemonsNo > 21)
       {
           int more = LemonsNo - 21;
           System.out.println("You have more lemons " + more);
       }
    } 
       
    else
       {
           System.out.println("Please enter the valid no of lemons ");
       }

    }
}
