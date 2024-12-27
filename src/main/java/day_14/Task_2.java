package day_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Создать в папке проекта файл people.txt в котором хранятся имена и возраст
 * людей. Реализовать статический метод, List<String> parseFileToStringList(),
 * который считывает содержимое этого файла и возвращает список,
 * состоящий из значений имен и возрастов каждого человека.
 * Получить данный список в методе main() и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо
 * выбрасывать исключение и выводить в консоль сообщение “Файл не найден”. Помимо
 * этого, если значение возраста отрицательно, необходимо выбрасывать исключение и
 * выводить в консоль сообщение “Некорректный входной файл”.
 */
public class Task_2 {
    public static List<String> parseFileToStringList(File file) {
        List<String> persons = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String person = scanner.nextLine();
                persons.add(person);
                List<String> man = Arrays.asList(person.split(" "));
                if (Integer.parseInt(man.get(1)) < 0) {
                    throw new IllegalArgumentException();
                }
            }
            return persons;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }

    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }
}
