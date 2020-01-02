import java.util.*;
import java.io.*;

public class cl {

    public static void main(String[] args) throws Exception {

        //передаёт слова из файла в отсортированный сет с удаленными дубликатами
        Scanner scanner = new Scanner(new File("files.txt"));
        Set<String> words = new TreeSet<>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            words.add(word);
        }
        System.out.println("1. Отсортированный список слов из файла: " + "\n" + words);

        //статистика, сколько раз слово встречается в файле
        scanner = new Scanner(new File("files.txt"));
        Map<String, Integer> statistics = new HashMap<>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
        System.out.println("2. Статистика, отображающая, сколько раз те или иные слова встречаются в файле: " + "\n" + statistics);

        int maxValueInMap=(Collections.max(statistics.values()));  // возвращает максимальное значение в Hashmap
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {  // для каждого элемента в HashMap
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey() + " встречается в файле " + entry.getValue() + " раз(а)");
            }
        }
    }
}