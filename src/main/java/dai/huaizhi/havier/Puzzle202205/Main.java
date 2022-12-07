package dai.huaizhi.havier.Puzzle202205;

import java.util.ArrayList;
import java.util.List;

import static dai.huaizhi.havier.Puzzle202205.RawData.wholeInstruction;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        var allStacks = new AllStacks(0);
        String[] instructions = wholeInstruction.split("\n");
        List<Operation> operations = new ArrayList<>();
        for (String instruction : instructions) {
            Operation op = new Operation(instruction);
            operations.add(op);
        }

        System.out.println(
                allStacks.operate(operations));












    }




}
