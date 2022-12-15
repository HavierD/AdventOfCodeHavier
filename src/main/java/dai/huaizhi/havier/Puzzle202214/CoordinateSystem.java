package dai.huaizhi.havier.Puzzle202214;

import java.util.ArrayList;
import java.util.List;

public class CoordinateSystem {
    List<Point> points = new ArrayList<>();


    /**
     *
     * coordinate ranges: x: 483 - 544
     *                    y: 16 - 164 + 2
     */
    CoordinateSystem() {
        for (var x = 282; x <= 745; x++) {
            for (var y = 0; y <= 167; y++) {
                points.add(new Point(x, y));
            }
        }
    }

    public void drawRocks(String[] rockCorners) {
        int previousX = 0;
        int previousY = 0;
        for (var corner : rockCorners) {
            if (previousX == 0) {
                var x = corner.split(",")[0];
                var y = corner.split(",")[1];
                previousX = Integer.parseInt(x);
                previousY = Integer.parseInt(y);
                continue;
            }
            var x = Integer.parseInt( corner.split(",")[0]);
            var y = Integer.parseInt(corner.split(",")[1]);
            drawRocksBy2Coordinates(previousX, previousY, x, y);
            previousX = x;
            previousY = y;
        }
    }

    private void drawRocksBy2Coordinates(int previousX, int previousY, int x, int y) {
        for (var xi = Math.min(previousX, x); xi <= Math.max(previousX, x); xi++) {
            for (var yi = Math.min(previousY, y); yi <= Math.max(previousY,y); yi++) {
                Point point = findPoint(xi, yi);
                point.setCondition(PointCondition.ROCK);
            }
        }
    }

    public Point findPoint(int x, int y) {
        for (var point : points) {
            if (point.getX() == x && point.getY() == y) {
                return point;
            }
        }
        throw new RuntimeException("coordinate out of range." + x + " " + y);
    }
}
