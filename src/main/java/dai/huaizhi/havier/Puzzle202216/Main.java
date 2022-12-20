package dai.huaizhi.havier.Puzzle202216;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static dai.huaizhi.havier.Puzzle202216.Matirx.aaa;

public class Main {


    public static List<Valve> pressureValves = new ArrayList<>();
    public static List<Valve> allValves = new ArrayList<>();
    public static String[] inputs;
    public static List<Route> routes = new ArrayList<>();
    public static Integer biggestPressure = 0;

    static int totalPressure = 0;
    static Valve AA ;
    static Valve currentValve;

    public static void main(String[] args) throws IOException {

        var rawdata = new RawData();
        //instantiate all valves
        for (var line : rawdata.inputs) {
            var segs = line.split(" ");
            var valve = new Valve(segs[1],Integer.parseInt(segs[4].replaceAll("[^0-9]", "")));
            valve.setIndex(Integer.parseInt(segs[0].replaceAll("[^0-9]", "")));
            if (valve.getPressure() != 0) {
                pressureValves.add(valve);
            }




            for (var i = 9; i < segs.length; i++) {
                valve.addConnectedValve(segs[i].replaceAll(",", ""));
            }
            allValves.add(valve);
        }

        //populate aaa
        for (var i = 0; i < allValves.size(); i++) {
            for (var j = 0; j < allValves.size(); j++) {
                aaa[i][j] = 999;
            }
        }
        for (var i = 0; i < allValves.size(); i++) {
            var thisValve = allValves.get(i);
            aaa[i][i] = 0;
            for (var connectedValve : thisValve.getConnectedValves()) {
                var column = findValveById(connectedValve).getIndex();
                aaa[i][column] = 1;
            }
        }
        for (var k = 0; k < aaa.length; k++) {
            for (var i = 0; i < aaa.length; i++) {
                for (var j = 0; j < aaa.length; j++) {
                    if (aaa[i][j] > aaa[i][k] + aaa[k][j]) {
                        aaa[i][j] = aaa[i][k] + aaa[k][j];
                    }
                }
            }
        }

//        for (var aa : aaa) {
//            System.out.println(Arrays.toString(aa));
//        }

        System.out.println("TEST");
        System.out.println(calculateMinutesBetweenValves(findValveById("ZS"),findValveById("UJ")));



        AA = findValveById("AA");
        currentValve = AA;

        formRoutes();
        System.out.println(biggestPressure);


        System.out.println("all distances:");
//        for (var p : pressureValves) {
//            var iee = calculateMinutesBetweenValves(findValveById("AA"), p);
//            System.out.print("to : " + p.getId());
//            System.out.println(iee);
//        }


    }/////////////////////////////////main end







    private static void formRoutes() {

        for (var valve : pressureValves) {
            currentValve = findValveById("AA");
            int currentPressure1 = 0;
            int remainedMinus = 30;
            List<String> routeRecord = new ArrayList<>();
            var mi = calculateMinutesBetweenValves(currentValve, valve);
            remainedMinus = remainedMinus - mi - 1; //minutes cost
            currentPressure1 = currentPressure1 + remainedMinus * valve.getPressure(); //pressure get
            currentValve = valve;
            routeRecord.add(currentValve.getId()); //road record
            var list1 = removeOneValve(pressureValves, valve);

            if (valve.getId().equals("JT")) {
                System.out.println();
            }


            if (list1.size() != 0) {
                findNextValve(routeRecord, remainedMinus, currentPressure1, list1);
            }

        }

    }

    private static void findNextValve(List<String> routeRecord, int remainedMinus, int currentPressure,
                                      List<Valve> remainedList) {
        List<String> routeRecord2 = new ArrayList<>(routeRecord);


        var hasPushedParentRoute = false;
        for (var valve2 : remainedList) {
            var mi2 = calculateMinutesBetweenValves(currentValve, valve2);
            if (remainedMinus - mi2 - 1 < 1) {
                if (hasPushedParentRoute) {
                } else {
                    System.out.println("record: " + routeRecord2);
                    System.out.println("pressure: " + currentPressure);
                    competePressure(currentPressure);
                    hasPushedParentRoute = true;
                }
                continue;
            }
            remainedMinus = remainedMinus - mi2 - 1;
            currentPressure = currentPressure + remainedMinus * valve2.getPressure();
            currentValve = valve2;
            routeRecord2.add(currentValve.getId());
            var list2 = removeOneValve(remainedList, valve2);

            findNextValve(routeRecord2, remainedMinus, currentPressure, list2);
//            for (var valve3 : list2) {
//                var mi3 = calculateMinutesBetweenValves(currentValve, valve3);
//                if (remainedMinutes - mi3 - 1 > 30) {
//                    competeBiggest(totalPressure);
//                    continue;
//                }
//                remainedMinutes = remainedMinutes - mi3 - 1;
//                totalPressure = totalPressure + remainedMinutes * valve2.getPressure();
//                var list3 = removeOneValve(list2, valve3);
//            }
        }
    }

    private static void competePressure(int pressure) {
        if (pressure > biggestPressure) {
            biggestPressure = pressure;
        }
    }

    private static List<Valve> removeOneValve(List<Valve> list, Valve removed) {
        List<Valve> newList = new ArrayList<>();
        for (var one : list) {
            if (one.getId().equals(removed.getId())) {
                continue;
            }
            newList.add(one);
        }
        return newList;
    }

    public static void findNextPoint(Route formingRoute, List<Valve> remainedValve) {
        for (var pv2 : remainedValve) {
            formingRoute.addAPoint(pv2);
            routes.add(new Route(formingRoute.getRoute()));

            List<Valve> remained = new ArrayList<>();
            for (var e : remainedValve) {
                if (e.getId().equals(pv2.getId())) {
                    continue;
                }
                remained.add(e);
            }
            System.out.println("current: " + formingRoute.routesOrderString());
            if (remained.size() != 0) {
                findNextPoint(formingRoute, remained);
            }
        }
    }


    public static Valve findValveByIndex(int index) {
        for (var valve : allValves) {
            if (valve.getIndex() == index) {
                return valve;
            }
        }
        throw new RuntimeException("no valve found by index: " + index);
    }

    public static Valve findValveById(String id) {
        for (var valve : allValves) {
            if (valve.getId().equals(id) ) {
                return valve;
            }
        }
        throw new RuntimeException("no valve found by id: " + id);
    }

    public static int calculateMinutesBetweenValves(Valve startValve, Valve endValve) {
        var index1 = startValve.getIndex();
        var index2 = endValve.getIndex();
        return aaa[index1][index2];
    }
}
