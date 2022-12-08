package dai.huaizhi.havier.Puzzle202201;

import java.util.Arrays;

public class Main {


    static int[] topThree = {0, 3, 2};

    public static void main(String[] args) {


        var data = new RawData();
        var bags = data.getBags();
        var tempCal = 0;
        for (var bag : bags) {
            if (bag.getSumCal() > tempCal) {
                tempCal = bag.getSumCal();
            }
        }
//        System.out.println(tempCal);

        for (var bag : bags) {
            collectTop3(bag);
        }
        System.out.println("top 3: ");
        System.out.println(Arrays.toString(topThree));
        System.out.println("top 3 total:");
        System.out.println(Arrays.stream(topThree).sum());


    }

    private static void collectTop3(Bag bag) {
        sort();
        if(bag.getSumCal() > topThree[0]){
            topThree[0] = bag.getSumCal();
        }
    }

    private static void sort(){
        topThree = Arrays.stream(topThree).sorted().toArray();
    }
}
