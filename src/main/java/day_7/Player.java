package day_7;

import java.util.concurrent.ThreadLocalRandom;

public class Player {
    private static int stamina;
    static int MAX_STAMINA = 100;
    static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player() {
        setStamina();
        setCountPlayers();
    }

    protected void setStamina() {
        stamina = ThreadLocalRandom.current().nextInt(MAX_STAMINA - 10, MAX_STAMINA);
    }

    protected void setCountPlayers() {
        if (!(countPlayers > 6)) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else System.out.println("На поле нет свободных мест");
    }
}
