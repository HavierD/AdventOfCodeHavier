package dai.huaizhi.havier.Puzzle202221;

public class MonkeyYell implements Monkey {
    private String id;
    private long number;

    MonkeyYell(String id, String number) {
        this.id = id;
        this.number = Integer.parseInt(number);
    }


    @Override
    public long provideNumber() {
//        System.out.println(this.id + " provide " + number);
        return number;
    }

    @Override
    public String id() {
        return this.id;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}
