package task_5.ext;
import java.util.InputMismatchException;
import java.util.Scanner;

    public class Data {

        /**
         * @param m - для передачи текста перед получением значения из консоли
         * @return - метод возвращает вещественное число из консоли
         */
        public static double inputData(String m, Scanner scanner){
            System.out.println(m);
            double d;
            try{
                d = scanner.nextDouble();
            }
            catch (InputMismatchException ex) {
                System.out.println("Введенный символ не является числом");
                throw new InputMismatchException("Ввели не число");

            }
            return d;
        }

    }

