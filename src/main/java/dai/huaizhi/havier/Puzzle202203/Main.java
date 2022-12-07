package dai.huaizhi.havier.Puzzle202203;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        char c = 'X';
//        int number = c ; //A = 65,Z = 90, a= 97
//        System.out.println(Character.isLowerCase(c));
        List<Rucksack> rucksacks = new ArrayList<>();
        List<Character> allSharedChars = new ArrayList<>();
        List<Group> groups = new ArrayList<>();

        String[] rucksackStrings = RawData.input.split("\n");

        for (var i = 0; i < rucksackStrings.length; i += 3) {
            groups.add(new Group(new Rucksack(rucksackStrings[i]), new Rucksack(rucksackStrings[i+1]),
                    new Rucksack(rucksackStrings[i+2])));
        }


        for (var e : rucksackStrings) {
            rucksacks.add(new Rucksack(e));
        }
        for (var e : rucksacks) {
            allSharedChars.add(e.allSharedItems().get(0));
        }
        int sum = 0;
        for (var e : allSharedChars) {
            sum = sum + getPriority(e);
        }
        System.out.println("sum is:");
        System.out.println(sum);

//star 2
        int groupSum = 0;
        for (var group : groups) {
            groupSum = groupSum + getPriority(group.sharedItem());
        }
        System.out.println("group sum is: ");
        System.out.println(groupSum);

    }

    static private int getPriority(char ch){
        if(Character.isUpperCase(ch)){
            return ch - 38;
        }
        if(Character.isLowerCase(ch)){
            return ch - 96;
        }
        System.out.println("Wrong Char!! Main.getPriority()");
        return 0;
    }
}
