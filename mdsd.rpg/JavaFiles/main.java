package mdsd.rpg.JavaFiles;


public class main {



    public static void main(String[] args) {
        Game game = new Game();

        while(!game.isFinished()){
            if (game.getTypes().isEmpty() && game.getAttributes().isEmpty()) {
                game.addTypes();
                game.addAttributes();
            }
        }


        //game.addMoves();
        //generateEntities();

    }
}