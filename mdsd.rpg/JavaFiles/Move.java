import java.util.*;
		
public class Move{			
	private String moveName;
	private String type;
	private Set<Attribute> moveAttributes;

	private static Move move;
	private Set<Move> moves = new HashSet<>();
	
	private Move(){}

	public static Move getInstance(){
		if (move == null){
			move = new Move();
		}
		return move;
	}

	public Move(String moveName, String type, Set<Attribute> moveAttributes){
		this.moveName = moveName;
		this.type = type;
		this.moveAttributes = moveAttributes;
	}

	public void addMove(Move move){
		moves.add(move);
	}

	public Set<Move> getMoves(){
		return moves;
	}
}