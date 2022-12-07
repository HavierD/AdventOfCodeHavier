package dai.huaizhi.havier.Puzzle202205;

import java.util.List;

public class Stack {
    List<String> details;
    Stack(List<String> details){
        this.details = details;
    }

    public String finalChar() {
        return details.get(details.size() - 1);
    }
}
