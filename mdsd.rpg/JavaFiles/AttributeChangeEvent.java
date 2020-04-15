public class AttributeChangeEvent{
  private Attribute previousState;
  private Attribute targetState;

  public AttributeChangeEvent(Attribute previousState, Attribute targetState){
    this.previousState = previousState;
    this.targetState = targetState;
  }

  public Attribute getTargetState(){
    return this.targetState;
  }

  public Attribute getPreviousState(){
    return this.previousState;
  }

}
