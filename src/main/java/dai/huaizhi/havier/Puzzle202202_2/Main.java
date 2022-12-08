package dai.huaizhi.havier.Puzzle202202_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Round> rounds = new ArrayList<>();
        var data = new RawData().roundStrings;
        for (var element : data){
            var dat = element.split(" ");
            rounds.add(new Round(dat[0],dat[1] ));
        }

        int sum = 0;
        for (var round : rounds) {
            sum = sum + round.mark();
        }
        System.out.println(sum);
    }

}
