package dai.huaizhi.havier.Puzzle202204;

public class Pair {
    private String leftAssignment;
    private String rightAssignment;
    private int leftMin;
    private int leftMax;
    private int rightMin;
    private int rightMax;

    Pair(String assignment){
        String[] a = assignment.split(",");
        leftAssignment = a[0];
        rightAssignment = a[1];
        String[] leftAssignments = leftAssignment.split("-");
        String[] rightAssignments = rightAssignment.split("-");
        leftMin = Integer.parseInt(leftAssignments[0]);
        leftMax = Integer.parseInt(leftAssignments[1]);
        rightMin = Integer.parseInt(rightAssignments[0]);
        rightMax = Integer.parseInt(rightAssignments[1]);
    }

    public int getLeftMin() {
        return leftMin;
    }

    public int getLeftMax() {
        return leftMax;
    }

    public int getRightMin() {
        return rightMin;
    }

    public int getRightMax() {
        return rightMax;
    }

    public boolean doesContain(){
        if(leftMin == rightMin) return true;
        if(leftMin < rightMin ){
            return leftMax >= rightMax;
        }
        return leftMax <= rightMax;
    }

    public boolean doesOverlap(){
        if(leftMax < rightMin){
            return false;
        }
        if(leftMin > rightMax){
            return false;
        }
        return true;
    }


}
