public class AttributeChangeEvent{
  private AttributeData previousState;
  private AttributeData targetState;

  public AttributeChangeEvent(AttributeData previousState, AttributeData targetState){
    this.previousState = previousState;
    this.targetState = targetState;
  }

  public AttributeData getTargetState(){
    return this.targetState;
  }

  public AttributeData getPreviousState(){
    return this.previousState;
  }

}
