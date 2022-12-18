import java.util.*;
public class reverse {

    public static void main(String[]args){
        int reverse = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter  the number ");
        int num = input.nextInt();

        boolean flag = false;
        boolean flag1 = false;

        for ( int i = 2; i<=num/2 ;++ i){
            if (num % i == 0){
                flag= true;
                break;
            }
        }
        if(!flag){

            while(num>0){
                reverse = reverse * 10 + num % 10;
                num = num/10;
            }
            for ( int i = 2; i<=reverse/2 ;++ i){
                    if (reverse % i == 0){
                        flag1= true;
                        break;
                    }
            }
                
            if(!flag1){
                    System.out.println("reversed Prime ");
            }
                
            else{
                    System.out.println(reverse +" Not reserved Prime ");
                }

            System.out.println("Prime number");

            if(flag==true&&flag1==true){
                System.out.println("Magical prime number");
            }
        }
        else{
            System.out.println("Not Prime Number");
        }




    }
    
}
