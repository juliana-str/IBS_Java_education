package day_17;

import java.util.ArrayList;
import java.util.List;

/**
 * Создайте Enum “Шахматная фигура” (англ. ChessPiece).
 * Используя созданный enum, в методе main() класса Task1 создайте массив,
 * содержащий 4 белых пешки и 4 черных ладьи. Выведите содержимое этого массива
 * на экран, используя строковые обозначения шахматных фигур.
 */
public class Task_1 {
    public static void main(String[] args) {
        List<ChessPiece> chess = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
            chess.add(pawnWhite);
        }

        for (int i = 0; i < 4; i++) {
            ChessPiece rookBlack = ChessPiece.ROOK_BLACK;
            chess.add(rookBlack);
        }

        chess.forEach(value -> System.out.print(value + " "));
    }
}
