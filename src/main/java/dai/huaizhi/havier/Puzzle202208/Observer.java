package dai.huaizhi.havier.Puzzle202208;

import java.util.*;

public class Observer {
    List<Tree> forest;

    List<Tree> rawVisibleTree = new ArrayList<>();
    Set<Tree> visibleTree = new HashSet<>();

    Observer(List<Tree> forest){
        this.forest = forest;
        visibleTreesFromBottom();
        visibleTreesFromTop();
        visibleTreesFromLeft();
        visibleTreesFromRight();
        visibleTree.addAll(rawVisibleTree);
    }

    public int visibleTreesFromLeft() {
        var sum = 0;
        for (var i = 0; i < 99; i++) {
            var row = getTreesByRowNumber(i);
            var increasingHeight = -1;
            //point one by one
            for (var tree : row) {
                if (tree.getHeight() > increasingHeight){
                    rawVisibleTree.add(tree);
                    sum += 1;
                    increasingHeight = tree.getHeight();
                }
            }
        }
        return sum;
    }

    public int visibleTreesFromRight(){
        var sum = 0;
        for (var i = 0; i < 99; i++) {
            var row = getTreesByRowNumber(i);
            var increasingHeight = -1;
            Collections.reverse(row);
            for (var tree : row) {
                if (tree.getHeight() > increasingHeight){
                    rawVisibleTree.add(tree);
                    sum += 1;
                    increasingHeight = tree.getHeight();
                }
            }
        }
        return sum;
    }

    public int visibleTreesFromTop(){
        var sum = 0;
        for (var i = 0; i < 99; i++) {
            var column = getTreesByColumnNumber(i);
            var increasingHeight = -1;
            for (var tree : column) {
                if (tree.getHeight() > increasingHeight) {
                    rawVisibleTree.add(tree);
                    sum += 1;
                    increasingHeight = tree.getHeight();
                }
            }
        }
        return sum;
    }

    public int visibleTreesFromBottom(){
        var sum = 0;
        for (var i = 0; i < 99; i++) {
            var column = getTreesByColumnNumber(i);
            var increasingHeight = -1;
            Collections.reverse(column);
            for (var tree : column) {
                if (tree.getHeight() > increasingHeight) {
                    rawVisibleTree.add(tree);
                    sum += 1;
                    increasingHeight = tree.getHeight();
                }
            }
        }
        return sum;
    }













    private List<Tree> getTreesByRowNumber(int row){
        List<Tree> re = new ArrayList<>();
        for (var point : forest) {
            if(point.getX() == row){
                re.add(point);
            }
        }
        return re;
    }

    private List<Tree> getTreesByColumnNumber(int column) {
        List<Tree> re = new ArrayList<>();
        for (var point : forest) {
            if (point.getY() == column) {
                re.add(point);
            }
        }
        return re;
    }

    public Set<Tree> getVisibleTree() {
        return visibleTree;
    }
}
