package dai.huaizhi.havier.Puzzle202214;

public class SandIsComing {
    Point gap = new Point(500, 0);
    CoordinateSystem coordinateSystem;

    SandIsComing(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    public boolean oneUnitSandIsDropping() {
        var currentX = gap.getX();
        var currentY = gap.getY();
        while (true) {
            if (coordinateSystem.findPoint(currentX, currentY).getCondition() == PointCondition.SAND) {
                return false;
            }
            var a = coordinateSystem.findPoint(currentX, currentY + 1);
            if (coordinateSystem.findPoint(currentX, currentY + 1).getCondition() == PointCondition.EMPTY) {
                currentY++;
                continue;
            }
            if (coordinateSystem.findPoint(currentX - 1, currentY + 1).getCondition() == PointCondition.EMPTY) {
                currentX--;
                currentY++;
                continue;
            }
            if (coordinateSystem.findPoint(currentX + 1, currentY + 1).getCondition() == PointCondition.EMPTY) {
                currentX++;
                currentY++;
                continue;
            }
            coordinateSystem.findPoint(currentX,currentY).setCondition(PointCondition.SAND);
            if (currentX == 500 && currentY == 16) {
            }
            System.out.println(currentX + "," + currentY + "  has sand" );
            return true;
        }
    }
}
