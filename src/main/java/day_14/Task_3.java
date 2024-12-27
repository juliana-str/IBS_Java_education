package day_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод
 * List<Person> parseFileToObjList(), который считывает содержимое того же
 * файла people.txt, создает экземпляры класса “Человек” и возвращает список
 * объектов. Получить данный список в методе main() и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо
 * выбрасывать исключение и выводить в консоль сообщение “Файл не найден”. Помимо
 * этого, если значение возраста отрицательно, необходимо выбрасывать исключение и
 * выводить в консоль сообщение “Некорректный входной файл”.
 */
public class Task_3 {
    public static List<Person> parseFileToObjList(File file) {
        List<Person> persons = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                List<String> person = Arrays.asList(scanner.nextLine().split(" "));
                if (Integer.parseInt(person.get(1)) < 0) {
                    throw new IllegalArgumentException();
                }
                persons.add(new Person(person.get(0), Integer.parseInt(person.get(1))));
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
        System.out.println(parseFileToObjList(file));
    }
}
