import java.util.*;
public class zeller_formula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the data ");
        int date = input.nextInt();
        System.out.println("Enter the month ");
        int month = input.nextInt();
        System.out.println("Enter the year ");
        int year = input.nextInt();

        {
            if (month == 1)
            {
                month = 13;
                year--;
            }
            if (month == 2)
            {
                month = 14;
                year--;
            }
            int q = date;
            int m = month;
            int k = year % 100;
            int j = year / 100;
            int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
            h = h % 7;
            switch (h)
            {
                case 0 : System.out.println("Saturday"); break;
                case 1 : System.out.println("Sunday"); break;
                case 2 : System.out.println("Monday"); break;
                case 3 : System.out.println("Tuesday"); break;
                case 4 : System.out.println("Wednesday"); break;
                case 5 : System.out.println("Thursday"); break;
                case 6 : System.out.println("Friday"); break;
            }
        }
    }
}
