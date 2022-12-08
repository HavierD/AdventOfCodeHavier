package dai.huaizhi.havier.Puzzle202202;

public class Round {
    private final String opponentAttack;
    private final String convertedOpponentAttack;
    private final String myAttack;
    private int score;

    Round(String opponentAttack, String myAttack){
        this.opponentAttack = opponentAttack;
        this.myAttack = myAttack;
        convertedOpponentAttack = convertOpponentAttack();
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
        if(convertedOpponentAttack.equals(myAttack)){
            return 3;
        }
        if(convertedOpponentAttack.equals("X")){
            if(myAttack.equals("Y")){
                return 6;
            }
            return 0;
        }
        if(convertedOpponentAttack.equals("Y")){
            if(myAttack.equals("Z")){
                return 6;
            }
            return 0;
        }
        if(convertedOpponentAttack.equals("Z")){
            if(myAttack.equals("X")){
                return 6;
            }
            return 0;
        }
        System.out.println("SOmething wrong! Round.getResultScore()");
        return 0;
    }

    private int getAttackScore() {
        switch (myAttack){
            case "X":
                return 1;
            case "Y":
                return 2;
            case "Z":
                return 3;
        }
        System.out.println("SOmething wrong! Round.getAttackScore()");
        return 0;
    }
}
