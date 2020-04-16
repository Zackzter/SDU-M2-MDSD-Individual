import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Game game = new Game();
        List<Entity> battleEntities;

        while (!game.isGameFinished()) {
            if (game.getTypes().isEmpty() && game.getAttributes().isEmpty()) {
                game.addTypes();
                game.addAttributes();
                game.addMoves();
                game.addEntity();
                game.addTeam();
                game.addLocation();
            }
            battleEntities = new ArrayList<>();
            for(Entity entity : game.getTeam().getPlayerTeam()){
                battleEntities.add(entity);
                System.out.println("player team: " + battleEntities);
            }

            System.out.println("You are in Johto what do you want to do?");
            System.out.println("Fight bitches or die trying?");
            Scanner s = new Scanner(System.in);
            boolean fight = false;
            String scannerString = s.nextLine();

            if (scannerString.equals("fight")) {
                fight = !fight;
                while (fight) {
                    System.out.println(
                            "you are against " + game.getTeam().getTeamByName("Rival").get(0) + " choose your move");
                    System.out.println(game.getTeam().getTeamByName("Rival").get(0).getMoveData());
                    Scanner fightScanner = new Scanner(System.in);
                    String fS = fightScanner.next();
                    int i = 0;
                    i = game.getEList().get(0).getChangingAttributes().get(0).getIntValue()
                            - game.getMove().getMove(fS).getMoveAttributes().get(0).getIntValue();
                    game.getEList().get(0).getChangingAttributes().get(0).setIntValue(i);
                    fightScanner.nextLine();

                    for (Entity entity : game.getTeam().getTeamByName("Rival")) {
                        entity.die();
                        fight = !fight;
                    }
                }
            }
        }
    }
}