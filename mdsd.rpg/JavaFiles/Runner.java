import java.util.*;



public class Runner{



    public static void main(String[] args) {
        Game game = new Game();

        while(!game.isGameFinished()){
            if (game.getTypes().isEmpty() && game.getAttributes().isEmpty()) {
                game.addTypes();
                game.addAttributes();
            }
        }


        //game.addMoves();
        //generateEntities();

    }

}