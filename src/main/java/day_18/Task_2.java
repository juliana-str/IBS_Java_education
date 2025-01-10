package day_18;

/**
 * Создайте рекурсивный метод, который принимает на вход единственный аргумент -
 * число, и возвращает количество цифр 7 в этом числе. Циклы использовать
 * запрещено, можно использовать только рекурсивные вызовы.
 */
public class Task_2 {

    public static int count7(int num) {
        if (num == 0) return 0;
        if (num % 10 == 7)
            return 1 + count7(num / 10);
        else
            return count7(num / 10);
    }

    public static void main(String[] args) {
        int number = 717771237;
        System.out.println(count7(number));
    }
}
