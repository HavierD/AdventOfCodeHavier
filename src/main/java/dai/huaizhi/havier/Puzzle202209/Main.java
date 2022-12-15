package dai.huaizhi.havier.Puzzle202209;



public class Main {


    public static void main(String[] args) {

        Rope rope = new Rope();

        RawData rawData = new RawData();
        var i = 1;
        for (var command : rawData.getMotions()) {

            System.out.println(i + " line's command");
            System.out.println(command);
            rope.headMove(command);
            i++;
        }

        rope.uniquePath();
        var a = rope.getTailPath().size();
        System.out.println("final result: ");
        System.out.println(a);
    }


}
