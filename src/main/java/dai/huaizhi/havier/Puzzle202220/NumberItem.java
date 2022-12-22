package dai.huaizhi.havier.Puzzle202220;

import static dai.huaizhi.havier.Puzzle202220.Main.decryptionKey;

public class NumberItem {
    private final long id;
    private final long value;
    private NumberItem previousOne;
    private NumberItem nextOne;


    NumberItem(long id, long value) {
        this.id = id;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public long getValue() {
        return value;
    }

    public void setPreviousOne(NumberItem previousOne) {
        this.previousOne = previousOne;
    }

    public void setNextOne(NumberItem nextOne) {
        this.nextOne = nextOne;
    }

    public NumberItem getPreviousOne() {
        return previousOne;
    }

    public NumberItem getNextOne() {
        return nextOne;
    }

    public long getDistance(long size) {
        if (this.value >= 0) {
            return value;
        }
        var v = this.value;
        v = v % (size - 1);
        v = size - 1 + v;
        return v;
    }
}
