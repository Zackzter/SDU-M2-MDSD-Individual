package mdsd.rpg.JavaFiles;

enum MoveEnum{
    Ember("fire"), Water_gun("water"), Razor_leaf("grass");

    private String type;

    private MoveEnum(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}