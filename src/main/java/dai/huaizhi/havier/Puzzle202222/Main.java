package dai.huaizhi.havier.Puzzle202222;

public class Main {


    public static ForestMap forestMap;
    public static Walker walker;

    public static void main(String[] args) {

        //initialization
        forestMap = new ForestMap(RawData.input);
        walker = new Walker(forestMap.startPoint(), RawData.input0, forestMap);



        //start
        walker.depart();
        //result
        var rowP = walker.currentPoint().y() * 1000;
        var columnP = walker.currentPoint().x() * 4;
        var faceP = -1;
        switch (walker.currentFaceTo()) {
            case UP:
                faceP = 3;
                break;
            case DOWN:
                faceP = 1;
                break;
            case LEFT:
                faceP = 2;
                break;
            case RIGHT:
                faceP = 0;
                break;
            default:
                throw new RuntimeException("Wrong direction!");
        }

        var result = rowP + columnP + faceP;
        System.out.println(rowP);
        System.out.println(columnP);
        System.out.println(faceP);
        System.out.println("result: " + result);

    }
}
