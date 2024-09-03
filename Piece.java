
public abstract class Piece {

    private boolean killed = false;
    private boolean white = false;

    public Piece(boolean white) {
        this.white = white;
    }

    public boolean is_killed() {
        return this.killed;
    }

    public void set_killed(boolean killed) {
        this.killed = killed;
    }

    public boolean is_white() {
        return this.white;
    }

    public void set_white(boolean white) {
        this.white = white;
    }

    public abstract Boolean canMove(Board board, Spot start, Spot end);

}
