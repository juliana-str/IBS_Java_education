package day_4;

import java.util.Random;

/**
 * Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
 * матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
 * строк несколько, вывести индекс последней из них.
 */
public class Task_3 {
    static final int M = 12;
    static final int N = 12;
    static final int LIMIT = 50;
    static int SUM_LINE = 0;
    static int[][] matrix = new int[N][M];
    static int INDEX = 0;

    public static void createMatrix() {
        Random r = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int num = r.nextInt(LIMIT);
                matrix[i][j] = num;
            }
        }
    }

    public static void maxLineIndex() {
        for (int i = 0; i < M; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += matrix[i][j];
            }
            if (SUM_LINE <= sum) {
                SUM_LINE = sum;
                INDEX = i;
            }
        }
    }

    public static void main(String[] args) {
        createMatrix();
        maxLineIndex();
        System.out.println(INDEX);
    }
}
