package attestation;


public class Play {
    public static void main(String[] args) {
        Game game = new Game();
        for (int round = 1; round <= 5; round++) {
            game.runGame(round);
            game.printFinalScore();

        }
    }
}





