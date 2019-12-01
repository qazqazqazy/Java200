/**
 * Created by Oksana on 01.12.
 * @author Oksana
 */

import java.util.Scanner;
import java.util.Arrays;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of task (1 - calculator, 2 - string array)");
        int key = scanner.nextInt();
        {
            if (key == 1) {
                System.out.println("Enter the first number");
                float i = scanner.nextFloat();
                System.out.println("Enter the second number");
                float j = scanner.nextFloat();

                /**
                 * Предлагаем ввести число для выбора сложения, вычитания умножения или деления
                 */
                System.out.println("Enter the operation:");
                System.out.println("1 - for '+', 2 - for '-', 3 - for '*', 4 - for '/'");
                int t = scanner.nextInt();
                /**
                 * Выбираем, что будет выводиться на экран при выборе указанной операции:
                 */
                switch (t) {
                    case 1:
                        System.out.printf("Result is: %.4f", (i + j));
                        break;
                    case 2:
                        System.out.printf("Result is: %.4f", (i - j));
                        break;
                    case 3:
                        System.out.printf("Result is: %.4f", (i * j));
                        break;
                    case 4:
                        System.out.printf("Result is: %.4f", (i / j));
                        break;
                    default:
                        System.out.println("Error: enter correct operation");
                        ;
                        break;
                }
                scanner.close();
            }
            else if (key == 2)
            {   Scanner scan = new Scanner(System.in);
                System.out.println("Введите размерность массива:");
                int r = scan.nextInt();
                String textArray[] = new String[r];
                int i;
                for (i = 0; i < r; i++) {
                    System.out.println("Введите значения следующего элемента массива:");
                    Scanner sc = new Scanner(System.in);
                    String word = sc.next();
                    textArray[i] = word;
                }
                //for (i = 0; i < r; i++) {
                //    System.out.println(textArray[i]);}

                int maxlen = 0;
                for (i = 0; i < r; i++) {
                    if (textArray[i].length() > maxlen)
                    {maxlen = textArray[i].length();}
                    i++;
                }
                System.out.println("Максимальная длина строки в массиве: " + maxlen);
            }
            else
            { System.out.println("Error: enter correct number");}
        }
    }
}