package dai.huaizhi.havier.Puzzle202220;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static long decryptionKey = 811589153L;
    public static List<NumberItem> numberItems = new ArrayList<>();
    public static void main(String[] args) {

        //initialization
        var numbers = RawData.input.split("\n");
        var length = numbers.length;
        var index = 0;
        for (var number : numbers) {
            if (Integer.parseInt(number) > 9997) {
                System.out.println();
            }
            long longNumber = Long.parseLong(number) * decryptionKey;
            numberItems.add(new NumberItem(index, longNumber));
            index++;
        }
        index = 0;
        //connect number items
        for (var ignored : numbers) {
            var thisOne = findItemById(index);
            var nextOne = findItemById(index + 1);
            thisOne.setNextOne(nextOne);
            nextOne.setPreviousOne(thisOne);
            index++;
        }

        test();

        //start moving
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
            MovementInARound();
        }

        //get result
        var base = find0();
        NumberItem the1000 = base;
        NumberItem the2000 = base;
        NumberItem the3000 = base;

        for (var i = 0; i < 1000; i++) {
            the1000 = the1000.getNextOne();
        }
        for (var i = 0; i < 2000; i++) {
            the2000 = the2000.getNextOne();
        }
        for (var i = 0; i < 3000; i++) {
            the3000 = the3000.getNextOne();
        }

        long result = the1000.getValue() + the2000.getValue() + the3000.getValue();
        System.out.println("result: " + result);



    }

    private static void MovementInARound() {
        for (var i = 0; i < numberItems.size(); i++) {
//            if (i % 10 == 0) {
                System.out.println("move item: " + i);
//            }
            var movingItem = findItemById(i);
            var movingDistance = movingItem.getDistance(numberItems.size());
            move(movingItem, movingDistance);
        }
        test();
    }

    private static void move(NumberItem movingItem, long movingDistance) {
        if (movingDistance == 0) {
            return;
        }
        if (movingDistance < 0) {
            throw new RuntimeException("minus number distance!");
        }

        //debug
        if (movingItem.getValue() == 9998 * decryptionKey) {
            System.out.println();
        }

        movingDistance = movingDistance % (numberItems.size() - 1);
        if (movingDistance == 0) {
            return;
        }

        var currentItem = movingItem;
        currentItem.getPreviousOne().setNextOne(currentItem.getNextOne());
        currentItem.getNextOne().setPreviousOne(currentItem.getPreviousOne());
        for (var i = 0; i < movingDistance; i++) {
            currentItem = currentItem.getNextOne();
        }
        movingItem.setNextOne(currentItem.getNextOne());
        movingItem.setPreviousOne(currentItem);
        currentItem.getNextOne().setPreviousOne(movingItem);
        currentItem.setNextOne(movingItem);
//        test();
//        showCurrentCircle();
    }

    private static void showCurrentCircle() {
        var theOne = find0();
        System.out.print(theOne.getPreviousOne().getValue() + ",");
        while (theOne != find0().getPreviousOne()) {
            System.out.print(theOne.getValue() + ",");
            theOne = theOne.getNextOne();
        }
        System.out.println();
    }

    private static void test() {
        forwardTest();
        backwardTest();
    }

    private static void testUniqueReference() {
        for (var item : numberItems) {
            countPreviousReference(item);
            countNextReference(item);
        }
    }

    private static void backwardTest() {
        NumberItem currentItem = find0().getPreviousOne();
        long count = 0;
        while (currentItem != find0()) {
            currentItem = currentItem.getPreviousOne();
            count ++;
            if (count > 99999) {
                throw new RuntimeException("Test failed!");
            }
        }
        checkTestCount(count);
    }

    private static void forwardTest() {
        NumberItem currentItem = find0().getNextOne();
        long count = 0;
        while (currentItem != find0()) {
            currentItem = currentItem.getNextOne();
            count ++;
            if (count > 999999) {
                throw new RuntimeException("Test failed!");
            }
        }
        checkTestCount(count);
    }

    private static void checkTestCount(long count) {
        if (count != numberItems.size() - 1) {
//            throw new RuntimeException("Test failed! count: " + count);
        }
    }

    private static NumberItem findItemById(long id) {
        if (id == -1) {
            id = numberItems.size() - 1;
        }
        if (id == numberItems.size()) {
            id = 0;
        }

        for (var item : numberItems) {
            if (item.getId() == id) {
                return item;
            }
        }
        throw new RuntimeException("Cannot find this number item by id: " + id);
    }

    private static NumberItem find0() {
        for (var item : numberItems) {
            if (item.getValue() == 0) {
                return item;
            }
        }
        throw new RuntimeException("cannot find 0 item!");
    }

    private static void countPreviousReference(NumberItem pre) {
        long count = 0;
        for (var item : numberItems) {
            if (item.getPreviousOne() == pre) {
                count++;
            }
        }
        if (count > 1) {
            throw new RuntimeException("multiple reference! id: " + pre.getId() + ". ");
        }
    }
    private static void countNextReference(NumberItem next) {
        long count = 0;
        for (var item : numberItems) {
            if (item.getNextOne() == next) {
                count++;
            }
        }
        if (count > 1) {
            throw new RuntimeException("multiple reference! id: " + next.getId() + ".  ");
        }
    }
}
