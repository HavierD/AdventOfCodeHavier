package dai.huaizhi.havier.Puzzle202208;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class ScenicScorer {
    final private List<Tree> forest;
    final private Tree tree;
    ScenicScorer(List<Tree> forest, Tree tree){
        this.forest = forest;
        this.tree = tree;
    }



    public int score(){
        if(tree.getX() == 0 || tree.getY() == 0 || tree.getX() == 98 || tree.getY() == 98){
            return 0;
        }
        int upperScore = calculateUpperScore();
        int lowerScore = calculateLowwerScore();
        int leftScore = calculateLeftScore();
        int rightScore = calculateRightScore();

        if(upperScore == 0 || lowerScore == 0 || leftScore == 0 || rightScore == 0){
            return 0;
        }
        if(upperScore * lowerScore * leftScore * rightScore == 23247000){
            System.out.println(tree);
        }
        if(upperScore * lowerScore * leftScore * rightScore == 302526){
            List<Tree> list = new ArrayList<>();
            for (var i = 0; i < 99; i++) {
                list.add(getTreeByCoordinate( i, tree.getY()));
            }
            for (var e : list) {
                System.out.println(e.getHeight());
            }
            System.out.println();
        }

        return upperScore * lowerScore * leftScore * rightScore;
    }

    private int calculateRightScore() {
        List<Tree> rightTrees = new ArrayList<>();
        for (var i = tree.getX() + 1; i < 99; i++) {
            rightTrees.add(getTreeByCoordinate(i, tree.getY()));
        }
        var a = getHorizontalDistanceOfFirstEqualOrHigherTree(tree, rightTrees);
        var b = a;
        return a;
    }

    private int calculateLeftScore() {
        List<Tree> upperTrees = new ArrayList<>();
        for (var i = tree.getX() - 1; i > 0; i--) {
            upperTrees.add(getTreeByCoordinate( i, tree.getY()));
        }
        return getHorizontalDistanceOfFirstEqualOrHigherTree(tree, upperTrees);

    }

    private int calculateLowwerScore() {
        List<Tree> lowerTrees = new ArrayList<>();
        for (var i = tree.getY() + 1; i < 99; i++) {
            lowerTrees.add(getTreeByCoordinate(tree.getX(), i));
        }
        return getVerticalDistanceOfFirstEqualOrHigherTree(tree, lowerTrees);
    }

    private int calculateUpperScore() {
        List<Tree> upperTrees = new ArrayList<>();
        for (var i = tree.getY() - 1; i > 0; i--) {
            upperTrees.add(getTreeByCoordinate(tree.getX(), i));
        }
        return getVerticalDistanceOfFirstEqualOrHigherTree(tree, upperTrees);
    }



    private int getVerticalDistanceOfFirstEqualOrHigherTree(Tree tree, List<Tree> treeLine){

        if(tree.getX() == 75 && tree.getY() ==90){
            System.out.println();
        }

        if(treeLine.size() == 0 ){
            return 0;
        }
        for (var tree1 : treeLine) {
            if(tree1.getHeight() >= tree.getHeight()){
                return abs(tree.getY() - tree1.getY());
            }
        }
        if(treeLine.get(0).getY() > tree.getY()){
            return 98-tree.getY();
        }
        return tree.getY();
    }
    private int getHorizontalDistanceOfFirstEqualOrHigherTree(Tree tree, List<Tree> treeLine){
        if(treeLine.size() == 0 ){
            return 0;
        }
        for (var tree1 : treeLine) {
            if(tree1.getHeight() >= tree.getHeight()){
                return abs(tree.getX() - tree1.getX());
            }
        }
        if (treeLine.get(0).getX() > tree.getX()) {
            return 98 - tree.getX();
        }
        return tree.getX() ;
    }


    private Tree getTreeByCoordinate(int x, int y) {
        for (var tree : forest) {
            if (tree.getX() == x && tree.getY() == y) {
                return tree;
            }
        }
        System.out.println("didn't get a tree!!!");
        return new Tree(0,0,"0");
    }
}
