package mdsd.rpg.JavaFiles;


import java.util.*;
		
public class Move{			

	private static Move move;
	private Set<MoveData> moves = new HashSet<>();
	
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

	public Set<Move> getMoves(){
		return moves;
	}
}