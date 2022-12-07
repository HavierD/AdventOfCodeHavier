package dai.huaizhi.havier.Puzzle202203;

public class Group {
    Rucksack r1;
    Rucksack r2;
    Rucksack r3;
    Group(Rucksack r1, Rucksack r2, Rucksack r3){
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

    public char sharedItem(){
        for (var item : r1.getAllItems()) {
            if(!r2.getAllItems().contains(item)){
                continue;
            }
            if(!r3.getAllItems().contains(item)){
                continue;
            }
            return item;
        }
        System.out.println("No Shared Items!!!");
        return '!';
    }

}
