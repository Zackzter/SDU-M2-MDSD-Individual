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
                
                System.out.println("You are in Johto what do you want to do?");
                System.out.println("Fight or die trying?");
                boolean fight = false;
                
                // prob make a while loop here so dont get stuck if you don't write fight
                String scannerString = s.nextLine();
                if (scannerString.equals("fight")) {
                    fight = !fight;
                    while (fight) {

                        System.out.println("You are against " + enemyEntity.getName() + " choose your move");
                        
                        // Only needed if more than one entity on the field
                        boolean playerTurn = true;
                        
                        // The player will pick the move to use here
                        if(playerTurn){
                            List<String> moves = playerEntity.getMoveNameList();
                            System.out.println(moves);

                            boolean pickMove = true;
                            while (pickMove){  
                                String moveName = s.nextLine();
                                
                                // Will check that the user writes pick a move which exists
                                if(moves.contains(moveName)){
                                    int power = game.getMove().getMove(moveName).getMoveAttributes().get(0).getIntValue();                                    
                                    System.out.println("You used "+ moveName + "\n");
                                    // TODO: in xtend file use actual hp hihi
                                    health = health - power;
                                    System.out.println("Enemy hp: " + health + "\n");
                                    pickMove = !pickMove;
                                }
                                else{
                                    System.out.println("That's not a possible move!");
                                }
                            }
                        }
                        playerTurn = !playerTurn;

                        // Will check if an enemy entity is dead
                        if(checkDeath(health)){
                            System.out.println(enemyEntity.getName() + " is dead!");
                            health = 50;
                            enemyEntity.setEntityState(EntityState.DEAD);

                            // If the enemy still has entities left, the next one will battle, otherwise the battle with against this team is over.
                            if(!game.getTeam().getTeamByName(game.getCurrentTeam()).isEmpty()){
                                enemyEntity = addFightingEntity(game, game.getTeam().getTeamByName(game.getCurrentTeam()), enemyEntityNumber);
                            }
                            else{
                                fight = !fight;

                            }
                        }

                        // Enemy's turn to pick a move, it is picked randomly
                        else{
                            System.out.println("Enemy Turn...");
                            int move = random.nextInt(enemyEntity.getMoveNameList().size());
                            int enemyPower = game.getMove().getMove(enemyEntity.getMoveNameList().get(move)).getMoveAttributes().get(0).getIntValue();
                            System.out.println(enemyEntity.getName() + " used " + enemyEntity.getMoveNameList().get(move) + "\n");
                            player_health = player_health - enemyPower;
                            System.out.println("Player health: " + player_health + "\n");
                            
                            // It will check if the player's entity is dead
                            if(checkDeath(player_health)){
                                System.out.println("Your " + playerEntity.getName() + " is dead");
                                player_health = 50;
                                playerEntity.setEntityState(EntityState.DEAD);
                                
                                // Will add the next player entity to the fight, if there are no more, it will go to game over
                                if(!game.getTeam().getPlayerTeam().isEmpty()){
                                    playerEntity = addFightingEntity(game, game.getTeam().getPlayerTeam(), playerEntityNumber);
                                }
                                else{
                                    gameOver = !gameOver;
                                    fight = !fight;
                                }
                            }
                            playerTurn = !playerTurn;
                        }
                    }
                    
                }

            }
            else{
                if(!gameOver) System.out.println("Fin");
                else System.out.println("Game Over!");
                break;
            }
        }
    }

    // Will add everything the user has written in the .rpg file
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

    // Will add the entity which will fight
    public static Entity addFightingEntity(Game game,List<Entity> entities, int entityNumber){
        Entity entity = null;
        if(!entities.isEmpty()){
            entity = entities.remove(0);
        }
        return entity;
    }

    // Will check if an entity is dead
    public static boolean checkDeath(int i){
        if (i <= 0){
            return true;
        }
        return false;
    }

}