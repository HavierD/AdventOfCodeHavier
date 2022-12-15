package dai.huaizhi.havier.Puzzle202214;

public class Point {
    private int x;
    private int y;
    PointCondition condition = PointCondition.EMPTY;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public PointCondition getCondition() {
        return condition;
    }

    public void setCondition(PointCondition condition) {
        this.condition = condition;
    }
}
