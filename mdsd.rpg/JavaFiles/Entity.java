import java.util.*;
public class Entity{
    private String name;
    private String type;
    private EntityState state;
    private List<AttributeData> attribute;
    private List<MoveData> moves;

    public Entity(){
      attribute = new ArrayList<>();
      moves = new ArrayList<>();
    }

    public Entity(Entity e){
      this();
      this.name = e.getName();
      this.type = e.getType();
      this.state = e.getEntityState();
      if(!e.getAttributes().isEmpty())
        this.attribute.addAll(e.getAttributes());
      if(!e.getMoveData().isEmpty())
        this.moves.addAll(e.getMoveData());
    }

    public String getName(){
      return this.name;
    }
    public void setName(String name){
      this.name = name;
    }
    public String getType(){
      return this.type;
    }
    public void setType(String type){
      this.type = type;
    }
    public List<AttributeData> getAttributes(){
      return attribute;
    }

    public EntityState getEntityState(){
      return state;
    }

    public void setEntityState(EntityState state){
      this.state = state;
    }

    public void addAttribute(AttributeData attribute){
      this.attribute.add(attribute);
    }

    public List<MoveData> getMoveData(){
      return moves;
    }

    public List<String> getMoveNameList(){
      List<String> moveNames = new ArrayList<>();
      for (MoveData moveData : getMoveData()) {
          moveNames.add(moveData.getMoveName());
      }
      return moveNames;
    }
    
    public void addMoveData(MoveData moveData){
      moves.add(moveData);
    }
}
