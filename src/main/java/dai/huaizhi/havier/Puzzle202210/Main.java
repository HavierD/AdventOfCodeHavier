package dai.huaizhi.havier.Puzzle202210;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static Register register = Register.getRegister();
    static int cycleCount = -1;
    static int sum = 0;
    static StringBuilder b1 = new StringBuilder();
    public static void main(String[] args) {
        String[] commands = new RawData().COMMANDS;






        for (var command : commands) {

            if(command.contains("noop")){
                addOneCycle();
                continue;
            }
            if(command.contains("addx")){
                addOneCycle();
                addOneCycle();
                var number = Integer.parseInt(command.split(" ")[1]);
                register.cache(new Attempt(number, cycleCount, register.getNumber()));
            }
        }

        System.out.println(b1.substring(0, 40));
        System.out.println(b1.substring(40, 80));
        System.out.println(b1.substring(80, 120));
        System.out.println(b1.substring(120, 160));
        System.out.println(b1.substring(160, 200));
        System.out.println(b1.substring(200, 240));



//        System.out.println("totally: " + sum);
    }

    private static void addOneCycle() {
        cycleCount++;
        if (cycleCount > 38) {
            cycleCount = cycleCount - 40;
        }
        draw(b1);
    }



    private static void draw(StringBuilder builder) {
        if(register.getElfRange().contains(cycleCount)){
            builder.append("#");
            return;
        }
        builder.append(".");
    }

//    private static void checkSout() {
//        if(flagsContain(cycleCount)){
//            sout(register.getNumber(), cycleCount);
//        }
//    }

//    private static void sout(int register, int cycleCount) {
//        System.out.println(cycleCount + "'s Cycle strength: ");
//        System.out.println(register + "*" + cycleCount);
//        System.out.println(register * cycleCount);
//        sum += register * cycleCount;
//    }

    private static boolean flagsContain(int cycleCount) {
        var c = new Integer[]{40, 80, 120, 160, 200, 240};
        var collection = new ArrayList<>(Arrays.asList(c));
        return collection.contains(cycleCount);
    }
}
