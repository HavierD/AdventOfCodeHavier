package dai.huaizhi.havier.Puzzle202215;

public class Point {
    private int x;
    private int y;
    private boolean noBeacon = false;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setNoBeacon(boolean noBeacon) {
        this.noBeacon = noBeacon;
    }
}
