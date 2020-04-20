import java.util.ArrayList;

public class TypeRelation {

    private ArrayList<String> weakAgainst;
    private ArrayList<String> strongAgainst;

    public TypeRelation(){
        weakAgainst = new ArrayList<>();
        strongAgainst = new ArrayList<>();
    }

    public void addStrongAgainst(String strong){
        strongAgainst.add(strong);
    }

    public void addWeakAgainst(String weak){
        strongAgainst.add(weak);
    }

    public ArrayList<String> getWeakAgainst(){
        return weakAgainst;
    }

    public ArrayList<String> getStrongAgainst(){
        return strongAgainst;
    }

}