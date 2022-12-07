package dai.huaizhi.havier.Puzzle202204;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strings = RawData.allPairs.split("\n");
        List<Pair> pairs = new ArrayList<>();
        for (String string : strings) {
            pairs.add(new Pair(string));
        }
        var containdCount = 0;
        var overlapedCount = 0;
        for(Pair pair : pairs){
            if(pair.doesContain()){
                containdCount ++;
            }
        }
        System.out.println("contains count: ");
        System.out.println(containdCount);
        for(var pair : pairs){
            if(pair.doesOverlap()){
                overlapedCount ++;
            }
        }

        System.out.println("Overlapped count: ");
        System.out.println(overlapedCount);

    }
}
