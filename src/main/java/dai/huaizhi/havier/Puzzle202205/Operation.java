package dai.huaizhi.havier.Puzzle202205;

public class Operation {
    private String instruction;
    private Integer moveCount;
    private Integer moveFrom;
    private Integer moveTo;


    Operation(String instruction){
        this.instruction = instruction;
        String[] pieceOfInstruction = instruction.split(" ");
        //assignment check
        if(!pieceOfInstruction[0].equals("move") || !pieceOfInstruction[2].equals("from") || !pieceOfInstruction[4].equals("to")){
            throw new RuntimeException("Instructions assignment Error! Operation.constructor()");
        }
        moveCount = Integer.parseInt(pieceOfInstruction[1]);
        moveFrom = Integer.parseInt(pieceOfInstruction[3]);
        moveTo = Integer.parseInt(pieceOfInstruction[5]);

    }

    public Integer getMoveCount() {
        return moveCount;
    }

    public Integer getMoveFrom() {
        return moveFrom;
    }

    public Integer getMoveTo() {
        return moveTo;
    }
}
