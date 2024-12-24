package day_8;

/**
 * Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна
 * строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
 * (0 + “ “ + 1 + “ “ + 2 + ... + 20000).
 * После создания такой строки, вызов System.out.println() на этой строке должен
 * вывести в консоль сразу все числа из диапазона:
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 ... 19995 19996 19997 19998 19999 20000
 * Для того, чтобы почувствовать разницу в производительности между конкатенацией
 * обычных строк (класс String) и использовании StringBuilder, реализуйте
 * описанную задачу этими двумя способами, замеряя время работы программы.
 */
public class Task_1 {

    public static void createNewString() {
        String newString = "";
        for (int i = 0; i <= 20000; i++) {
            newString = newString + i + " ";
        }
    }

    public static void createStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }
    }

    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        createNewString();
        long endTime1 = System.currentTimeMillis();
        long timeElapsed1 = endTime1 - startTime1;
        System.out.println("Время выполнения программы с использованием конкатенации строк " + timeElapsed1 + " миллисекунд");
        long startTime2 = System.currentTimeMillis();
        createStringBuilder();
        long endTime2 = System.currentTimeMillis();
        long timeElapsed2 = endTime2 - startTime2;
        System.out.println("Время выполнения программы с использованием метода StringBuilder " + timeElapsed2 + " миллисекунд");


    }
}
