package dai.huaizhi.havier.Puzzle202212;

public class Point {
    private int x;
    private int y;
    private int elevation;
    private boolean best = false;
    private int distance = 9999;
    private Point previousPoint = null;
    private boolean onRoute = false;


    Point(int x, int y, char elevation){
        this.x = x;
        this.y = y;
        this.elevation = elevation;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public boolean isBest() {
        return best;
    }

    public void setBest(boolean best) {
        this.best = best;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Point getPreviousPoint() {
        return previousPoint;
    }

    public void setPreviousPoint(Point previousPoint) {
        this.previousPoint = previousPoint;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getElevation() {
        return elevation;
    }

    public boolean isOnRoute() {
        return onRoute;
    }

    public void setOnRoute(boolean onRoute) {
        this.onRoute = onRoute;
    }
}
