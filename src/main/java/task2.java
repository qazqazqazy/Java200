/**
 * Created by Oksana on 01.12.
 * @author Oksana
 */

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int i = scanner.nextInt();
        System.out.println("Enter the second number");
        int j = scanner.nextInt();
        System.out.println("Enter the operation:");
        System.out.println("1 - for '+', 2 - for '-', 3 - for '*', 4 - for '/'");
        int text = scanner.nextInt();

        switch (text) {
            case 1:
                System.out.println("Sum is: " + (i + j));
                break;
            case 2:
                System.out.println("Result is: " + (i - j));
                break;
            case 3:
                System.out.println("Result is: " + (i * j));
                break;
            case 4:
                System.out.println("Result is: " + (i / j));
                break;
            default:
                System.out.println("Error: enter correct operation");;
                break;
        }
        scanner.close();
    }
}

