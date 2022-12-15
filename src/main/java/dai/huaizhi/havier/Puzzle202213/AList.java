package dai.huaizhi.havier.Puzzle202213;


import java.util.ArrayList;
import java.util.List;

public class AList implements Item{

    List<Item> items = new ArrayList<>();
    private String value;

    //grabber tools
    private int squareBracketCount = 0;
    private StringBuilder builder = new StringBuilder();
    private boolean numberGrabbing = false;


    AList(String listString) {
        value = listString;
        listString = unShelled(listString);

        var listStringChars = listString.split("");
        for (var c : listStringChars) {

            if(c.equals("[")){
                squareBracketCount++;
            }
            if(squareBracketCount > 0){
                builder.append(c);
                if (c.equals("]")) {
                    squareBracketCount--;
                }
                checkEndKey();
            }

            if(numberGrabbing){
                if(isNumeric(c)){
                    builder.append(c);
                }
                if(c.equals(",") ){
                    numberGrabbing = false;
                    items.add(new Int(builder.toString()));
                    builder.setLength(0);
                }
            }

            if (squareBracketCount == 0 && isNumeric(c) && !numberGrabbing){
                numberGrabbing = true;
                builder.append(c);
            }
        }
        if (builder.length() != 0 ) {
            items.add(new Int(builder.toString()));
            builder.setLength(0);
        }
    }

    private void checkEndKey() {
        if (squareBracketCount == 0) {
            items.add(new AList(builder.toString()));
            builder.setLength(0);
        }
    }

    private boolean isNumeric(String c) {
        try {
            var i = Integer.parseInt(c);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    private String unShelled(String leftExample) {
        var re = "";
        try {
            re = leftExample.substring(1, leftExample.length() - 1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return re;
    }


    public void print(){
        System.out.print("[");
        for (var i = 0; i < items.size(); i++) {
            items.get(i).print();
            if (i != items.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    @Override
    public int comparedIntResult(Item item) {
        if (item instanceof Int) {
            return comparedIntResult(new AList("[" + ((Int) item).getValue() + "]"));
        }
        for (var i = 0; i < Math.min(items.size(), item.getItemsSize());i++ ) {
            if (getItemByOrder(i).comparedIntResult(item.getItemByOrder(i)) == 0) {
                continue;
            }
            return getItemByOrder(i).comparedIntResult(item.getItemByOrder(i));
        }
        if (items.size() < item.getItemsSize()) {
            return -1;
        }
        if (items.size() > item.getItemsSize()) {
            return 1;
        }
        System.out.println("EQUAL!!!!");
        return 0;
    }

    @Override
    public Item getItemByOrder(int i) {
        if(i >= items.size()){
            return new Int("-1");
        }
        return items.get(i);
    }

    @Override
    public int getItemsSize() {
        return items.size();
    }

}
