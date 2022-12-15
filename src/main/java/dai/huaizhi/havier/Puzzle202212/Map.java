package dai.huaizhi.havier.Puzzle202212;

import java.util.ArrayList;
import java.util.List;
public class Map {

    List<Point> points = new ArrayList<>();
    private Point startPoint ;
    private Point endPoint;


    Map(){
        var all = RawData.rawdata.split("\n");

        System.out.println("y is until " + all.length);
        System.out.println("x is until " + all[0].split("").length);
        for (var y = 0; y < all.length; y++) {
            var chars = all[y].split("");
            for( var x = 0; x < chars.length; x++){
                var point = new Point(x, y, chars[x].toCharArray()[0]);
                points.add(point);
            }
        }
        startPoint = findEndPoint();
        endPoint = findStartPoint();
    }

    public Point getPointByCoordinate(int x, int y){
        for (var re : points) {
            if(re.getX() == x && re.getY() == y){
                return re;
            }
        }
        System.out.println("Wrong!!! getPointByCoordinate");
        return new Point(-1, -1, 'q');
    }

    private Point findStartPoint(){
        for (var re : points) {
            if(re.getElevation() == 'S'){
                return re;
            }
        }
        System.out.println("Wrong!!! findstartpoint");
        return new Point(-1, -1, 'q');
    }

    private Point findEndPoint(){
        for (var re : points) {
            if(re.getElevation() == 'E'){
                return re;
            }
        }
        System.out.println("Wrong!!! findEndPoint");
        return new Point(-1, -1, 'q');
    }

    private List<Point> getNear4Points(Point middle){
        List<Point> re = new ArrayList<>();
        var midX = middle.getX();
        var midY = middle.getY();

        if(midX != 158){
            re.add(getPointByCoordinate(midX + 1, midY));
        }
        if (midX != 0) {
            re.add(getPointByCoordinate(midX - 1, midY));
        }
        if(midY != 40 ){
            re.add(getPointByCoordinate(midX, midY + 1));
        }
        if (midY != 0) {
            re.add(getPointByCoordinate(midX, midY - 1));
        }


        return re;
    }

    public List<Point> getConnectedPoints(Point middle) {
        var possiblePoints = getNear4Points(middle);
        List<Point> re = new ArrayList<>();
        for (var e : possiblePoints) {
            if(e.isBest()){
                continue;
            }
            re.add(e);

        }

        return re;
    }

    public List<Point> getNearestNotBestPoints(){
        List<Point> re = new ArrayList<>();
        var comparedDistance = 99999;
        for(var point : points){
            if(!point.isBest() &&point.getDistance() < comparedDistance){
                comparedDistance = point.getDistance();
            }
        }
        for (var point : points) {
            if (point.getDistance() == comparedDistance && !point.isBest()) {
                re.add(point);
            }
        }
        return re;
    }

    public List<Point> getAllUnbestPoints() {
        List<Point> re = new ArrayList<>();
        for (var point : points) {
            if (!point.isBest()) {
                re.add(point);
            }
        }
        return re;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void drawTheRoute(Point point) {
        point.setOnRoute(true);
        if(point.getPreviousPoint() != null){
            drawTheRoute(point.getPreviousPoint());
        }else{
            System.out.println("finish drawing");
        }
    }

    public List<Point> getPointsByElevation() {
        List<Point> re = new ArrayList<>();
        for (var p : points) {
            if (p.getElevation() == 'a') {
                re.add(p);
            }
        }
        return re;
    }
}
