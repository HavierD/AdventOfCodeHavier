package dai.huaizhi.havier.Puzzle202207;

import java.util.ArrayList;
import java.util.List;

import static dai.huaizhi.havier.Puzzle202207.WholeDisk.disk;

public class Item {
    private static int sequence = 0;
    private final int id;
    private String name;
    private boolean isDir;
    private int size = 0;
    private int parentId;
    private List<Integer> childIds = new ArrayList<>();
    private WholeDisk wholeDisk = new WholeDisk();

    Item(){
        sequence++;
        this.id = sequence;
        disk.add(this);
    }




    public void addChildren(List<Integer> childNames){
        this.childIds = childNames;
    }
    public void addChild(int childId){
        this.childIds.add(childId);
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSize(int size) {
        this.size = size;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getId() {
        return id;
    }

    public int getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public int getSize() {
        return size;
    }
}
