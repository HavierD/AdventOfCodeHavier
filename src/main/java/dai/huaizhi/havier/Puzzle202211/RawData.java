package dai.huaizhi.havier.Puzzle202211;

public class RawData {
    private final String[] monkeysConfigurations = INPUT.split("\n\n");
//    private final String[] monkeysConfigurations = EXAMPLE_INPUT.split("\n\n");

    public String[] getMonkeysConfigurations() {
        return monkeysConfigurations;
    }

    private final static String EXAMPLE_INPUT = "Monkey 0:\n" +
            "  Starting items: 79, 98\n" +
            "  Operation: new = old * 19\n" +
            "  Test: divisible by 23\n" +
            "    If true: throw to monkey 2\n" +
            "    If false: throw to monkey 3\n" +
            "\n" +
            "Monkey 1:\n" +
            "  Starting items: 54, 65, 75, 74\n" +
            "  Operation: new = old + 6\n" +
            "  Test: divisible by 19\n" +
            "    If true: throw to monkey 2\n" +
            "    If false: throw to monkey 0\n" +
            "\n" +
            "Monkey 2:\n" +
            "  Starting items: 79, 60, 97\n" +
            "  Operation: new = old * old\n" +
            "  Test: divisible by 13\n" +
            "    If true: throw to monkey 1\n" +
            "    If false: throw to monkey 3\n" +
            "\n" +
            "Monkey 3:\n" +
            "  Starting items: 74\n" +
            "  Operation: new = old + 3\n" +
            "  Test: divisible by 17\n" +
            "    If true: throw to monkey 0\n" +
            "    If false: throw to monkey 1";


    private final static String INPUT = "Monkey 0:\n" +
            "  Starting items: 84, 72, 58, 51\n" +
            "  Operation: new = old * 3\n" +
            "  Test: divisible by 13\n" +
            "    If true: throw to monkey 1\n" +
            "    If false: throw to monkey 7\n" +
            "\n" +
            "Monkey 1:\n" +
            "  Starting items: 88, 58, 58\n" +
            "  Operation: new = old + 8\n" +
            "  Test: divisible by 2\n" +
            "    If true: throw to monkey 7\n" +
            "    If false: throw to monkey 5\n" +
            "\n" +
            "Monkey 2:\n" +
            "  Starting items: 93, 82, 71, 77, 83, 53, 71, 89\n" +
            "  Operation: new = old * old\n" +
            "  Test: divisible by 7\n" +
            "    If true: throw to monkey 3\n" +
            "    If false: throw to monkey 4\n" +
            "\n" +
            "Monkey 3:\n" +
            "  Starting items: 81, 68, 65, 81, 73, 77, 96\n" +
            "  Operation: new = old + 2\n" +
            "  Test: divisible by 17\n" +
            "    If true: throw to monkey 4\n" +
            "    If false: throw to monkey 6\n" +
            "\n" +
            "Monkey 4:\n" +
            "  Starting items: 75, 80, 50, 73, 88\n" +
            "  Operation: new = old + 3\n" +
            "  Test: divisible by 5\n" +
            "    If true: throw to monkey 6\n" +
            "    If false: throw to monkey 0\n" +
            "\n" +
            "Monkey 5:\n" +
            "  Starting items: 59, 72, 99, 87, 91, 81\n" +
            "  Operation: new = old * 17\n" +
            "  Test: divisible by 11\n" +
            "    If true: throw to monkey 2\n" +
            "    If false: throw to monkey 3\n" +
            "\n" +
            "Monkey 6:\n" +
            "  Starting items: 86, 69\n" +
            "  Operation: new = old + 6\n" +
            "  Test: divisible by 3\n" +
            "    If true: throw to monkey 1\n" +
            "    If false: throw to monkey 0\n" +
            "\n" +
            "Monkey 7:\n" +
            "  Starting items: 91\n" +
            "  Operation: new = old + 1\n" +
            "  Test: divisible by 19\n" +
            "    If true: throw to monkey 2\n" +
            "    If false: throw to monkey 5";
}
