package day_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Реализовать программу, которая на вход принимает txt файл с целыми числами
 * (можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в
 * консоль среднее арифметическое этих чисел.
 * Ответ будет являться вещественным числом. В консоль необходимо вывести полную
 * запись вещественного числа (со всеми знаками после запятой) и сокращенную запись
 * (с 3 знаками после запятой).
 * Детали реализации: В классе Task1 создать публичный статический метод
 * printResult(File file), в котором реализовать вышеописанную логику. В методе
 * main() класса Task1 вызвать метод printResult(File file), передав ему в
 * качестве аргумента объект класса File (txt файл с целыми числами).
 */
public class Task_1 {
    public static void printResult(File file) {
        List<Integer> nums = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                nums.add(scanner.nextInt());
            }
            double sum = 0;
            for (int num : nums) {
                sum += num;
            }
            double num = sum / nums.size();
            System.out.print(num + " --> ");
            System.out.printf("%.3f%n", num);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void main(String[] args) {
        File file = new File("values.txt");
        printResult(file);
    }
}
