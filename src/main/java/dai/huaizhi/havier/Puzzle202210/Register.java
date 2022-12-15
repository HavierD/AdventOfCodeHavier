package dai.huaizhi.havier.Puzzle202210;

import java.util.ArrayList;
import java.util.List;

public class Register {



    private int number = 1;
    public List<Attempt> regHistory = new ArrayList<>();
    private static Register singleton;

    private Register(){};

    public static Register getRegister(){
        if (singleton == null) {
            return new Register();
        }
        return singleton;
    }


    public void cache(Attempt i){
        number += i.NO;
        regHistory.add(i);
    }

    public int getNumber() {
        return number;
    }
    public List<Integer> getElfRange(){
        List<Integer> re = new ArrayList<>();
        re.add(number - 1);
        re.add(number);
        re.add(number + 1);
        return re;
    }


}
