package day_17;

import java.util.HashMap;
import java.util.Map;

/**
 * Добавьте новую “фигуру” в enum ChessPiece, которая будет называться EMPTY.
 * Эта “фигура” будет обозначать пустое пространство на шахматной доске. Ценность
 * этой фигуры равна -1, а строковое обозначение равно нижнему подчеркиванию ("_").
 * Затем создайте класс Шахматная доска (англ. ChessBoard). Этот класс в
 * единственном аргументе конструктора должен принимать на вход двумерный массив
 * шахматных фигур. Этот двумерный массив задает конфигурацию фигур на шахматной
 * доске. Пустое пространство на шахматной доске задается с помощью значения
 * EMPTY. Также, у класса ChessBoard должен быть реализован метод print(),
 * который выводит шахматную доску в консоль.
 * В методе main() класса Task2 создайте новый объект класса ChessBoard, передав
 * ему в качестве аргумента двумерный массив с расположением фигур как на картинке
 * ниже (матч Крамник - Каспаров 2000 года).
 * Затем, используя метод print() выведите шахматную доску в консоль, используя
 * строковые обозначения шахматных фигур.
 */
public class Task_2 {
    public static ChessPiece[][] chess = new ChessPiece[8][8];
    public static Map<ChessPiece, int[][]> coordinates = new HashMap<>();

    public static void fillCoordinates() {
        int[][] rookBlack = {{0, 0}, {0, 5}};
        int[][] rookWhite = {{1, 1}, {7, 5}};
        int[][] kingBlack = {{0, 6}};
        int[][] kingWhite = {{7, 6}};
        int[][] pawnBlack = {{1, 4}, {1, 5}, {1, 7}, {2, 0}, {2, 6}};
        int[][] pawnWhite = {{4, 4}, {5, 5}, {6, 0}, {6, 5}, {6, 7}};
        int[][] knightBlack = {{2, 2}};
        int[][] queenBlack = {{3, 0}};
        int[][] queenWhite = {{6, 3}};
        int[][] bishopBlack = {{4, 3}};
        int[][] bishopWhite = {{3, 3}, {5, 4}};
        coordinates.put(ChessPiece.ROOK_BLACK, rookBlack);
        coordinates.put(ChessPiece.ROOK_WHITE, rookWhite);
        coordinates.put(ChessPiece.KING_BLACK, kingBlack);
        coordinates.put(ChessPiece.KING_WHITE, kingWhite);
        coordinates.put(ChessPiece.PAWN_BLACK, pawnBlack);
        coordinates.put(ChessPiece.PAWN_WHITE, pawnWhite);
        coordinates.put(ChessPiece.KNIGHT_BLACK, knightBlack);
        coordinates.put(ChessPiece.QUEEN_BLACK, queenBlack);
        coordinates.put(ChessPiece.QUEEN_WHITE, queenWhite);
        coordinates.put(ChessPiece.BISHOP_BLACK, bishopBlack);
        coordinates.put(ChessPiece.BISHOP_WHITE, bishopWhite);
    }

    public static void createChessPiece() {
        fillCoordinates();
        for (Map.Entry<ChessPiece, int[][]> figure : coordinates.entrySet()) {
            for (int[] coordinate : figure.getValue()) {
                chess[coordinate[0]][coordinate[1]] = figure.getKey();
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chess[i][j] == null) {
                    chess[i][j] = ChessPiece.EMPTY;
                }
            }
        }
    }

    public static void main(String[] args) {
        createChessPiece();
        ChessBoard chessBoard = new ChessBoard(chess);
        chessBoard.print();
    }
}
