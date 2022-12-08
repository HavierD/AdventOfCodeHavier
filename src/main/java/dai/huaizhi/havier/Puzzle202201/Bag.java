package dai.huaizhi.havier.Puzzle202201;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    List<String> foodList = new ArrayList<>();
    int sumCal;

    Bag(String foodString){
        var raw = foodString.split("\n");
        foodList.addAll(List.of(raw));
        sumCal = totalCalories();
    }

    private int totalCalories(){
        int sum = 0;
        for (var food : foodList) {
            if(food.equals("")){
                continue;
            }
            var cal = Integer.parseInt(food);
            sum += cal;
        }
        return sum;
    }

    public int getSumCal() {
        return sumCal;
    }
}
