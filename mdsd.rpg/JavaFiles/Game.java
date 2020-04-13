import java.util.*;

public class Game {
    private Zyndaquil zynadaquil;
    private Set<Move> moves = new HashSet<>();
    
    private Type type;

    private Set<Attribute> attributes;

    private Attribute attribute;



    
    public static void main(String[] args) {
        Game game = new Game();
        game.addTypes();
        game.addAttributes();
        game.addMoveAttributes();

    }

    public void addTypes(){
        type = new Type("fire");

    }

    public void addMoves(Attribute... attribute){
        Set<Attribute> attributes = new HashSet<>();
        for (Attribute a : attribute){
            attributes.add(a);
        }
        moves.add(new Move("ember", type, attributes));
    }

    public void addMoveAttributes(){

    }

    public void addAttributes(){
        attribute = Attribute.getInstance();
        for (AttributeEnum e : AttributeEnum.values()){
            attribute.addAttribute(e.toString());
        }


    }
}