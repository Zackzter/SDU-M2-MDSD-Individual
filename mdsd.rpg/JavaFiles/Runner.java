import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Game game = new Game();
        setupGame(game);
        Scanner s = new Scanner(System.in);
        int playerEntityNumber = 0;
        Entity playerEntity;
        int health = 50;
        int player_health = 50;
        Random random = new Random();
        boolean gameOver = false;

        playerEntity = addFightingEntity(game, game.getTeam().getPlayerTeam(), playerEntityNumber);
        // TODO: fight against pokemon
        while (!game.isGameFinished()) {
            // TODO: check if player has no more entities
            if(!game.getLocation().getLocations().isEmpty() && !gameOver){
                
                

                int enemyEntityNumber = 0;
                Entity enemyEntity = null;

                // Get current location to fight at
                game.setCurrentLocation(game.getLocation().getLocations().remove(0));
                
                // Get current team to fight against
                game.setCurrentTeam(game.getLocation().getTeams().get(game.getCurrentLocation()));
                System.out.println(game.getCurrentLocation() + ", " + game.getCurrentTeam());

                enemyEntity = addFightingEntity(game, game.getTeam().getTeamByName(game.getCurrentTeam()), enemyEntityNumber);

                System.out.println(game.getBattleEntities());
                
                System.out.println("You are in Johto what do you want to do?");
                System.out.println("Fight or die trying?");
                boolean fight = false;
                String scannerString = s.nextLine();

                if (scannerString.equals("fight")) {
                    fight = !fight;
                    while (fight) {

                        System.out.println(
                                "you are against " + enemyEntity.getName() + " choose your move");
                        boolean playerTurn = true;
                        if(playerTurn){
                            List<String> moves = playerEntity.getMoveNameList();
                            System.out.println(moves);

                            boolean pickMove = true;
                            while (pickMove){  
                                String fS = s.nextLine();
                                
                                if(moves.contains(fS)){
                                    System.out.println("You used "+ fS + "\n");
                                    // TODO: in xtend file use actual hp hihi
                                    health = health - game.getMove().getMove(fS).getMoveAttributes().get(0).getIntValue();
                                    pickMove = !pickMove;
                                    System.out.println("Enemy hp: " + health + "\n");
                                }
                                else{
                                    System.out.println("That's not a possible move!");
                                }
                            }
                        }
                        playerTurn = !playerTurn;
                        if(checkDeath(health)){
                            System.out.println(enemyEntity.getName() + " is dead!");
                            health = 50;
                            enemyEntityNumber++;
                            enemyEntity.setEntityState(EntityState.DEAD);
                            if(!game.getTeam().getTeamByName(game.getCurrentTeam()).isEmpty()){
                                enemyEntity = addFightingEntity(game, game.getTeam().getTeamByName(game.getCurrentTeam()), enemyEntityNumber);
                            }
                            else{
                                fight = !fight;

                            }
                        }
                        else{
                            System.out.println("Enemy Turn...");
                            int move = random.nextInt(enemyEntity.getMoveNameList().size());
                            System.out.println(enemyEntity.getName() + " used " + enemyEntity.getMoveNameList().get(move) + "\n");
                            player_health = player_health - game.getMove().getMove(enemyEntity.getMoveNameList().get(move)).getMoveAttributes().get(0).getIntValue();
                            System.out.println("Player health: " + player_health + "\n");
                            
                            if(checkDeath(player_health)){
                                System.out.println(playerEntity.getName() + " is dead");
                                player_health = 50;
                                playerEntity.setEntityState(EntityState.DEAD);
                                if(!game.getTeam().getPlayerTeam().isEmpty()){
                                    playerEntity = addFightingEntity(game, game.getTeam().getPlayerTeam(), playerEntityNumber);
                                }
                                else{
                                    gameOver = !gameOver;
                                    System.out.println(gameOver);
                                    fight = !fight;
                                }
                            }
                            playerTurn = !playerTurn;
                        }
                    }
                    
                }

            }
            else{
                System.out.println("Fin");
                break;
            }
        }
    }

    public static void setupGame(Game game){

        game.getLocation().setLocations(game.getLocation().getLocations());
        if (game.getTypes().isEmpty() && game.getAttributes().isEmpty()) {
            game.addTypes();
            game.addAttributes();
            game.addMoves();
            game.addEntity();
            game.addTeam();
            game.addLocation();
        }
    }

    public static Entity addFightingEntity(Game game,List<Entity> entities, int entityNumber){
        Entity entity = null;
        if(!entities.isEmpty()){
            entity = entities.remove(0);
        }
        return entity;
    }

    public static boolean checkDeath(int i){
        if (i <= 0){
            return true;
        }
        return false;
    }
}