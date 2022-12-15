package dai.huaizhi.havier.Puzzle202214;

import dai.huaizhi.havier.Puzzle202213.Int;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /**
     *
     * coordinate ranges: x: 483 - 544
     *                    y: 16 - 164
     */

    static CoordinateSystem coordinateSystem;


    public static void main(String[] args) {

        var timer = new HavierTimer();
        timer.start();



        coordinateSystem = new CoordinateSystem();
        var rawData = new RawData();
        var rockLines = rawData.getRockLines();
        for (var rockLine : rockLines) {
            var rockCorners = rockLine.split(" -> ");
            coordinateSystem.drawRocks(rockCorners);
        }
        coordinateSystem.findPoint(500, 0).setCondition(PointCondition.START);

        //sand is coming!
        var sand = new SandIsComing(coordinateSystem);
        var dropping = true;
        while (dropping) {
            dropping = sand.oneUnitSandIsDropping();
        }

        var sum = 0;
        for (var point : coordinateSystem.points) {
            if (point.getCondition() == PointCondition.SAND) {
                sum++;
            }
        }

        System.out.println("SUM: " + sum);
        var printer = new Printer(coordinateSystem);
        printer.print();

        System.out.println(timer.getCurrentTimer());
        timer.cancel();
    }

}
