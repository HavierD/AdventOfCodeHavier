package dai.huaizhi.havier.Puzzle202211;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

import static dai.huaizhi.havier.Puzzle202211.Main.findMonkeyById;
import static dai.huaizhi.havier.Puzzle202211.Main.leastCommonMultiple;

public class Monkey {

    private final int id;
    private final List<Item> itemList = new ArrayList<>();
    private UnaryOperator<Long> operation;
    private UnaryOperator<Long> tester;
    private int ifTrue;
    private int ifFalse;
    private Long inspectingTimes = 0L;




    public Monkey(int id ) {
        this.id = id;
    }

    public Monkey setOperation (UnaryOperator<Long> operator) {
        this.operation = operator;
        return this;
    }

    public Monkey setTester(UnaryOperator<Long> tester) {
        this.tester = tester;
        return this;
    }

    public Monkey addItem(Item item) {
        itemList.add(item);
        return this;
    }

    public Monkey addItems(List<Item> items) {
        itemList.addAll(items);
        return this;
    }

    public Monkey setIfTrueTargetMonkey(int targetMonkeyId) {
        this.ifTrue = targetMonkeyId;
        return this;
    }

    public Monkey setIfFalseTargetMonkey(int targetMonkeyId) {
        this.ifFalse = targetMonkeyId;
        return this;
    }

    public void inspectItems() {
        for (var item : itemList) {
            inspectingTimes++;
            operate(item);
            if (test(item)) {
                findMonkeyById(ifTrue).addItem(item);
            } else {
                findMonkeyById(ifFalse).addItem(item);
            }
        }
        itemList.clear();
    }

    private void operate(Item item) {
        var tempWorry = operation.apply(item.getWorryLevel());
        var newWorry = tempWorry % leastCommonMultiple;
        item.setWorryLevel(newWorry);
    }

    private boolean test(Item item) {
        return tester.apply(item.getWorryLevel()) == 0;
    }

    public int getId() {
        return id;
    }

    public Long getInspectingTimes() {
        return inspectingTimes;
    }

    private Item findItemById(String id) {
        for (var item : itemList) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        throw new RuntimeException("No item's id is " + id + " in monkey: " + this.id);
    }

}
