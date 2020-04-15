import java.util.*;

public class Game {
    private Zyndaquil zynadaquil;
   // private Set<Move> moves = new HashSet<>();
    
    private Type type;

    private Set<Attribute> attributes;

    private Attribute attribute;
    private Move moves;



    
    public static void main(String[] args) {
        Game game = new Game();
        game.addTypes();
        game.addAttributes();
        //game.addMoves();

    }

    public void addTypes(){
        type = Type.getInsantce();
        for(TypeEnum typeName : TypeEnum.values()){
            type.addType(typeName.toString());
        }
        System.out.println(type.getTypes());
        
    }

    public void addMoves(Attribute... attribute){
        Map<String, Number> attributeAndValue = new HashMap<>(); 
        Set<Attribute> attributes = new HashSet<>();
        
        //insert for loop here....next step : (
        attributeAndValue.put("power", 45);
        attributeAndValue.put("pp", 25);
        for (Attribute a : attribute){
            attributes.add(a);
        }
        String moveType = "fire"; //might need to check if it exists? 
        createMove("ember", moveType, attributeAndValue);
        createMove("watergun", moveType, attributeAndValue);
    }

    public void createMove(String moveName, String moveType, Map<String, Number> moveAttributes){
        attribute = Attribute.getInstance();
        moves = Move.getInstance();

        attributes = attribute.addExtendedAttribute(moveAttributes, attributes);
        Move move = new Move(moveName, moveType, attributes);
        moves.addMove(move);
        System.out.println(moves.getMoves() + " all the moves now");
    }

    public void addMoveAttributes(){

    }

    public void addAttributes(){
        attribute = Attribute.getInstance();
        for (AttributeEnum e : AttributeEnum.values()){
            attribute.addAttribute(e.toString());
        }
        System.out.println(attribute.getAttributes());
    }
}