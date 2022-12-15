package dai.huaizhi.havier.Puzzle202212;

public class Main {

    public static Map map ;

    public static void main(String[] args) {

        map = new Map();
        var hasNextTurn = true;

        map.getStartPoint().setDistance(0);
        map.getStartPoint().setElevation('z');
        map.getEndPoint().setElevation('a');
        //looping all the points
        while (hasNextTurn) {
            hasNextTurn = false;
            hasNextTurn = isHasNextTurn(hasNextTurn);
        }
        var comparedD = 99999;
        for(var e : map.getPointsByElevation()){
            if (e.getDistance() < comparedD) {
                comparedD = e.getDistance();
            }
        }
        System.out.println("2nd final answer:");

        System.out.println(comparedD);


    }

    private static boolean isHasNextTurn(boolean hasNextTurn) {
        var nearestUnBests = map.getNearestNotBestPoints();

        for (var nearestUnBest : nearestUnBests) {
            var isDeadEnd = true;
            nearestUnBest.setBest(true);
            var connectedPoints = map.getConnectedPoints(nearestUnBest);
            for (var point : connectedPoints) {
                System.out.println("analysing point: " + "("+ point.getX() +","+ point.getY() +")");
                isDeadEnd = false;
                var weight = 1;
                if(point.getElevation() - nearestUnBest.getElevation() < -1 ){
                    weight = 9999;
                }
                if (nearestUnBest.getDistance() + weight < point.getDistance()) {
                    point.setDistance(nearestUnBest.getDistance() + weight);
                }
                point.setPreviousPoint(nearestUnBest);
                hasNextTurn = true;
            }
            if (isDeadEnd) {
                isHasNextTurn(hasNextTurn);
            }
        }
        if (!hasNextTurn) {
            var a = map.getAllUnbestPoints();
            System.out.println();
        }
        return hasNextTurn;
    }
}
