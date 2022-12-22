package dai.huaizhi.havier.Puzzle202222;

import java.util.ArrayList;
import java.util.List;

public class ForestMap {

    private final Point startPoint;
    private final List<Point> pointsOnMap = new ArrayList<>();

    ForestMap(String longString) {
        var lines = longString.split("\n");
        for (var y = 1; y <= lines.length; y++) {
            var points = lines[y - 1].split("");
            for (var x = 1; x <= points.length; x++) {

                var point = points[x - 1];
                if (point.equals(" ")) {
                    continue;
                }
                if (point.equals(".")) {
                    pointsOnMap.add(new Point(x, y, State.GROUND));
                    continue;
                }
                if (point.equals("#")) {
                    pointsOnMap.add(new Point(x, y, State.WALL));
                }
            }
        }
        startPoint = pointsOnMap.get(0);
    }

    public Point startPoint() {
        return startPoint;
    }
    private List<Point> getARow(int row) {
        List<Point> re = new ArrayList<>();
        for (var point : pointsOnMap) {
            if (point.y() == row) {
                re.add(point);
            }
        }
        return re;
    }

    private List<Point> getAColumn(int column) {
        List<Point> re = new ArrayList<>();
        for (var point : pointsOnMap) {
            if (point.x() == column) {
                re.add(point);
            }
        }
        return re;
    }

    public Point findNextPoint(int currentX, int currentY, Direction direction) {
        switch (direction) {
            case UP:
                currentY--;
                break;
            case DOWN:
                currentY++;
                break;
            case LEFT:
                currentX--;
                break;
            case RIGHT:
                currentX++;
                break;
            default:
                throw new RuntimeException("Wrong direction!");
        }
        for (var point : pointsOnMap) {
            if (point.x() == currentX && point.y() == currentY) {
                return point;
            }
        }
        switch (direction) {
            case UP:
                var u = getAColumn(currentX);
                return u.get(u.size() - 1);
            case DOWN:
                var d = getAColumn(currentX);
                return d.get(0);
            case LEFT:
                var l = getARow(currentY);
                return l.get(l.size() - 1);
            case RIGHT:
                var r = getARow(currentY);
                return r.get(0);
            default:
                throw new RuntimeException("Wrong direction!");
        }


    }

    public Point findPointByCoordinate(int x, int y) {
        for (var point : pointsOnMap) {
            if (point.x() == x && point.y() == y) {
                return point;
            }
        }
        throw new RuntimeException("cannot find this point " + x + "," + y);
    }

    public Direction newDirectionByChangedPlane(int currentX, int currentY, Direction direction) {
        switch (direction) {
            case UP:
                currentY--;
                break;
            case DOWN:
                currentY++;
                break;
            case LEFT:
                currentX--;
                break;
            case RIGHT:
                currentX++;
                break;
            default:
                throw new RuntimeException("Wrong direction!");
        }
        for (var point : pointsOnMap) {
            if (point.x() == currentX && point.y() == currentY) {
                return null;
            }
        }

    }

}
