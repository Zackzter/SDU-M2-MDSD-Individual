import java.util.*;
		
public class Move{			

	private static Move move;
	private List<MoveData> moves = new ArrayList<>();
	
	private Move(){}

	public static Move getInstance(){
		if (move == null){
			move = new Move();
		}
		return move;
	}

	public void addMove(MoveData move){
		moves.add(move);
	}

	public MoveData getMove(String move){
		MoveData mD = null;

		for (MoveData moveData : moves) {
			if(moveData.getMoveName().equals(move)){
				mD = moveData;
			}
		}
		return mD;
	}

	public List<MoveData> getMoves(){
		return moves;
	}

}
	