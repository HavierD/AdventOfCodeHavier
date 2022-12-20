package dai.huaizhi.havier.Puzzle202213;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {


    static String[] pairs;
    public static List<APackage> packages = new ArrayList<>();
    private static List<AList> allSignal = new ArrayList<>();

    public static void main(String[] args) {
        var rawData = new RawData();
        pairs = rawData.getPairs();

        for (var i = 1; i <= pairs.length; i++) {
            packages.add(new APackage(pairs[i-1]));
        }

        for (var pag : packages) {
            allSignal.add(pag.leftList);
            allSignal.add(pag.rightList);
        }
        allSignal.add(new AList("[[2]]"));
        allSignal.add(new AList("[[6]]"));







        allSignal = allSignal.stream().sorted((first, second) -> first.comparedIntResult(second)).collect(Collectors.toList());

        var index = 1;
        var first = 0;
        var second = 0;
        for (var a : allSignal) {
            if(a.getValue().equals("[[2]]")){
                first = index;
                System.out.println("[[2]]: " + index);
            }
            if (a.getValue().equals("[[6]]")) {
                second = index;
                System.out.println("[[6]]: " + index);
            }

            index++;

        }
        System.out.println("key: " + first * second);


    }
}
