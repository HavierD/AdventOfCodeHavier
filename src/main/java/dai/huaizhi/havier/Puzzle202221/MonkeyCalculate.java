package dai.huaizhi.havier.Puzzle202221;

public class MonkeyCalculate implements Monkey {
    private String id;
    private Monkey firstMonkey;
    private Monkey secondMonkey;
    private String mark;

    MonkeyCalculate(String id, String mark) {
        this.id = id;
        this.mark = mark;
    }


    @Override
    public long provideNumber() {
        switch (mark) {
            case "+":
//                System.out.println(this.id + " provide " + plus());
                return plus();
            case "-":
//                System.out.println(this.id + " provide " + minus());
                return minus();
            case "*":
//                System.out.println(this.id + " provide " + multiply());
                return multiply();
            case "/":
//                System.out.println(this.id + " provide " + divide());
                return divide();
            default:
                throw new RuntimeException("something wrong. cannot provide number");
        }
    }

    void setFirstMonkey(Monkey m) {
        this.firstMonkey = m;
    }

    void setSecondMonkey(Monkey m) {
        this.secondMonkey = m;
    }

    @Override
    public String id() {
        return this.id;
    }

    private long plus() {
        return firstMonkey.provideNumber() + secondMonkey.provideNumber();
    }

    private long minus() {
        return firstMonkey.provideNumber() - secondMonkey.provideNumber();
    }

    private long multiply() {
        return firstMonkey.provideNumber() * secondMonkey.provideNumber();
    }

    private long divide() {
        return firstMonkey.provideNumber() / secondMonkey.provideNumber();
    }

    public Monkey getFirstMonkey() {
        return firstMonkey;
    }

    public Monkey getSecondMonkey() {
        return secondMonkey;
    }
}
