package dai.huaizhi.havier.Puzzle202207;

import java.util.ArrayList;
import java.util.List;

import static dai.huaizhi.havier.Puzzle202207.WholeDisk.disk;


public class Main {

    public static void main(String[] args) {

        Item currentDir = new Item();
        currentDir.setName("/");
        WholeDisk wholeDisk = new WholeDisk();
        var data = new RawData();

        for (var line : data.inputLines) {

            if(line.contains("cd /")){
                continue;
            }
            if(line.contains("cd ..")){
                currentDir = wholeDisk.findItemById(currentDir.getParentId());
                continue;
            }
            if(line.contains("cd ")){
                var segs = line.split(" ");
                currentDir = wholeDisk.findItemByParentIdAndName(currentDir.getId(), segs[2]);
                continue;
            }
            if(line.contains("dir")){
                var segs = line.split(" ");
                Item item = new Item();
                item.setParentId(currentDir.getId());
                item.setName(segs[1]);
                currentDir.addChild(item.getId());
                continue;
            }
            if(line.contains("$ ls")){
                continue;
            }
            var segs = line.split(" ");
            var item = new Item();
            item.setSize(Integer.parseInt(segs[0]));
            item.setName(segs[1]);
            item.setParentId(currentDir.getId());
            currentDir.addChild(item.getId());
        }
        wholeDisk.dirSizeMostCloseTo(6233734);
    }
}
