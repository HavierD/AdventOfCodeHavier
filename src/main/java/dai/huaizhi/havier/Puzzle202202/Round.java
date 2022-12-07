package dai.huaizhi.havier.Puzzle202202;

public class Round {
    private String opponentAttack;
    private String convertedOpponentAttack;
    private String myAttack;
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
        int attackScore = getAttackScore();
        int resultScore = getResultScore();
        return attackScore+resultScore;
    }

    private int getResultScore() {
        if(convertedOpponentAttack.equals(myAttack)){
            return 3;
        }
        if(convertedOpponentAttack.equals("X")){
            if(myAttack.equals("Y")){
                return 0;
            }
            return 6;
        }
        if(convertedOpponentAttack.equals("Y")){
            if(myAttack.equals("Z")){
                return 0;
            }
            return 6;
        }
        if(convertedOpponentAttack.equals("Z")){
            if(myAttack.equals("X")){
                return 0;
            }
            return 6;
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
