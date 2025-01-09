package day_16;

import java.io.*;
import java.util.Random;

/**
 * Реализовать программу, записывающую числа разных типов в 2 файла.
 * Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
 * Оба файла должны находиться в корне проекта. Создаваться файлы должны не
 * вручную, а при запуске программы.
 * Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
 * Файл 2 создается на основании Файла 1, но содержит числа вещественного типа
 * данных.
 * Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из
 * Файла 1 рассчитывается их среднее арифметическое. Затем, полученное значение
 * записывается в Файл 2. Таким образом в Файле 2 будет находиться 50 вещественных
 * чисел (1000 / 20 = 50).
 * После того, как Файл 2 будет сформирован, необходимо реализовать статический
 * метод printResult(File file). Этот метод должен рассчитать сумму всех
 * вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную
 * часть.
 */
public class Task_2 {

    public static void printResult(File file) throws IOException {
        FileReader reader = new FileReader(file);
        float sum = 0;
        while ((reader.read()) != -1) {
            sum += reader.read();
        }
        System.out.println(Math.round(sum));
    }

    public static void main(String[] args) throws IOException {
        Random r = new Random();
        float sum = 0;
        FileWriter writer1 = null;
        FileWriter writer2 = null;
        try {
            writer1 = new FileWriter("file1.txt", false);
            writer2 = new FileWriter("file2.txt", false);
            for (int i = 1; i <= 1000; i++) {
                int num = r.nextInt(101);
                sum += num;
                writer1.append(String.valueOf(num)).append(" ");
                if (i % 20 == 0) {
                    float result = sum / 20;
                    writer2.append(String.valueOf(result)).append(" ");
                    sum = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer1.close();
            writer2.close();
        }
        printResult(new File("file2.txt"));
    }
}
