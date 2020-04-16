import java.util.*;

public class Location {
    private List<String> locations;
    private String currentLocation;

    private Map<String, String> teams;

    private static Location location;    

    private Location(){
        locations = new ArrayList<>();
        teams = new HashMap<>();

    }

    public static Location getInstance(){
        if(location == null){
            location = new Location();
        }
        return location;
    }

    public String getCurrentLocation(){
        return this.currentLocation;
    }

    public void setCurrentLocation(String currentLocation){
        this.currentLocation = currentLocation;
    }

    public void addLocation(String location){
        locations.add(location);
    }

    public void addTeamToLocation(String location, String team){
        if(locations.contains(location)){
            teams.put(location, team);
        }
    }
}