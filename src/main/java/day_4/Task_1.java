package day_4;

import java.util.*;

/**
 * С клавиатуры вводится число n - размер массива. Необходимо создать массив
 * указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
 * содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */
public class Task_1 {
    static final int LIMIT = 10;
    static int COUNT_NUMS_BIGGER_8 = 0;
    static int COUNT_NUMS_EQUAL_1 = 0;
    static int COUNT_EVEN_NUMS = 0;
    static int COUNT_ODD_NUMS = 0;
    static int SUM_NUMS_IN_ARRAY = 0;
    static List<Integer> arraylist = new ArrayList<>();

    public static void createNumArray(int lenght, int limit) {
        Random r = new Random();
        for (int i = 0; i < lenght; i++) {
            int num = r.nextInt(limit);
            arraylist.add(num);
        }
    }

    public static void getCountNums(List<Integer> array) {
        for (int num : array) {
            if (num > 8) {
                COUNT_NUMS_BIGGER_8++;
            }
            if (num == 1) {
                COUNT_NUMS_EQUAL_1++;
            }
            if (num % 2 == 0) {
                COUNT_EVEN_NUMS++;
            } else COUNT_ODD_NUMS++;
            SUM_NUMS_IN_ARRAY += num;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLenght = scanner.nextInt();
        createNumArray(arrayLenght, LIMIT);
        getCountNums(arraylist);
        System.out.println(arraylist);
        System.out.println("Длина массива: " + arrayLenght);
        System.out.println("Количестве чисел больше 8: " + COUNT_NUMS_BIGGER_8);
        System.out.println("Количестве чисел равных 1: " + COUNT_NUMS_EQUAL_1);
        System.out.println("Количестве четных чисел: " + COUNT_EVEN_NUMS);
        System.out.println("Количестве нечетных чисел: " + COUNT_ODD_NUMS);
        System.out.println("Сумме всех элементов массива: " + SUM_NUMS_IN_ARRAY);
    }
}
