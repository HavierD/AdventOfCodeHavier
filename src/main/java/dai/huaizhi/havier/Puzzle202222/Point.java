package dai.huaizhi.havier.Puzzle202222;

public class Point {
    private final int x;
    private final int y;
    private final State state;


    public Point(int x, int y, State state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public State state() {
        return state;
    }
}
