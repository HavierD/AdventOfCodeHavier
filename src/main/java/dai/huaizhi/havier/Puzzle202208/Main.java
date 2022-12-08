package dai.huaizhi.havier.Puzzle202208;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Tree> forest = new ArrayList<>();
    public static void main(String[] args) {

        //add values to forest
        var rawData = new RawData();
        var inputs = rawData.getInputs();
        for (var i = 0; i < inputs.size(); i++) {
            var intListRow = inputs.get(i).split("");
            for (var j = 0; j < intListRow.length; j++) {
                forest.add(new Tree(i, j, intListRow[j]));
            }
        }

        var observer = new Observer(forest);

        var leftSum = observer.visibleTreesFromLeft();
        var rightSum = observer.visibleTreesFromRight();


        List<ScenicScorer> scorers = new ArrayList<>();
        for (var tree : forest) {
            scorers.add(new ScenicScorer(forest, tree));
        }

        var highestScore = 0;
        for (var scorer : scorers){
            var score = scorer.score();
            if(score > highestScore){
                highestScore = scorer.score();
            }
        }
        System.out.println(highestScore);

    }
}
