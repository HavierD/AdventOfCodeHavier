package dai.huaizhi.havier.Puzzle202203;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Rucksack {
    private final String compartment;
    private final String leftCompartment;
    private final String rightCompartment;
    private final List<Character> leftItems;
    private final List<Character> rightItems;
    private final List<Character> allItems;

    Rucksack(String s){
        compartment = s;
        leftCompartment = s.substring(0, s.length() / 2);
        rightCompartment = s.substring(s.length() / 2);
        leftItems = leftCompartment.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        rightItems = rightCompartment.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        allItems = compartment.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
    }

    public List<Character> allSharedItems (){
        List<Character> re = new ArrayList<>();
        for(var leftItem : leftItems){
            if (!rightItems.contains(leftItem)) continue;
            re.add(leftItem);
        }
        var temp = new HashSet<Character>(re);
        re = new ArrayList<>(temp);

        if (re.size() > 1){
            System.out.println("more than 1");
        }
        return re;
    }

    public List<Character> getAllItems() {
        return allItems;
    }
}
