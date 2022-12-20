package dai.huaizhi.havier.Puzzle202215;



import dai.huaizhi.havier.Puzzle202214.HavierTimer;

import java.util.*;

public class Main {

    static HavierTimer timer = new HavierTimer();
    public static int edgeEnd = 4000000;

    private static int finalX;

    public static Map<Point, Point> coorPairs = new HashMap<>();

    static String[] information;
    public static void main(String[] args) {
        timer.start();
        information = RawData.INPUT.split("\n");

        addCoordinatesInformation();

        for (var i = 0; i < edgeEnd; i++) {
            if (i % 500000 == 0) {
                System.out.println("line: " + i);
            }
            if (!isThisLineFull(i)) {
                System.out.println("coordinate: " + finalX + ", " + i);
                break;
            }
        }

        System.out.println(timer.getCurrentTimer());
        timer.cancel();

    }

    private static boolean isThisLineFull(int lineNumber) {

        if (lineNumber == 15) {
            System.out.println();
        }

        var minX = 0;
        var maxX = 0;
        Map<Integer, Integer> remainedPiecesList = new HashMap<>();
        remainedPiecesList.put(0, edgeEnd);
        //information from every sensor
        for (var pair : coorPairs.entrySet()) {
            var sensorP = pair.getKey();
            var beaconP = pair.getValue();
            var targetDistance  =Math.abs(lineNumber - sensorP.getY());
            var radius = Math.abs(beaconP.getY() - sensorP.getY()) + Math.abs(beaconP.getX() - sensorP.getX());
            if (targetDistance > radius) {
                //not touch
                continue;
            }
            //if overlapped
            var range = radius - targetDistance;
            minX = Math.max(sensorP.getX() - range, 0);
            maxX = Math.min(sensorP.getX() + range, edgeEnd);
            remainedPiecesList = (cutRangeFromRemainedPart(remainedPiecesList, minX, maxX));
            if (remainedPiecesList.size() == 0) {
                break;
            }
        }


        for (var area : remainedPiecesList.entrySet()) {
            if (Objects.equals(area.getValue(), area.getKey())) {
                finalX = area.getKey();
                return false;
            }
        }
        return true;
    }

    private static Map<Integer, Integer> cutRangeFromRemainedPart(Map<Integer, Integer> leftPartList, int minX, int maxX) {
        Map<Integer, Integer> newMap = new HashMap<>();
        for (var entry : leftPartList.entrySet()) {
            if (entry.getValue() < minX || entry.getKey() >maxX ) {
                newMap.put(entry.getKey(), entry.getValue());
                continue;
            }
            if (entry.getKey() >= minX && entry.getValue() <= maxX) {
                continue;
            }
            if (entry.getKey() >= minX && entry.getValue() > maxX) {
                newMap.put(maxX + 1, entry.getValue());
                continue;
            }
            if (entry.getKey() < minX && entry.getValue() <= maxX) {
                newMap.put(entry.getKey(), minX -1);
                continue;
            }
            if (entry.getKey() < minX && entry.getValue() > maxX) {
                newMap.put(entry.getKey(), minX -1);
                newMap.put(maxX + 1, entry.getValue());
                continue;
            }
            System.out.println("what is wrong??");
        }
        return newMap;
    }

    private static void addCoordinatesInformation() {
        for (var info : information) {
            var sensor = info.split(":")[0];
            var sensorInfos = sensor.split(" ");
            Point sensorP  = getCoordinateByInfo(sensorInfos);
            var beacon = info.split(":")[1];
            var beaconInfors = beacon.split(" ");
            Point beaconP = getCoordinateByInfo(beaconInfors);
            coorPairs.put(sensorP, beaconP);
        }
    }


    private static Point getCoordinateByInfo(String[] sensorInfos) {
        Point p;
        var x = 0;
        var y = 0;
        for (var sInfo : sensorInfos) {
            if (sInfo.contains("x=")) {
                x = Integer.parseInt(sInfo.replaceAll("[^-0-9]", ""));
            }
            if (sInfo.contains("y=")) {
                y = Integer.parseInt(sInfo.replaceAll("[^-0-9]", ""));
            }
        }
        return new Point(x, y);
    }
}
