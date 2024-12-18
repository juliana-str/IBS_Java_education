package day_2;

public class Task_3 extends Task_2 {
    /**
     * Реализовать программу No2, используя цикл while.
     */
    public static void printNumsArray(int a, int b) {
        a = a + 1;
        while (a < b) {
            if (a % 5 == 0 & a % 10 != 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }

    public static void main(String[] args) {
        int a = getNextInt();
        int b = getNextInt();
        if (checkNums(a, b)) {
            printNumsArray(a, b);
        }
    }
}
