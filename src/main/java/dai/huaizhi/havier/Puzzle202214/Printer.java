package dai.huaizhi.havier.Puzzle202214;

public class Printer {
    CoordinateSystem coordinateSystem;

    Printer(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }


    /**
     *              for (var x = 482; x <= 545; x++) {
     *              for (var y = 0; y <= 166; y++) {
     */
    public void print() {
        for (var y = 0; y <= 166; y++) {
            if (y < 100) {
                System.out.print(000);
            }else {
                System.out.print(y);
            }
            for (var x = 482; x <= 545; x++) {
                if (coordinateSystem.findPoint(x, y).getCondition() == PointCondition.START) {
                    System.out.print("+");
                    continue;
                }
                if (coordinateSystem.findPoint(x, y).getCondition() == PointCondition.SAND) {
                    System.out.print("O");
                    continue;
                }
                if (coordinateSystem.findPoint(x, y).getCondition() == PointCondition.EMPTY) {
                    System.out.print(".");
                    continue;
                }
                if (coordinateSystem.findPoint(x, y).getCondition() == PointCondition.ROCK) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
