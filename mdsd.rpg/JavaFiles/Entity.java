public class Entity {
    private String name;
    private String type;
    private List<Attribute> attribute;
    private List<Attribute> changingAttributes;
    private List<MoveData> moves;

    public Entity(){
      attribute = new ArrayList<>();
      moves = new ArrayList<>();
      changingAttributes = new CopyOnWriteArrayList<>();
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
    public List<Attribute> getAttributes(){
      return attributes;
    }
    public void addAttribute(Attribute attribute){
      attribute.add(attribute);
      changingAttributes.add(attribute);
    }
    public List<MoveData> getMoveData(){
      return getMoveData;
    }
    public void addMoveData(MoveData movedata){
      moves.add(moveData);
    }

    public void requestChange(AttributeChangeEvent attribute){
      if(changingAttributes.contains(attribute.previousState())){
        changingAttributes.remove(attribute.previousState());
        changingAttributes.add(attribute.targetState());
      }
    }
}
