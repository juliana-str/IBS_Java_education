package day_1;

public class Task_1 {
    static final String WORD_FOR_PRINT = "JAVA";
    static final int COUNT = 10;

    /**
     * Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя
     * цикл while.
     */

    public static void printJavaWordInLine() {
        int flagCount = 0;
        while (COUNT > flagCount) {
            printWords("line", WORD_FOR_PRINT);
            flagCount++;
        }
    }

    public static void printWords(String method, String words) {
        if (method.equals("line")) {
            System.out.print(words + " ");
        } else {
            System.out.println(words);
        }
    }

    public static void main(String[] args) {
        printJavaWordInLine();
    }
}
