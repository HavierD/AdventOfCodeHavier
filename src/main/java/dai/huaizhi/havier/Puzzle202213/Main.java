package dai.huaizhi.havier.Puzzle202213;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static String[] pairs;
    public static List<APackage> packages = new ArrayList<>();
    public static void main(String[] args) {
        var rawData = new RawData();
        pairs = rawData.getPairs();
        System.out.println("pairs length: " + pairs.length);

        var indicesSum = 0;

        //populate packages
        for (var i = 1; i <= pairs.length; i++) {
            packages.add(new APackage(pairs[i-1]));
        }

        for (var i = 1; i <= packages.size(); i++) {

            var test = packages.get(i-1).isRightOrder();

            if(test){
                indicesSum += i;
                var ttt =  packages.get(i-1);
                System.out.println("new index: " + i);
            }
        }

        System.out.println("RESULT:");

        System.out.println(indicesSum);


    }



//    private static boolean isRightOrder(String left, String right) {
//        var leftChars = left.split("");
//
//    }
}
