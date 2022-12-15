package dai.huaizhi.havier.Puzzle202211;

public class Item {
    private final String id;
    private Long worryLevel;

    Item(String id, Long worryLevel) {
        this.id = id;
        this.worryLevel = worryLevel;
    }

    public String getId() {
        return id;
    }

    public Long getWorryLevel() {
        return worryLevel;
    }

    public void setWorryLevel(Long worryLevel) {
        this.worryLevel = worryLevel;
    }
}
