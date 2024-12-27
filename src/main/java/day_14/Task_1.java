package day_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
 * Заполнить его вручную десятью произвольными числами. Реализовать статический
 * метод printSumDigits(File file), который считает сумму всех чисел в этом
 * файле и выводит ее на экран. Вызвать данный метод в методе main().
 * Если файла не существует в папке проекта, в программе необходимо выбрасывать
 * исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если
 * чисел в файле меньше или больше 10, необходимо выбрасывать исключение и
 * выводить в консоль сообщение “Некорректный входной файл”.
 */
public class Task_1 {
    public static void printSumDigits(File file) {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String[] values = scanner.nextLine().split(" ");
            if (values.length != 10) {
                throw new IllegalArgumentException();
            }
            for (String value : values) {
                sum += Integer.parseInt(value);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }

    public static void main(String[] args) {
        File file = new File("values.txt");
        printSumDigits(file);
    }
}