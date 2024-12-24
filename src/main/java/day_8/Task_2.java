package day_8;

/**
 * Внесите изменения в класс таким образом, чтобы следующий код выводил
 * информацию о самолете, аналогично вызову метода info().
 */
public class Task_2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000, 150, 10000);
        System.out.println(airplane);
    }
}
