package dai.huaizhi.havier.Puzzle202208;

public class Tree {
    private final int x;
    private final int y;
    private final int height;

    Tree(int x, int y, String height){
        this.x = x;
        this.y = y;
        this.height = Integer.parseInt(height);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }
}
