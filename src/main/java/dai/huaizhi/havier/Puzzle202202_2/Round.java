package dai.huaizhi.havier.Puzzle202202_2;

public class Round {
    private final String opponentAttack;
    private final String convertedOpponentAttack;
    private final String willingResult;
    private String myAttack;
    private int score;

    Round(String opponentAttack, String willingResult){
        this.opponentAttack = opponentAttack;
        this.willingResult = willingResult;
        convertedOpponentAttack = convertOpponentAttack();
        parseMyAttack();
    }

    private void parseMyAttack() {
        switch (willingResult){
            case "X":
                myAttack = getLoseAttackByOppo(opponentAttack);
                break;
            case "Y":
                myAttack = opponentAttack;
                break;
            case "Z":
                myAttack = getWinAttackByOppo(opponentAttack);
                break;
            default:
                System.out.println("Something wrong! Round.parseMyAttack()");
                myAttack = "";
        }
    }

    private String getLoseAttackByOppo(String opponentAttack) {
        switch (opponentAttack) {
            case "A":
                return "C";
            case "B":
                return "A";
            case "C":
                return "B";
            default:
                System.out.println("Something wrong! Round.getLostAttackByOppo()");
                return "";
        }
    }
    private String getWinAttackByOppo(String opponentAttack) {
        switch (opponentAttack) {
            case "A":
                return "B";
            case "B":
                return "C";
            case "C":
                return "A";
            default:
                System.out.println("Something wrong! Round.getWinAttackByOppo()");
        }
        return "";
    }

    private String convertOpponentAttack() {
        switch (opponentAttack) {
            case "A":
                return "X";
            case "B":
                return "Y";
            case "C":
                return "Z";
        }
        System.out.println("SOmething wrong! Round.convertOpponentAttack()");
        return "WQqwe";
    }

    public int mark(){
        System.out.println("my: ");
        System.out.println(myAttack);
        System.out.println("oppo");
        System.out.println(opponentAttack);
        System.out.println("converted oppo");
        System.out.println(convertedOpponentAttack);
        int attackScore = getAttackScore();
        System.out.println("attack score " + attackScore);
        int resultScore = getResultScore();
        System.out.println("result score " + resultScore);
        System.out.println("returned: ");
        System.out.println(attackScore + resultScore);
        System.out.println("=============");
        return attackScore+resultScore;
    }

    private int getResultScore() {
        if (willingResult.equals("X")) {
            return 0;
        }
        if (willingResult.equals("Y")) {
            return 3;
        }
        if (willingResult.equals("Z")) {
            return 6;
        }
        System.out.println("SOmething wrong! Round.getResultScore()");
        return 0;
    }

    private int getAttackScore() {
        switch (myAttack){
            case "A":
                return 1;
            case "B":
                return 2;
            case "C":
                return 3;
        }
        System.out.println("SOmething wrong! Round.getAttackScore()");
        return 0;
    }
}
