package dai.huaizhi.havier.Puzzle202222;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Walker {
    private Direction currentFaceTo = Direction.RIGHT;
    private Point currentPoint;
    private String[] walkingCommand;
    private ForestMap map;
    private List<Point> routeRecords = new ArrayList<>();

    Walker(Point point, String walkingCommand, ForestMap map) {
        this.currentPoint = point;
        this.walkingCommand = walkingCommand.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        this.map = map;
    }



    public void depart() {
        for (var command : walkingCommand) {
            try {
                var c = Integer.parseInt(command);
                walkStep(c);
            } catch (NumberFormatException e) {
                turnAround(command);
            }
        }

    }

    private void turnAround(String command) {
        if (command.equals("R")) {
            switch (currentFaceTo) {
                case UP:
                    currentFaceTo = Direction.RIGHT;
                    break;
                case DOWN:
                    currentFaceTo = Direction.LEFT;
                    break;
                case LEFT:
                    currentFaceTo = Direction.UP;
                    break;
                case RIGHT:
                    currentFaceTo = Direction.DOWN;
                    break;
                default:
                    throw new RuntimeException("Wrong direction!");
            }
        }
        if (command.equals("L")) {
            switch (currentFaceTo) {
                case UP:
                    currentFaceTo = Direction.LEFT;
                    break;
                case DOWN:
                    currentFaceTo = Direction.RIGHT;
                    break;
                case LEFT:
                    currentFaceTo = Direction.DOWN;
                    break;
                case RIGHT:
                    currentFaceTo = Direction.UP;
                    break;
                default:
                    throw new RuntimeException("Wrong direction!");
            }
        }
    }

    private void walkStep(int steps) {
        for (var i = 1; i <= steps; i++) {
            int x = currentPoint.x();
            int y = currentPoint.y();
            var possibleNewDirection = map.newDirectionByChangedPlane(x, y, currentFaceTo);
            if ( possibleNewDirection != null) {
                currentFaceTo = possibleNewDirection;
            }
            var a = map.findNextPoint(x, y, currentFaceTo);
            if (a.state() == State.WALL) {
                updateStandingPoint(map.findPointByCoordinate(x, y));
                break;
            }
            updateStandingPoint(a);
        }
    }


    public Point currentPoint() {
        return currentPoint;
    }

    public Direction currentFaceTo() {
        return currentFaceTo;
    }

    private void updateStandingPoint(Point newPoint) {
        this.currentPoint = newPoint;
        routeRecords.add(newPoint);
    }
}
