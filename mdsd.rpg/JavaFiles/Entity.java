import java.util.*;
import java.util.concurrent.*;
public class Entity implements Killable{
    private String name;
    private String type;
    private EntityState state;
    private List<AttributeData> attribute;
    private List<AttributeData> changingAttributes;
    private List<MoveData> moves;

    public Entity(){
      attribute = new ArrayList<>();
      moves = new ArrayList<>();
      changingAttributes = new CopyOnWriteArrayList<>();
    }

    public Entity(Entity e){
      this();
      this.name = e.getName();
      this.type = e.getType();
      this.state = e.getEntityState();
      if(!e.getAttributes().isEmpty())
        this.attribute.addAll(e.getAttributes());
      if(!e.getChangingAttributes().isEmpty())
        this.changingAttributes.addAll(e.getChangingAttributes());
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

    public List<AttributeData> getChangingAttributes(){
      return changingAttributes;
    }

    public EntityState getEntityState(){
      return state;
    }

    public void setEntityState(EntityState state){
      this.state = state;
    }

    public void addAttribute(AttributeData attribute){
      this.attribute.add(attribute);
      this.changingAttributes.add(attribute);
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

    public void requestChange(AttributeChangeEvent attribute){
      if(changingAttributes.contains(attribute.getPreviousState())){
        changingAttributes.remove(attribute.getPreviousState());
        changingAttributes.add(attribute.getTargetState());
      }
    }

    @Override
    public void die(){
      state = EntityState.DEAD;
      System.out.println("[" + this.toString() + "] " +  "Ufff I died");
    }

    @Override
    public String toString() {
      
      return this.name;
    }
}
