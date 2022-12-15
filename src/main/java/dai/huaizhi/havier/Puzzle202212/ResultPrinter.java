package dai.huaizhi.havier.Puzzle202212;

public class ResultPrinter {

    private Map map;
    ResultPrinter(Map map) {
        this.map = map;
    }

    public void print() {
        for (var y = 0; y < 41; y++) {
            var str = new StringBuilder();
            for (var x = 0; x < 159; x++) {
                var p = map.getPointByCoordinate(x, y);
                var dInt = p.getDistance();
                if(dInt > 9999){
                    dInt = 9999;
                }
                var d = Integer.toString(p.getDistance());
                char c = (char) p.getElevation();
                String b = "";
                StringBuilder tempS = new StringBuilder();
                tempS.append(" ".repeat( 4 - d.length()));
                b = b + tempS + d;
                String onRoute = p.isOnRoute()? "*" : " ";
                str
//                        .append(" ")
//                        .append(b)
                        .append(onRoute)
                        .append(c);
            }
            var str2 = str.toString();
            System.out.println(str2);
        }



    }
}
