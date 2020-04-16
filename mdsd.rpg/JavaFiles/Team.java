import java.util.*;

public class Team {
    private Map<String, List<Entity>> teams;
    private List<String> teamNames;

    public Team() {
        teams = new HashMap<>();
        teamNames = new ArrayList<>(); 
    }

    public List<Entity> getTeamByName(String name) {
        if (!teams.containsKey(name)) {
            return null;
        }
        return teams.get(name);
    }

    public void addTeamMember(String team, Entity... entity) {
        if (!teams.containsKey(team)) {
            teams.put(team, entityAdder(entity));
            teamNames.add(team);
        } else {
            teams.get(team).addAll(entityAdder(entity));
        }
    }

    public List<Entity> entityAdder(Entity... entity) {
        List<Entity> eList = new ArrayList<>();
        for (Entity entity2 : entity) {
            Entity tempEntity = new Entity(entity2);
            eList.add(tempEntity);
        }
        return eList;
    }

    public Map<String, List<Entity>> getTeams(){
        return teams;
    }

    public List<Entity> getPlayerTeam(){
        return teams.get(teamNames.get(0));
    }
}