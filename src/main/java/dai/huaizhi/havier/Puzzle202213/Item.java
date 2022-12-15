package dai.huaizhi.havier.Puzzle202213;

public interface Item {
    public void print();

    int comparedIntResult(Item item);

    Item getItemByOrder(int i);

    int getItemsSize();
}
