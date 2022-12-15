package dai.huaizhi.havier.Puzzle202213;

public class APackage {
    AList leftList;
    AList rightList;

    APackage(String packageString){
        var pairs = packageString.split("\n");
        var leftListString = pairs[0];
        var rightListString = pairs[1];
        leftList = new AList(leftListString);
        rightList = new AList(rightListString);
    }

    public boolean isRightOrder() {
        for (var i = 0; i < Math.min(leftList.items.size(), rightList.items.size()); i++) {
            if (leftList.items.get(i).comparedIntResult(rightList.items.get(i)) == 0) {
                continue;
            }
            var a = leftList.items.get(i).comparedIntResult(rightList.items.get(i)) < 0;
            return a;
        }
        if(leftList.items.size() == rightList.items.size()){
            System.out.println("EQUAL PACKAGE!");
        }
        return (leftList.items.size() < rightList.items.size());
    }
}
