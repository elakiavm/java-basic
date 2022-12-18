import java.util.*;
public class recharge_phone {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the recharge plan");
        int recharge_plan=input.nextInt();

        if(recharge_plan==84){
            System.out.println("Enter the nos of call made");
            int nos_calls = input.nextInt();

            System.out.println("Enter the no of sms made ");
            int nos_sms = input.nextInt();

            System.out.println("Enter the no of data used");
            int data = input.nextInt();



        }
        else{
            System.out.println("We not have the plan for the recharge plan");
        }
    }
}
