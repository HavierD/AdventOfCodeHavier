package dai.huaizhi.havier.Puzzle202209;

import java.util.ArrayList;
import java.util.List;

public class Rope {
    private Node m0 = new Node(0, 0);
    private Node m1 = new Node (0,0);
    private Node m2 = new Node (0,0);
    private Node m3 = new Node (0,0);
    private Node m4 = new Node (0,0);
    private Node m5 = new Node (0, 0);
    private Node m6 = new Node (0,0);
    private Node m7 = new Node (0,0);
    private Node m8 = new Node (0,0);
    private Node m9 = new Node (0,0);

    private Node justMovedOne;

    private List<Node> body = new ArrayList<>();


    List<Point> rawTailPath = new ArrayList<>();
    List<Point> tailPath = new ArrayList<>();


    Rope(){
        rawTailPath.add(new Point(0, 0));
        body.add(m1);
        body.add(m2);
        body.add(m3);
        body.add(m4);
        body.add(m5);
        body.add(m6);
        body.add(m7);
        body.add(m8);
        body.add(m9);
    }

    public void headMove (String command){
        var rawCommand = command.split(" ");
        var direction = rawCommand[0];
        var distance = Integer.parseInt(rawCommand[1]);
        for (var i = 0; i < distance; i++) {
            headMove1Step(direction);
        }

    }

    private void headMove1Step(String direction) {
        switch (direction) {
            case "D":
                m0.setY(m0.getY() - 1);
                break;
            case "U":
                m0.setY(m0.getY() + 1);
                break;
            case "L":
                m0.setX(m0.getX() - 1);
                break;
            case "R":
                m0.setX(m0.getX() + 1);
                break;
            default:
                break;
        }
        justMovedOne = m0;
        for (var i = 1; i <= body.size(); i++) {
            tailReact(body.get(i - 1));
        }
        for (var node : body) {
            System.out.print("("+ node.getX() + "," + node.getY() + ")");
        }
        System.out.println();
    }

    private void tailReact(Node node) {

        var length = calculateLength(node);

        if(length != 5 && length !=4 && length !=0 && length !=1 && length != 2){
            System.out.println("++++++++++++++++++");
            for (var node1 : body) {
                System.out.print("("+ node1.getX() + "," + node1.getY() + ")");
            }
            System.out.println("length: "+ length);
        }

        if ( length <= 2) {
        }
        if(length == 4){
            if(node.getX() == justMovedOne.getX()){
                var a = justMovedOne.getY() - node.getY();
                node.setY(node.getY() + a/2);
                System.out.println("vertically " + a/2);
            }
            if (node.getY() == justMovedOne.getY()) {
                var a = justMovedOne.getX() - node.getX();
                node.setX(node.getX() + a/2);
                System.out.println("horizontally " + a/2);
            }
        }
        if (length == 5 || length == 8) {
            if (justMovedOne.getX() - node.getX() > 0) {
                node.setX(node.getX() + 1);
            } else {
                node.setX(node.getX() -1 );
            }
            if (justMovedOne.getY() - node.getY() > 0) {
                node.setY(node.getY() + 1);
            } else {
                node.setY(node.getY() - 1);
            }
        }



        if(node.toString().equals(m9.toString()) ){
            rawTailPath.add(new Point(m9.getX(), m9.getY()));
        }

        justMovedOne = node;

    }

    private int calculateLength(Node node){
        var x = justMovedOne.getX() - node.getX();
        var y = justMovedOne.getY() - node.getY();
        var length2 = x*x + y*y;
        return length2;
    }

    public void uniquePath(){
        for (var raw : rawTailPath) {
            if(!doesContain(raw)){
                tailPath.add(raw);
            }
        }
    }

    private boolean doesContain(Point point){
        for (var e : tailPath) {
            if (e.getX() == point.getX() && e.getY() == point.getY()){
                return true;
            }
        }
        return false;
    }

    public List<Point> getTailPath() {
        return tailPath;
    }
}
