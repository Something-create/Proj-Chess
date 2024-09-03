import java.util.List;

public class Game {
    private Player[] players;
    private Board boards;
    private Player currentPlayer;
    private GameStatus status;
    private List<Move> movesPlayed;

    private void initialize(Player p1, Player p2) {
        players[0] = p1;
        players[1] = p2;

        boards.resetBoard();

        if (p1.isWhiteSide()) {

            this.currentPlayer = p1;
        } else {
            this.currentPlayer = p2;
        }

        movesPlayed.clear();
    }

    public boolean isEnd() {
        return this.getStatus() != GameStatus.ACTIVE;
    }

    private GameStatus getStatus() {
        return this.status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    //TODO
    public boolean playerMove(Player player, int startX, int startY, int endX, int endY){
        Spot startBox = boards,getBox(startX, startY);
        Spot endBox =  boards,getBox(endX, endY);
        Move move = new Move(player, startBox, endBox);
        return this.makeMove(move,player);
    }

    //TODo
    private boolean makeMove(Move move, Player player){
        return false;
    }

}
