package dai.huaizhi.havier.Puzzle202213;

public class Int implements Item{
    private String value;
    public Int(String c) {
        this.value = c;
    }


    public static void main(String[] args) {
    }

    public String  getValue() {
        return value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }

    @Override
    public int comparedIntResult(Item item) {
        if (item instanceof Int) {
            if (value.replaceAll("[0-9]", "").length() != 0) {
                System.out.println();
            }

            return Integer.parseInt(value) - Integer.parseInt(((Int) item).getValue());

        }
        return new AList("["+value+"]").comparedIntResult(item);
    }

    @Override
    public Item getItemByOrder(int i) {
        if (i == 0) {
            return this;
        }
        return new Int("-1");
    }

    @Override
    public int getItemsSize() {
        return 1;
    }
}
