package day_7;

/**
 * Создать класс Player по вышеописанному шаблону. Экземпляр класса при
 * создании должен иметь значение выносливости от 90 до 100 (генерировать внутри
 * конструктора). Создать 6 игроков, вызвать метод info(). При попытке создать 7,8 ...
 * n игрока, количество игроков на поле меняться не должно, проверить это.
 * Примените к игроку метод run(), пока он полностью не выдохнется (отрицательное
 * значение выносливости не допускается). Вывести количество игроков на поле.
 */
public class Task_2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        System.out.println(player1.getStamina());
        System.out.println(player2.getStamina());
        Player.info();
        while (player1.getStamina() > 0) {
            player1.run();
        }

    }
}
