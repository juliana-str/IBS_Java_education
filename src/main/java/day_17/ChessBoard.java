package day_17;

public class ChessBoard {
    private final ChessPiece[][] chess;

    public ChessBoard(ChessPiece[][] chess) {
        this.chess = chess;
    }

    public void print() {
        for (ChessPiece[] chessPiece : chess) {
            for (ChessPiece chessFigure : chessPiece) {
                System.out.print(chessFigure);
            }
            System.out.println();
        }
    }
}
