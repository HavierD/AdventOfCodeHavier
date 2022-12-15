package dai.huaizhi.havier.Puzzle202211;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static RawData rawData;
    public static List<Monkey> monkeys = new ArrayList<>();
    public static Long leastCommonMultiple = 9699690L;

    public static void main(String[] args) {


        rawData = new RawData();
        var configs = rawData.getMonkeysConfigurations();
        for (var i = 0; i < configs.length; i ++) {
            var features = configs[i].split("\n");
            var monkey = new Monkey(i);
            for (var feature : features) {
                if (feature.contains("Operation")) {
                    if (feature.contains("*")) {
                        if (feature.replaceAll("[^0-9]", "").length() == 0) {
                            monkey.setOperation(worry -> worry * worry);
                        } else {
                            var number = Integer.parseInt(feature.replaceAll("[^0-9]", ""));
                            monkey.setOperation(worry -> worry * number);
                        }
                    } else {
                        var number = Integer.parseInt(feature.replaceAll("[^0-9]", ""));
                        monkey.setOperation(worry -> worry + number);
                    }
                }
                if (feature.contains("Test")) {
                    var number = Integer.parseInt(feature.replaceAll("[^0-9]", ""));
                    monkey.setTester(worry -> worry % number);
                }
                if (feature.contains("true")) {
                    var number = Integer.parseInt(feature.replaceAll("[^0-9]", ""));
                    monkey.setIfTrueTargetMonkey(number);
                }
                if (feature.contains("false")) {
                    var number = Integer.parseInt(feature.replaceAll("[^0-9]", ""));
                    monkey.setIfFalseTargetMonkey(number);
                }
                if (feature.contains("arting item")) {
                    feature = feature.replaceAll("[a-z A-Z:]", "");
                    var numbers = feature.split(",");
                    for (var j = 0; j< numbers.length; j++) {
                        monkey.addItem(new Item(monkey.getId()+ j +  numbers[j],
                                Long.parseLong(numbers[j])));
                    }
                }
            }
            monkeys.add(monkey);
        }


        for (var i = 0; i < 10000; i++) {
            oneRound();
        }



        var a = calculateMonkeyBusiness();
        System.out.println(a);
//        printAllTimes();
//        System.out.println();

    }


    public static Monkey findMonkeyById(int id) {
        for (var monkey : monkeys) {
            if (monkey.getId() == id) {
                return monkey;
            }
        }
        throw new RuntimeException("no monkey's id is: " + id);
    }

    private static void oneRound() {
        for (var monkey : monkeys) {
            monkey.inspectItems();
        }
    }

    private static long calculateMonkeyBusiness() {
        var firstBiggest = 0L;
        var secondBiggest = 0L;
        for (var monkey : monkeys) {
            if (monkey.getInspectingTimes() > Math.min(firstBiggest, secondBiggest)) {
                firstBiggest = Math.max(firstBiggest, secondBiggest);
                secondBiggest = monkey.getInspectingTimes();
            }
        }
        return  firstBiggest * secondBiggest;
    }

    private static void printAllTimes() {
        for (var monkey : monkeys) {
            System.out.println("monkey " + monkey.getId() + " : " + monkey.getInspectingTimes());
        }
    }
}
