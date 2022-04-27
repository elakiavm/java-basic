import java.util.*;
public class main {

    public static void main(String[] args) {
      
      // int num = 29;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number :");
      int num = input.nextInt();
      boolean flag = false;
      for (int i = 2; i <= num / 2; ++i) {
        // condition for nonprime number
        if (num % i == 0) {
          flag = true;
          break;
        }
      }
  
      if (!flag){
        int num1 = num;
        int reversed= reversNumber(num1);
        if (num1 == reversed){
          System.out.println(num + " is a prime number.");
        }
      }
      else
        System.out.println(num + " is not a prime number.");
    }
    static int reversNumber(int num1)
    {
      int reversed_n = 0;
      while (num1 > 0) {
          reversed_n = reversed_n * 10 + num1 % 10;
          num1 = num1 / 10;
      }
      return reversed_n;
    }
  }


