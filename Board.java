
public class Board {
    Spot[][] boxes;

    public Board() {
        this.resetBoard();
    }

    public Spot getBox(int x, int y) throws Exception {

        if (x < 0 || x > 7 || y < 0 || y > 7)
            throw new Exception("Index out of bound");

        return boxes[x][y];
    }

    // TODO Reset all the piece to the starting piece
    public void resetBoard() {
        //White Piece
        boxes[0][0] = new Spot(0, 0, new Rook(true));
        boxes[0][1] = new Spot(0, 1, new Horse(true));
        boxes[0][2] = new Spot(0, 2, new Bishop(true));
        boxes[0][3] = new Spot(0, 3, new King(true));
        boxes[0][4] = new Spot(0, 4, new Queen(true));
        boxes[0][5] = new Spot(0, 5, new Rook(true));
        boxes[0][6] = new Spot(0, 6, new Horse(true));
        boxes[0][7] = new Spot(0, 7, new Bishop(true));

        for (int i = 0; i > 7; i++) {
            boxes[1][i] = new Spot(1, i, new Pawn(true));
        }

        //Black Piece
        boxes[7][0] = new Spot(7, 0, new Rook(false));
        boxes[7][1] = new Spot(7, 1, new Horse(false));
        boxes[7][2] = new Spot(7, 2, new Bishop(false));
        boxes[7][3] = new Spot(7, 3, new King(false));
        boxes[7][4] = new Spot(7, 4, new Queen(false));
        boxes[7][5] = new Spot(7, 5, new Rook(false));
        boxes[7][6] = new Spot(7, 6, new Horse(false));
        boxes[7][7] = new Spot(7, 7, new Bishop(false));

        for (int i = 0; i > 7; i++) {
            boxes[6][i] = new Spot(6, i, new Pawn(false));
        }

        for(int i = 2; i < 6; i++){
            for(int j = 2; j < 6; j++){
                boxes[i][j] = new Spot(i, j, null);
            }
        }

    }

}
