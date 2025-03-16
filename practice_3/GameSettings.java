package practice_3;

public class GameSettings {
    static int maxPlayers = 3;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    void addPlayer() {
        if(maxPlayers > currentPlayers) {
            currentPlayers++;
        }
    }

    void printGameStatus() {
        System.out.println("Game name: " + gameName + ", current number of players: " + currentPlayers + ", max number of players: " + maxPlayers);
    }


    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Chess", 1);
        GameSettings game2 = new GameSettings("Checkers", 0);

        GameSettings.setMaxPlayers(2);
        game1.addPlayer();
        game2.addPlayer();
        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();

    }
}
