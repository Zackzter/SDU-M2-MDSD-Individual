import java.util.*;
public class Runner{
    public static void main(String[] args) {
        Game game = new Game();

        while(!game.isGameFinished()){
            if (game.getTypes().isEmpty() && game.getAttributes().isEmpty()) {
                game.addTypes();
                game.addAttributes();
                game.addMoves();
                game.addEntity();
                game.addTeam();
                game.addLocation();
            }
            System.out.println("You are in Johto what do you want to do?");
            System.out.println("Fight bitches or die trying?");
            Scanner s = new Scanner(System.in);
            
            while(s.hasNext()){
                String scannerString = s.nextLine();

                if(scannerString.equals("y")){
                    for (Entity entity : game.getTeam().getTeamByName("Rival")) {
                        entity.die();
                    }
                }
            }
        }
    }
}