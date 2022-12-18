import java.util.*;
public class sample {
    public static void main(String[] agrs)
    {
        String username = "Elakia";
        int key = 123;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the username ");
        String name = input.next();

        System.out.println("Enter the password");
        int password = input.nextInt();

        if (username==name)
        {
                System.out.println("Successful");
        }
        else{
            System.out.println("failed");
        }

    }
    
}
/*
"equals" methods is used to compare the value and the address
but "==" used to compare the only the address 
*/
