/**
 * Created by Oksana on 01.12.
 * @author Oksana
 * @see #switch
 */

import java.util.Scanner;

public class task2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        float i = scanner.nextFloat();
        System.out.println("Enter the second number");
        float j = scanner.nextFloat();
        /**
         * Предлагаем ввести число для выбора сложения, вычитания умножения или деления
         */
        System.out.println("Enter the operation:");
        System.out.println("1 - for '+', 2 - for '-', 3 - for '*', 4 - for '/'");
        int text = scanner.nextInt();
/**
 * Выбираем, что будет выводиться на экран при выборе указанной операции:
 */
        switch (text) {
            case 1:
                System.out.printf("Result is: %.4f",(i + j));
                break;
            case 2:
                System.out.printf("Result is: %.4f",(i - j));
                break;
            case 3:
                System.out.printf("Result is: %.4f",(i * j));
                break;
            case 4:
                System.out.printf("Result is: %.4f",(i / j));
                break;
            default:
                System.out.println("Error: enter correct operation");;
                break;
        }
        scanner.close();
    }
}

