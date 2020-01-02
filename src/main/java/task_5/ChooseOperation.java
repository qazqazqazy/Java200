package task_5;

import task_5.operations.*;
import java.util.Scanner;

public class ChooseOperation {

    //поле класса для получения разных реализаций интерфейса OperationForTwoOperands
    public AnyOp someOper;
    private static Scanner scanner = new Scanner(System.in);

    /**
     * @see #chooseOperation(String) - Метод по char значению из консоли возвращает класс операции
     * @param msg - для вывода текста перед выбором операции
     */
    protected AnyOp chooseOperation(String msg) {
        System.out.println(msg);
        char oper = scanner.next().charAt(0);

        switch (oper) {
            case '+':
                someOper = new Sum();
                break;
            case '-':
                someOper = new Min();
                break;
            case '*':
                someOper = new Mult();
                break;
            case '/':
                someOper = new Del();
                break;
            default:
                System.out.println("В списке нет такой операции");
        }
        return someOper;
    }
}