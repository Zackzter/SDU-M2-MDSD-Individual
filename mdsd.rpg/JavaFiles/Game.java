import java.util.*;

public class Game {    
    private Type type;
    private Set<Attribute> attributes;
    private Attribute attribute;
    private boolean gameFinished;
    //private Move move;

    public Game(){

    }

    public boolean isGameFinished(){
        return gameFinished;
    }

    public void toggleGameFinished(){
        gameFinished = !gameFinished;
    }

    public void addTypes(){
        type = Type.getInstance();
        for(TypeEnum typeName : TypeEnum.values()){
            type.addType(typeName.toString());
        }
        System.out.println(type.getTypes());
        type = null;
    }

    public void addMoves(Attribute... attribute){
        Move moves = Move.getInstance();




        List<AttributeData> attributeDataList = new ArrayList<>(); 
        Set<Attribute> attributes = new HashSet<>();
        //(ember,(power, 45))

        for(MoveEnum mE: MoveEnum.values()){
            MoveData tempMoveData = new MoveData();
            tempMoveData.setMoveName(mE.toString());
            tempMoveData.setType(mE.getType());
            tempMoveData.addAttribute(AttributeData.createAttributeWithStringAndDefaultValues("power"));
            tempMoveData.addAttribute(AttributeData.createAttributeDataWithInt("pp", 25));
            moves.addMove(tempMoveData);
        }

        attributeDataList.add(AttributeData.createAttributeWithStringAndDefaultValues("power"));
        //insert for loop here....next step : (
        //attributeAndValue.put("power", 45);
        //attributeAndValue.put("pp", 25);
        for (Attribute a : attribute){
            attributes.add(a);
        }

        String moveType = "fire"; //might need to check if it exists? 
        // createMove("ember", moveType, attributeAndValue);
        // createMove("watergun", moveType, attributeAndValue);
         
        moves = null;

    }

    // public void createMove(String moveName, String moveType,
    //  Map<String, Number> moveAttributes){
    //     attribute = Attribute.getInstance();
    //     moves = Move.getInstance();

    //     attributes = attribute.addExtendedAttribute(moveAttributes, attributes);
    //     Move move = new MoveData(moveName, moveType, attributes);
    //     moves.addMove(move);
    //     System.out.println(moves.getMoves() + " all the moves now");
    // }

    public void addMoveAttributes(){

    }

    public void addAttributes(){
        attribute = Attribute.getInstance();
        for (AttributeEnum e : AttributeEnum.values()){
            attribute.addAttribute(AttributeData.createAttributeWithStringAndDefaultValues(e.toString()));
        }
        System.out.println(attribute.getAttributes());
    }

    public List<String> getTypes(){
        Type tempType = Type.getInstance();
        List<String> aString = new ArrayList<>();
        
        aString.addAll(tempType.getTypes());

        tempType = null;
        return aString;

    }

    public List<AttributeData> getAttributes(){
        Attribute tempAttribute = Attribute.getInstance();

        List<AttributeData> aAttribute = new ArrayList<>();
        
        aAttribute.addAll(tempAttribute.getAttributes());

        tempAttribute = null;
        return aAttribute;

    }
}