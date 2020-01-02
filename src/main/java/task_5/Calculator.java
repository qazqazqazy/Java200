package task_5;

import task_5.ext.Data;
import task_5.operations.AnyOp;
import task_5.ChooseOperation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            try {
                /**
                 * получаем данные c консоли
                 */
                Double firstOperand = Data.inputData("Введите первое число (в качестве разделителя использовать запятую): ", scanner);
                Double secondOperand = Data.inputData("Введите второе число (в качестве разделителя использовать запятую)ю: ", scanner1);
                AnyOp operation =
                        new ChooseOperation().chooseOperation("выберите тип операции из списка: +, -, *, /");

                /**
                 * Вывод результата (до 4 знаков после запятой)
                 */
                Double res = operation.result(firstOperand, secondOperand);
                System.out.printf(firstOperand + " " + operation.getName() + " " + secondOperand + " = ");
                System.out.printf("%.4f%n", res);
            } catch (InputMismatchException ex) {
                System.out.println("Произошла ошибка: Пожалуйста, введите числа");
            } catch (ArithmeticException ex) {
                System.out.println("Произошла ошибка: делить на 0 нельзя");
            }
            finally {
                System.out.println("Введите 0, если хотите выыполнить еще одну операциюю");
                try {
                    int use = scanner2.nextInt();
                    if (use != 0) {
                        scanner.close();
                        scanner1.close();
                        scanner2.close();
                        break;
                    }

                }catch (Exception ex) {
                    scanner.close();
                    scanner1.close();
                    scanner2.close();
                    break;
                }
            }
        }
    }
}