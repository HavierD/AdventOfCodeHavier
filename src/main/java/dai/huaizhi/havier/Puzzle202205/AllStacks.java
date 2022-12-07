package dai.huaizhi.havier.Puzzle202205;

import java.util.ArrayList;
import java.util.List;

public class AllStacks {

    //top crate is at the final.
    List<String> stack1 = new ArrayList<>();
    List<String> stack2 = new ArrayList<>();
    List<String> stack3 = new ArrayList<>();
    List<String> stack4 = new ArrayList<>();
    List<String> stack5 = new ArrayList<>();
    List<String> stack6 = new ArrayList<>();
    List<String> stack7 = new ArrayList<>();
    List<String> stack8 = new ArrayList<>();
    List<String> stack9 = new ArrayList<>();

    Stack s1;
    Stack s2;
    Stack s3;
    Stack s4;
    Stack s5;
    Stack s6;
    Stack s7;
    Stack s8;
    Stack s9;

    public static void main(String[] args) {
        AllStacks allStacks = new AllStacks(0);
        System.out.println(allStacks);
        System.out.println(allStacks.stack1);
        System.out.println(testt(allStacks));
        System.out.println(allStacks.stack1);
    }

    static private AllStacks testt (AllStacks aa){
        aa.stack1.remove(aa.stack1.size() - 1);
        return aa;
    }

    AllStacks(int original){
        stack1.add("R");
        stack1.add("G");
        stack1.add("H");
        stack1.add("Q");
        stack1.add("S");
        stack1.add("B");
        stack1.add("T");
        stack1.add("N");
        stack2.add("H");
        stack2.add("S");
        stack2.add("F");
        stack2.add("D");
        stack2.add("P");
        stack2.add("Z");
        stack2.add("J");
        stack3.add("Z");
        stack3.add("H");
        stack3.add("V");
        stack4.add("M");
        stack4.add("Z");
        stack4.add("J");
        stack4.add("F");
        stack4.add("G");
        stack4.add("H");
        stack5.add("T");
        stack5.add("Z");
        stack5.add("C");
        stack5.add("D");
        stack5.add("L");
        stack5.add("M");
        stack5.add("S");
        stack5.add("R");
        stack6.add("M");
        stack6.add("T");
        stack6.add("W");
        stack6.add("V");
        stack6.add("H");
        stack6.add("Z");
        stack6.add("J");
        stack7.add("T");
        stack7.add("F");
        stack7.add("P");
        stack7.add("L");
        stack7.add("Z");
        stack8.add("Q");
        stack8.add("V");
        stack8.add("W");
        stack8.add("S");
        stack9.add("W");
        stack9.add("H");
        stack9.add("L");
        stack9.add("M");
        stack9.add("T");
        stack9.add("D");
        stack9.add("N");
        stack9.add("C");

//        stack1.add("N");
//        stack1.add("T");
//        stack1.add("B");
//        stack1.add("S");
//        stack1.add("Q");
//        stack1.add("H");
//        stack1.add("G");
//        stack1.add("R");
//        stack2.add("J");
//        stack2.add("Z");
//        stack2.add("P");
//        stack2.add("D");
//        stack2.add("F");
//        stack2.add("S");
//        stack2.add("H");
//        stack3.add("V");
//        stack3.add("H");
//        stack3.add("Z");
//        stack4.add("H");
//        stack4.add("G");
//        stack4.add("F");
//        stack4.add("J");
//        stack4.add("Z");
//        stack4.add("M");
//        stack5.add("R");
//        stack5.add("S");
//        stack5.add("M");
//        stack5.add("L");
//        stack5.add("D");
//        stack5.add("C");
//        stack5.add("Z");
//        stack5.add("T");
//        stack6.add("J");
//        stack6.add("Z");
//        stack6.add("H");
//        stack6.add("V");
//        stack6.add("W");
//        stack6.add("T");
//        stack6.add("M");
//        stack7.add("Z");
//        stack7.add("L");
//        stack7.add("P");
//        stack7.add("F");
//        stack7.add("T");
//        stack8.add("S");
//        stack8.add("W");
//        stack8.add("V");
//        stack8.add("Q");
//        stack9.add("C");
//        stack9.add("N");
//        stack9.add("D");
//        stack9.add("T");
//        stack9.add("M");
//        stack9.add("L");
//        stack9.add("H");
//        stack9.add("W");
        s1 = new Stack(stack1);
        s2 = new Stack(stack2);
        s3 = new Stack(stack3);
        s4 = new Stack(stack4);
        s5 = new Stack(stack5);
        s6 = new Stack(stack6);
        s7 = new Stack(stack7);
        s8 = new Stack(stack8);
        s9 = new Stack(stack9);
    }

    public String operate (List<Operation> operations){
        for (Operation operation : operations) {
            var fromStack = getStack(operation.getMoveFrom());
            var toStack = getStack(operation.getMoveTo());
            List<String> buffer = new ArrayList<>(fromStack.details.subList(fromStack.details.size() - operation.getMoveCount(),
                    fromStack.details.size()));
            for (var j = 0; j < operation.getMoveCount(); j ++) {
                fromStack.details.remove(fromStack.details.size()-1);
            }
            toStack.details.addAll(buffer);
            buffer.clear();
        }
        return s1.finalChar() + s2.finalChar() + s3.finalChar() + s4.finalChar() + s5.finalChar() + s6.finalChar() + s7.finalChar() + s8.finalChar() + s9.finalChar();
    }

    private Stack getStack(Integer moveFrom) {
        switch (moveFrom){
            case 1:
                return s1;
            case 2:
                return s2;
            case 3:
                return s3;
            case 4:
                return s4;
            case 5:
                return s5;
            case 6:
                return s6;
            case 7:
                return s7;
            case 8:
                return s8;
            case 9:
                return s9;
        }
        System.out.println("Getting stack wrong! AllStacks.getStack()");
        return null;
    }


}
