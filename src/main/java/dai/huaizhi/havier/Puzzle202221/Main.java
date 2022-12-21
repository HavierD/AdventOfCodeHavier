package dai.huaizhi.havier.Puzzle202221;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static final List<Monkey> monkeys = new ArrayList<>();

    public static void main(String[] args) {

        /**
         * initializations
         */
        String[] monkeyInfos = RawData.input.split("\n");
        //populate monkeys
        for (var infos : monkeyInfos) {
            var info = infos.split(" ");
            if (info.length == 4) {
                monkeys.add(new MonkeyCalculate(info[0].replaceAll(":", ""), info[2]));
            } else if (info.length == 2) {
                monkeys.add(new MonkeyYell(info[0].replaceAll(":", ""), info[1]));
            } else {
                throw new RuntimeException("instantiating wrong!");
            }
        }
        //connect monkeys
        for (var infos : monkeyInfos) {
            var info = infos.split(" ");
            if (info.length == 4) {
                MonkeyCalculate baseMonkey = (MonkeyCalculate) findMonkeyById(info[0].replaceAll(":", ""));
                var first = findMonkeyById(info[1]);
                var second = findMonkeyById(info[3]);
                baseMonkey.setFirstMonkey(first);
                baseMonkey.setSecondMonkey(second);
            } else if (info.length == 2) {
            } else {
                throw new RuntimeException("connect monkeys wrong!");
            }
        }
        //reset humn
        var humn = (MonkeyYell) findMonkeyById("humn");
        var root = (MonkeyCalculate)findMonkeyById("root");
        long i = 3305669000000L;
        while (root.getFirstMonkey().provideNumber() != root.getSecondMonkey().provideNumber()) {
            var a = root.getFirstMonkey().provideNumber();
            var b = root.getSecondMonkey().provideNumber();
            i++;
            humn.setNumber(i);
            if (i % 1000000 == 0) {
                System.out.println("times: " + i);
            }
        }
        System.out.println("got i: " + i);


    }

    private static Monkey findMonkeyById(String id) {
        for (var monkey : monkeys) {
            if (monkey.id().equals(id)) return monkey;
        }
        throw new RuntimeException("cannot find monkey whose id is:" + id);
    }
}
