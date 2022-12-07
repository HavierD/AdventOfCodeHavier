package dai.huaizhi.havier.Puzzle202207;

import java.util.ArrayList;
import java.util.List;

public class WholeDisk {
    static public List<Item> disk = new ArrayList<>();

    public Item findItemById(int id){
        for (var item : disk) {
            if (item.getId() == id) {
                return item;
            }
        }
        System.out.println("didn't find item has this id " + id);
        return null;
    }

    public Item findItemByParentIdAndName(int parentId, String name) {
        for(var item : disk){
            if(item.getParentId() == parentId && item.getName().equals(name)){
                return item;
            }
        }
        System.out.println("didn't find item has this name: " + name);
        return null;
    }

    public int sumSizeOfDirsWhoseSizeGreaterThan(int sizeAtMost) {
        var sum = 0;
        for(var item : disk){
            if(item.getChildIds().size() == 0){
                continue;
            }
            if(getItemSize(item) > sizeAtMost){
                continue;
            }

            sum += getItemSize(item);
        }
        return sum;
    }

    private int getItemSize(Item item1){
        if (item1.getChildIds().size() == 0) {
            return item1.getSize();
        }
        var sizeBuffer = 0;
        for (var childId : item1.getChildIds()) {
            var item = findItemById(childId);
            if(item.getChildIds().size() == 0){
                sizeBuffer += item.getSize();
                continue;
            }
            sizeBuffer += getItemSize(item);
        }
        return sizeBuffer;
    }



    public void dirSizeMostCloseTo(int standardSize) {
        Item bestItem = findItemById(1);
        for (var item : disk) {
            var size = getItemSize(item);
            if (item.getChildIds().size() == 0) {
                continue;
            }
            if (size < standardSize){
                continue;
            }
            var bestItemSize =  getItemSize(bestItem);
            if (size - standardSize < bestItemSize - standardSize){
                bestItem = item;
            }
        }
        System.out.println("sub root sizes: ");
        System.out.println(getItemSize(findItemById(3)));
        System.out.println(getItemSize(findItemById(4)));
        System.out.println(getItemSize(findItemById(5)));
        System.out.println(getItemSize(findItemById(6)));
        System.out.println(getItemSize(findItemById(9)));
        System.out.println(getItemSize(findItemById(10)));
        System.out.println(getItemSize(findItemById(13)));
        System.out.println(getItemSize(findItemById(14)));
        System.out.println("best dir is: ");
        System.out.println(bestItem.getId());
        System.out.println("best dir size is: ");
        System.out.println(getItemSize(bestItem));
        System.out.println("root item size: ");
        System.out.println(getItemSize(findItemById(1)));
        System.out.println("my empty size is:");
        var a = getItemSize(findItemById(1));
        System.out.println(70000000 - a);
        System.out.println("i need to empty: ");
        System.out.println(30000000 - 70000000 + a);
    }


}
