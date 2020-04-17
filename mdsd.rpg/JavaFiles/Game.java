import java.util.*;
import java.awt.event.*;

public class Game implements KeyListener{
    private Type type;
    private List<Attribute> attributes;
    private Attribute attribute;
    private boolean gameFinished;
    private List<Entity> eList; 
    private List<Entity> battleEntities;
    private Team team;

    private String currentLocation;
    private String currentTeam;

    public Game(){
      eList = new ArrayList<>();
      attributes = new ArrayList<>();
      team = new Team();
      battleEntities = new ArrayList<>();
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

    public void addMoves(){
        Move moves = Move.getInstance();

        for(MoveEnum mE: MoveEnum.values()){
            MoveData tempMoveData = new MoveData();
            tempMoveData.setMoveName(mE.toString());
            tempMoveData.setType(mE.getType());
            tempMoveData.addAttribute(AttributeData.createAttributeWithStringAndDefaultValues("power"));
            tempMoveData.addAttribute(AttributeData.createAttributeDataWithInt("pp", 25));
            moves.addMove(tempMoveData);
        }
        moves = null;
    }

    public Move getMove(){
        return Move.getInstance();
    }

    public void addAttributes(){
        attribute = Attribute.getInstance();
        for (AttributeEnum e : AttributeEnum.values()){
            attribute.addAttribute(AttributeData.createAttributeWithStringAndDefaultValues(e.toString()));
        }
        System.out.println(attribute.getAttributes());
    }

    public void addTeam() {
        Entity zyndaquil = new Entity();
        Entity zotodile = new Entity();

        zyndaquil.setName("zyndaquil");
        zyndaquil.setType("fire");
        zyndaquil.addMoveData(Move.getInstance().getMove("Ember"));


        zotodile.setName("zotodile");
        zotodile.setType("water");
        zotodile.addMoveData(Move.getInstance().getMove("Water_gun"));
        zotodile.addMoveData(Move.getInstance().getMove("Razor_leaf"));


        getAttributes().forEach(element -> zyndaquil.addAttribute(element));
        getAttributes().forEach(element -> zotodile.addAttribute(element));


        team.addTeamMember("Zilver", zyndaquil);
        team.addTeamMember("Zilver", zotodile);
        team.addTeamMember("Rival", zotodile);
        team.addTeamMember("Rival", zyndaquil);
        team.addTeamMember("Red", zotodile);
        team.addTeamMember("Red", zotodile);
    }

    public void addLocation(){
        Location tempLoc = Location.getInstance();
        tempLoc.addLocation("Johto");
        tempLoc.addTeamToLocation("Johto", "Rival");

        tempLoc.addLocation("Kanto");
        tempLoc.addTeamToLocation("Kanto", "Red");
    }

    public Location getLocation(){
        return Location.getInstance();
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

    public void addEntity(){
      String[] types = {"fire", "water", "grass"};
      int index = 0;
      for (EntityEnum ee : EntityEnum.values() ) {
        Entity e = new Entity();
        e.setName(ee.toString());
        e.setType(types[index]);
        Attribute.getInstance().getAttributes().forEach(element -> e.addAttribute(element));
        Move.getInstance().getMoves().forEach(element -> e.addMoveData(element)); 
        eList.add(e);
        if(index<2){
            index++;
        } else {
            index = 0;
        }
      }
    }

    public List<Entity> getEList(){
        return eList;
    }

    public List<Entity> getBattleEntities(){
        return this.battleEntities;
    }

    /**
     * @return the team
     */
    public Team getTeam() {
        return team;
    }

    public String getCurrentLocation(){
        return this.currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getCurrentTeam(){
        return this.currentTeam;
    }

    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
    }

    @Override
    public void keyPressed(KeyEvent e){
        if (e.getKeyChar() == 'x') {
            toggleGameFinished();
        }
    }

    @Override
    public void keyReleased(KeyEvent e){

    }

    @Override
    public void keyTyped(KeyEvent e){

    }
}
