import java.util.Scanner;


public class twoLesson {

    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] agrs)
    {
        System.out.println("Enter the number ");

        if(userInput.hasNextInt())
        {
            int numberEnter = userInput.nextInt();

            System.out.println("entered the number " + numberEnter);

            int num = numberEnter + 20;

            System.out.println(num);

            int absNumber = Math.abs(num);
            int maxNumber = Math.max(5,1);
            int minNumber = Math.min(8,12);

            double numSqu = Math.sqrt(5.23);

            System.out.println("abs number is " + absNumber);
            System.out.println("max number is " + maxNumber);
            System.out.println("min number is " + minNumber);
            System.out.println("sqr number is " + numSqu);


        }
        else{

            System.out.println("not entered the number ");
        }
    }
    
}
