import java.util.Arrays;
import java.util.Random;

public class task_4_1 {

    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) getRandomInteger(-10, 10);
        }
        String m1 = Arrays.toString(arr);
        System.out.println(m1);
        mZnach(arr);
    }

    public static double getRandomInteger(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    public static void mZnach(int[] arr) {
        int maxzn_otr = -11;
        int minzn_pol = 11;

        // Проходим по массиву и определяем максимальное отрицательное
        // и минимальное положительное значения

        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] > maxzn_otr) & (arr[i] < 0)) {
                maxzn_otr = arr[i];
            }

            //System.out.println("Максимальное - значение для шага " + i + " " + maxzn_otr);

            if ((arr[i] < minzn_pol) & (arr[i] > 0)) {
                minzn_pol = arr[i];
            }

            //System.out.println("Минимальное значение для шага " + i + " " + minzn);
        }

        // Обеспечим вывод корректного сообщения, если положительных или отрицательных чисел
        // в массиве сгенерировано не было

        if (maxzn_otr > -11) {
            System.out.println("Максимальное отрицательное значение : " + maxzn_otr);
        } else {
            System.out.println("В массиве нет отрицательных чисел ");
        }

        if (minzn_pol < 11) {
            System.out.println("Минимальное положительное значение : " + minzn_pol);
        } else {
            System.out.println("В массиве нет положительных чисел");
        }

        // Скопируем исходный массив
        int[] copyArr = new int[20];
        System.arraycopy(arr, 0, copyArr, 0, 20);

        for (int i = 0; i < copyArr.length; i++) {

            if (copyArr[i] == maxzn_otr) {
                copyArr[i] = minzn_pol;
                continue;
            }

            if (copyArr[i] == minzn_pol) {
                copyArr[i] = maxzn_otr;
                continue;
            }
        }
        String m0 = Arrays.toString(arr);
        System.out.println("      Исходный массив: " + m0);

        String m2 = Arrays.toString(copyArr);
        System.out.println("Результирующий массив: " + m2);
    }

}





